package com.itrex.comparators;

import com.itrex.model.eventbyday.EventByDay;
import com.itrex.model.eventbyday.EventByDayExpected;
import com.itrex.service.eventbyday.EventByDayExpectedService;
import com.itrex.service.eventbyday.EventByDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Author: nikolai.pashkevich.
 */
@Component
public class EventByDayComparator implements EventComparator {

    @Autowired
    private EventByDayService eventByDayService;

    @Autowired
    private EventByDayExpectedService eventByDayExpectedService;

    @Override
    public List<String> compare() {
        List<String> reportRows = new ArrayList<>();
        Iterable<EventByDay> eventByDays = eventByDayService.findAllByOrderByIdAsc();
        Iterable<EventByDayExpected> eventByDayExpecteds = eventByDayExpectedService.findAllByOrderByIdAsc();

        Iterator<EventByDay> eventByDayIterator = eventByDays.iterator();
        Iterator<EventByDayExpected> eventByDayExpectedIterator = eventByDayExpecteds.iterator();

        if (eventByDayIterator.hasNext() && eventByDayExpectedIterator.hasNext()) {
            EventByDayExpected curEventByDayExpected = eventByDayExpectedIterator.next();
            EventByDay curEventByDay = eventByDayIterator.next();
            while (true) {
                if (curEventByDayExpected.getId() == (curEventByDay.getId())) {
                    String str = curEventByDayExpected.getNotEqualsString(curEventByDay);
                    String row;
                    if (str.length() > 0) {
                        row = "Not the same objects with id=" + curEventByDayExpected.getId() + ", difference: " + str;
                    } else {
                        row = "Actual list contains same EventByDay as in expected list, id=" + curEventByDayExpected.getId();
                    }
                    reportRows.add(row);
                    if (eventByDayIterator.hasNext() && eventByDayExpectedIterator.hasNext()) {
                        curEventByDay = eventByDayIterator.next();
                        curEventByDayExpected = eventByDayExpectedIterator.next();
                    } else {
                        break;
                    }
                } else if (curEventByDayExpected.getId() < (curEventByDay.getId())) {
                    reportRows.add("There is no EventByDay with id=" + curEventByDayExpected.getId() + " in actual list");
                    if (eventByDayIterator.hasNext()) {
                        curEventByDayExpected = eventByDayExpectedIterator.next();
                    } else {
                        break;
                    }
                } else {
                    reportRows.add("There is no EventByDay with id=" + curEventByDay.getId() + " in expected list");
                    if (eventByDayIterator.hasNext()) {
                        curEventByDay = eventByDayIterator.next();
                    } else {
                        break;
                    }
                }
            }
        }
        return reportRows;
    }
}
