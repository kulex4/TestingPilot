package com.itrex.parsers;

/**
 * Author: nikolai.pashkevich.
 */
public interface EventParser<T> {
    void parseAndSaveEventsFromCsvFile(String filePath);
    T parseLine(String[] line);
}
