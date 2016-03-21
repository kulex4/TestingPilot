package com.itrex.comparators;

import com.itrex.model.eventinfo.EventInfo;
import com.itrex.model.eventinfo.EventInfoExpected;
import com.itrex.service.eventinfo.EventInfoExpectedService;
import com.itrex.service.eventinfo.EventInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Iterator;

/**
 * Created by ITRex-User on 3/21/2016.
 */
@Component
public class EventInfoComparator {

    @Autowired
    private EventInfoService eventInfoService;

    @Autowired
    private EventInfoExpectedService eventInfoExpectedService;

    public void compare() {
        Iterable<EventInfo> eventInfos = eventInfoService.findAllByOrderByIdAsc();
        Iterable<EventInfoExpected> eventInfoExpecteds = eventInfoExpectedService.findAllByOrderByIdAsc();

        Iterator<EventInfo> eventInfoIterator = eventInfos.iterator();
        Iterator<EventInfoExpected> eventInfoExpentedIterator = eventInfoExpecteds.iterator();

        if (eventInfoExpentedIterator.hasNext() && eventInfoExpentedIterator.hasNext()) {
            EventInfoExpected curEventInfoExpected = eventInfoExpentedIterator.next();
            EventInfo curEventInfo = eventInfoIterator.next();
            while (true) {
                if (curEventInfoExpected.getId().equals(curEventInfo.getId())) {
                    //// TODO: тут проверка свойств объектов
                    String str = curEventInfoExpected.getNotEqualsString(curEventInfo);
                    if (str.length() > 0) {
                        System.out.println(str);
                    } else {
                        System.out.println(curEventInfoExpected.getId() + " = " + curEventInfo.getId());
                    }
                    if (eventInfoIterator.hasNext() && eventInfoExpentedIterator.hasNext()) {
                        curEventInfo = eventInfoIterator.next();
                        curEventInfoExpected = eventInfoExpentedIterator.next();
                    } else {
                        break;
                    }
                } else if (curEventInfoExpected.getId().compareTo(curEventInfo.getId()) < 0) {
                    //// TODO: тут выводим что у нас в Actual нету такого объекта и берем next Expected
                    System.out.println(curEventInfoExpected.getId() + " < " + curEventInfo.getId());
                    if (eventInfoIterator.hasNext()) {
                        curEventInfoExpected = eventInfoExpentedIterator.next();
                    } else {
                        break;
                    }
                } else {
                    //// TODO: тут выводим что у нас в Expected нету такого объекта и берем next Actual
                    System.out.println(curEventInfoExpected.getId() + " > " + curEventInfo.getId());
                    if (eventInfoIterator.hasNext()) {
                        curEventInfo = eventInfoIterator.next();
                    } else {
                        break;
                    }
                }
            }
        }
    }
}
