package com.itrex.comparators;

import com.itrex.model.eventinfo.EventInfo;
import com.itrex.model.eventinfo.EventInfoExpected;
import com.itrex.service.eventinfo.EventInfoExpectedService;
import com.itrex.service.eventinfo.EventInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by ITRex-User on 3/21/2016.
 */
@Component
public class EventInfoComparator implements EventComparator {

    @Autowired
    private EventInfoService eventInfoService;

    @Autowired
    private EventInfoExpectedService eventInfoExpectedService;

    public List<String> compare() {
        List<String> reportRows = new ArrayList<>();
        Iterable<EventInfo> eventInfos = eventInfoService.findAllByOrderByIdAsc();
        Iterable<EventInfoExpected> eventInfoExpecteds = eventInfoExpectedService.findAllByOrderByIdAsc();

        Iterator<EventInfo> eventInfoIterator = eventInfos.iterator();
        Iterator<EventInfoExpected> eventInfoExpentedIterator = eventInfoExpecteds.iterator();

        if (eventInfoExpentedIterator.hasNext() && eventInfoExpentedIterator.hasNext()) {
            EventInfoExpected curEventInfoExpected = eventInfoExpentedIterator.next();
            EventInfo curEventInfo = eventInfoIterator.next();
            while (true) {
                if (curEventInfoExpected.getId().equals(curEventInfo.getId())) {
                    String str = curEventInfoExpected.getNotEqualsString(curEventInfo);
                    String row;
                    if (str.length() > 0) {
                        row = "Not the same objects with id=" + curEventInfoExpected.getId() + ", difference: " + str;
                    } else {
                        row = "Actual list contains same EventByDay as in expected list, id=" + curEventInfoExpected.getId();
                    }
                    reportRows.add(row);
                    if (eventInfoIterator.hasNext() && eventInfoExpentedIterator.hasNext()) {
                        curEventInfo = eventInfoIterator.next();
                        curEventInfoExpected = eventInfoExpentedIterator.next();
                    } else {
                        break;
                    }
                } else if (curEventInfoExpected.getId().compareTo(curEventInfo.getId()) < 0) {
                    reportRows.add("There is no EventByDay with id=" + curEventInfoExpected.getId() + " in actual list");
                    if (eventInfoIterator.hasNext()) {
                        curEventInfoExpected = eventInfoExpentedIterator.next();
                    } else {
                        break;
                    }
                } else {
                    reportRows.add("There is no EventByDay with id=" + curEventInfo.getId() + " in expected list");
                    if (eventInfoIterator.hasNext()) {
                        curEventInfo = eventInfoIterator.next();
                    } else {
                        break;
                    }
                }
            }
        }
        return reportRows;
    }
}
