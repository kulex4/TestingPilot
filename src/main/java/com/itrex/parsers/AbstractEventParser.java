package com.itrex.parsers;

import com.opencsv.CSVReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: nikolai.pashkevich.
 */
public abstract class AbstractEventParser<T> implements EventParser<T> {

    public static final Logger log = LoggerFactory.getLogger(EventInfoParser.class);

    public List<T> readAndParseCsvFile(String filePath) {
        List<T> events = new ArrayList<>();
        CSVReader reader = null;
        try {
            reader = new CSVReader(new FileReader(filePath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String [] nextLine;
        try {
            boolean notFirstLine = false;
            if (reader != null) {
                while ((nextLine = reader.readNext()) != null) {
                    if (notFirstLine) {
                        T event = parseLine(nextLine);
                        events.add(event);
                    }
                    notFirstLine = true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return events;
    }

    public abstract T parseLine(String[] line);

}
