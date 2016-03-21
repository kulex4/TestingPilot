package com.itrex.parsers;

import com.itrex.model.eventinfo.EventInfoExpected;
import com.itrex.service.eventinfo.EventInfoExpectedService;
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
public class EventInfoExpectedParser extends AbstractEventParser<EventInfoExpected> {

    @Autowired
    private EventInfoExpectedService eventInfoExpectedService;

    private SimpleDateFormat formatter = new SimpleDateFormat("ddMMMyy:HH:mm:ss", DateFormatHelper.getDateFormatSymbols());

    @Override
    public void parseAndSaveEventsFromCsvFile(String filePath) {
        List<EventInfoExpected> eventInfoList = readAndParseCsvFile(filePath);
        saveEventsInDatabase(eventInfoList, eventInfoExpectedService);
    }

    @Override
    public EventInfoExpected parseLine(String[] line) {
        EventInfoExpected eventInfoExpected = new EventInfoExpected();
        try {
            eventInfoExpected.setDatetime_var(formatter.parse(line[3]));
        } catch (ParseException e) {
            log.error("Error while parsing date: ", e);
            return null;
        }
        eventInfoExpected.setId(line[0]);
        eventInfoExpected.setBlock_group(line[1]);
        eventInfoExpected.setEvent_type(line[2]);
        eventInfoExpected.setShift(line[4]);
        eventInfoExpected.setWeekEnd_v1("1".equals(line[5]));
        eventInfoExpected.setWeekEnd_v2("1".equals(line[6]));
        eventInfoExpected.setHoliday_indicator_1("1".equals(line[7]));
        eventInfoExpected.setHoliday_indicator_2("1".equals(line[8]));
        eventInfoExpected.setDailyEventCountType_ALL(Integer.parseInt(line[9]));
        return eventInfoExpected;
    }
}
