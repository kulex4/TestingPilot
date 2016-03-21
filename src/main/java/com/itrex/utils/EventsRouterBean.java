package com.itrex.utils;

import com.itrex.parsers.EventByDayExpectedParser;
import com.itrex.parsers.EventByDayParser;
import com.itrex.parsers.EventInfoExpectedParser;
import com.itrex.parsers.EventInfoParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Author: nikolai.pashkevich.
 */
@Component
public class EventsRouterBean {

    private static final String INFO_EVENTS_FLAG = "info";
    private static final String BY_DAY_EVENTS_FLAG = "by_day";
    private static final String EXPECTED_FLAG = "expected";

    @Autowired
    private EventInfoParser eventInfoParser;

    @Autowired
    private EventInfoExpectedParser eventInfoExpectedParser;

    @Autowired
    private EventByDayParser eventByDayParser;

    @Autowired
    private EventByDayExpectedParser eventByDayExpectedParser;

    public void chooseParserByFilePath(String filePath) {
        if (filePath.contains(INFO_EVENTS_FLAG)) {
            if (filePath.contains(EXPECTED_FLAG)) {
                eventInfoExpectedParser.parseAndSaveEventsFromCsvFile(filePath);
            } else {
                eventInfoParser.parseAndSaveEventsFromCsvFile(filePath);
            }
        } else if (filePath.contains(BY_DAY_EVENTS_FLAG)) {
            if (filePath.contains(EXPECTED_FLAG)) {
                eventByDayExpectedParser.parseAndSaveEventsFromCsvFile(filePath);
            } else {
                eventByDayParser.parseAndSaveEventsFromCsvFile(filePath);
            }
        }
    }

}
