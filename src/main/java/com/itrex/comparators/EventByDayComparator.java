package com.itrex.comparators;

import com.itrex.model.eventbyday.EventByDay;
import com.itrex.model.eventbyday.EventByDayExpected;
import com.itrex.service.eventbyday.EventByDayExpectedService;
import com.itrex.service.eventbyday.EventByDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Iterator;

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
    public void compare() {
        Iterable<EventByDay> eventByDays = eventByDayService.findAllByOrderByIdAsc();
        Iterable<EventByDayExpected> eventByDayExpecteds = eventByDayExpectedService.findAllByOrderByIdAsc();

        Iterator<EventByDay> eventByDayIterator = eventByDays.iterator();
        Iterator<EventByDayExpected> eventByDayExpectedIterator = eventByDayExpecteds.iterator();

        if (eventByDayIterator.hasNext() && eventByDayExpectedIterator.hasNext()) {
            EventByDayExpected curEventByDayExpected = eventByDayExpectedIterator.next();
            EventByDay curEventByDay = eventByDayIterator.next();
            while (true) {
                if (curEventByDayExpected.getId() == (curEventByDay.getId())) {
                    //// TODO: тут проверка свойств объектов
                    String str = curEventByDayExpected.getNotEqualsString(curEventByDay);
                    if (str.length() > 0) {
                        System.out.println(curEventByDayExpected.getId()+ " " + str);
                    } else {
                        System.out.println(curEventByDayExpected.getId() + " = " + curEventByDay.getId());
                    }
                    if (eventByDayIterator.hasNext() && eventByDayExpectedIterator.hasNext()) {
                        curEventByDay = eventByDayIterator.next();
                        curEventByDayExpected = eventByDayExpectedIterator.next();
                    } else {
                        break;
                    }
                } else if (curEventByDayExpected.getId() < (curEventByDay.getId())) {
                    //// TODO: тут выводим что у нас в Actual нету такого объекта и берем next Expected
                    System.out.println(curEventByDayExpected.getId() + " < " + curEventByDay.getId());
                    if (eventByDayIterator.hasNext()) {
                        curEventByDayExpected = eventByDayExpectedIterator.next();
                    } else {
                        break;
                    }
                } else {
                    //// TODO: тут выводим что у нас в Expected нету такого объекта и берем next Actual
                    System.out.println(curEventByDayExpected.getId() + " > " + curEventByDay.getId());
                    if (eventByDayIterator.hasNext()) {
                        curEventByDay = eventByDayIterator.next();
                    } else {
                        break;
                    }
                }
            }
        }
    }
}
