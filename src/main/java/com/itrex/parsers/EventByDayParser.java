package com.itrex.parsers;

import com.itrex.model.eventbyday.EventByDay;
import com.itrex.service.eventbyday.EventByDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Author: nikolai.pashkevich.
 */
@Component
public class EventByDayParser extends AbstractEventParser<EventByDay> {

    @Autowired
    private EventByDayService eventByDayService;

    @Override
    public void parseAndSaveEventsFromCsvFile(String filePath) {
        List<EventByDay> eventByDaysList = readAndParseCsvFile(filePath);
        saveEventsInDatabase(eventByDaysList, eventByDayService);
    }

    @Override
    public EventByDay parseLine(String[] line) {
        EventByDay eventByDay = new EventByDay();
        eventByDay.setId(Integer.parseInt(line[0]));
        eventByDay.setTimeBtwFstLstEventOfDay(getDoubleValue(line[1]));
        eventByDay.setTSL_EventOfDay(getDoubleValue(line[2]));
        eventByDay.setTSF_EventOfDay(getDoubleValue(line[3]));
        eventByDay.setAvgDistBtwPlEventsInDay(getDoubleValue(line[4]));
        eventByDay.setMaxDistBtwPlEventsInDay(getDoubleValue(line[5]));
        eventByDay.setMinDistBtwPlEventsInDay(getDoubleValue(line[6]));
        eventByDay.setAvgDistBtwPl_X_EventsInDay(getDoubleValue(line[7]));
        eventByDay.setMaxDistBtwPl_X_EventsInDay(getDoubleValue(line[8]));
        eventByDay.setMinDistBtwPl_X_EventsInDay(getDoubleValue(line[9]));
        eventByDay.setAvgDistBtwEventIncdntInDay(getDoubleValue(line[10]));
        eventByDay.setMaxDistBtwEventIncdntInDay(getDoubleValue(line[11]));
        eventByDay.setMinDistBtwEventIncdntInDay(getDoubleValue(line[12]));
        eventByDay.setAvgTimeBtwEventIncdntInDay(getDoubleValue(line[13]));
        eventByDay.setMaxTimeBtwEventIncdntInDay(getDoubleValue(line[14]));
        eventByDay.setMinTimeBtwEventIncdntInDay(getDoubleValue(line[15]));
        eventByDay.setVelocity_var(getDoubleValue(line[16]));
        eventByDay.setGMAX_VAR(getDoubleValue(line[17]));
        return eventByDay;
    }

    private Double getDoubleValue(String str) {
        if (str == null || str.isEmpty()) {
            return 0D;
        } else {
            return Double.parseDouble(str);
        }
    }
}
