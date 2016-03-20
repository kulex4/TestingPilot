package com.itrex.utils;

import com.itrex.parsers.EventByDayParser;
import com.itrex.parsers.EventInfoParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Author: nikolai.pashkevich.
 */
@Component
public class EventsRouterBean {

    public static final String INFO_EVENTS_FLAG = "info";
    public static final String BY_DAY_EVENTS_FLAG = "by_day";
    public static final String EXPECTED_FLAG = "expected";

    @Autowired
    private EventInfoParser eventInfoParser;

    @Autowired
    private EventByDayParser eventByDayParser;

    public void chooseParserByFilePath(String filePath) {
        if (filePath.contains(INFO_EVENTS_FLAG)) {
            if (filePath.contains(EXPECTED_FLAG)) {
                eventInfoParser.parseAndSaveEventsFromCsvFile(filePath);
            } else {
                eventInfoParser.parseAndSaveEventsFromCsvFile(filePath);
            }
        } else if (filePath.contains(BY_DAY_EVENTS_FLAG)) {
            if (filePath.contains(EXPECTED_FLAG)) {
                eventByDayParser.parseAndSaveEventsFromCsvFile(filePath);
            } else {
                eventByDayParser.parseAndSaveEventsFromCsvFile(filePath);
            }
        }
    }

}
