package com.itrex.parsers;

import java.util.List;

/**
 * Author: nikolai.pashkevich.
 */
public interface EventParser<T> {
    void parseAndSaveEventsFromCsvFile(String filePath);
    T parseLine(String[] line);
    void saveEventsInDatabase(List<T> events);
}
