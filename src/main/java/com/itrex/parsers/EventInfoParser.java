package com.itrex.parsers;

import com.itrex.model.EventInfo;
import com.itrex.service.EventInfoService;
import com.itrex.utils.DateFormatHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Author: nikolai.pashkevich.
 */
@Component
public class EventInfoParser extends AbstractEventParser<EventInfo> {

    @Autowired
    private EventInfoService eventInfoService;

    public SimpleDateFormat formatter = new SimpleDateFormat("ddMMMyy:HH:mm:ss", DateFormatHelper.getDateFormatSymbols());

    @Override
    public void parseAndSaveEventsFromCsvFile(String filePath) {
        List<EventInfo> eventInfoList = readAndParseCsvFile(filePath);
        saveEventsInDatabase(eventInfoList);
    }

    @Override
    public EventInfo parseLine(String[] line) {
        EventInfo eventInfo = new EventInfo();
        try {
            eventInfo.setDatetime_var(formatter.parse(line[3]));
        } catch (ParseException e) {
            log.error("Error while parsing date: ", e);
            return null;
        }
        eventInfo.setId(line[0]);
        eventInfo.setBlock_group(line[1]);
        eventInfo.setEvent_type(line[2]);
        eventInfo.setShift(line[4]);
        eventInfo.setWeekEnd_v1("1".equals(line[5]));
        eventInfo.setWeekEnd_v2("1".equals(line[6]));
        eventInfo.setHoliday_indicator_1("1".equals(line[7]));
        eventInfo.setHoliday_indicator_2("1".equals(line[8]));
        eventInfo.setDailyEventCountType_ALL(Integer.parseInt(line[9]));
        return eventInfo;
    }

    @Override
    public void saveEventsInDatabase(List<EventInfo> events) {
        for (EventInfo eventInfo : events) {
            eventInfoService.insert(eventInfo);
        }
    }
}
