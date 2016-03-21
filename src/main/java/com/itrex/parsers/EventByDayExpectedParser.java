package com.itrex.parsers;

import com.itrex.model.eventbyday.EventByDayExpected;
import com.itrex.service.eventbyday.EventByDayExpectedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Author: nikolai.pashkevich.
 */
@Component
public class EventByDayExpectedParser extends AbstractEventParser<EventByDayExpected> {

    @Autowired
    private EventByDayExpectedService eventByDayExpectedService;

    @Override
    public void parseAndSaveEventsFromCsvFile(String filePath) {
        List<EventByDayExpected> eventByDaysList = readAndParseCsvFile(filePath);
        saveEventsInDatabase(eventByDaysList, eventByDayExpectedService);
    }

    @Override
    public EventByDayExpected parseLine(String[] line) {
        EventByDayExpected eventByDayExpected = new EventByDayExpected();
        eventByDayExpected.setId(Integer.parseInt(line[0]));
        eventByDayExpected.setTimeBtwFstLstEventOfDay(getDoubleValue(line[1]));
        eventByDayExpected.setTSL_EventOfDay(getDoubleValue(line[2]));
        eventByDayExpected.setTSF_EventOfDay(getDoubleValue(line[3]));
        eventByDayExpected.setAvgDistBtwPlEventsInDay(getDoubleValue(line[4]));
        eventByDayExpected.setMaxDistBtwPlEventsInDay(getDoubleValue(line[5]));
        eventByDayExpected.setMinDistBtwPlEventsInDay(getDoubleValue(line[6]));
        eventByDayExpected.setAvgDistBtwPl_X_EventsInDay(getDoubleValue(line[7]));
        eventByDayExpected.setMaxDistBtwPl_X_EventsInDay(getDoubleValue(line[8]));
        eventByDayExpected.setMinDistBtwPl_X_EventsInDay(getDoubleValue(line[9]));
        eventByDayExpected.setAvgDistBtwEventIncdntInDay(getDoubleValue(line[10]));
        eventByDayExpected.setMaxDistBtwEventIncdntInDay(getDoubleValue(line[11]));
        eventByDayExpected.setMinDistBtwEventIncdntInDay(getDoubleValue(line[12]));
        eventByDayExpected.setAvgTimeBtwEventIncdntInDay(getDoubleValue(line[13]));
        eventByDayExpected.setMaxTimeBtwEventIncdntInDay(getDoubleValue(line[14]));
        eventByDayExpected.setMinTimeBtwEventIncdntInDay(getDoubleValue(line[15]));
        eventByDayExpected.setVelocity_var(getDoubleValue(line[16]));
        eventByDayExpected.setGMAX_VAR(getDoubleValue(line[17]));
        return eventByDayExpected;
    }

    private Double getDoubleValue(String str) {
        if (str == null || str.isEmpty()) {
            return 0D;
        } else {
            return Double.parseDouble(str);
        }
    }
}
