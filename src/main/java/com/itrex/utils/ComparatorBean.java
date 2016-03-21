package com.itrex.utils;

import com.itrex.model.EventInfo;
import com.itrex.model.EventInfoExpented;
import com.itrex.service.EventInfoExpentedService;
import com.itrex.service.EventInfoService;
import org.hibernate.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.PrintWriter;
import java.util.Iterator;

/**
 * Created by ITRex-User on 3/21/2016.
 */
@Component
public class ComparatorBean {

    private static final Logger log = LoggerFactory.getLogger(ComparatorBean.class);

    @Autowired
    private EventInfoService eventInfoService;

    @Autowired
    private EventInfoExpentedService eventInfoExpentedService;

    public void compare(){
        Iterable<EventInfo> eventInfos = eventInfoService.findAllByOrderByIdAsc();
        Iterable<EventInfoExpented> eventInfoExpenteds = eventInfoExpentedService.findAllByOrderByIdAsc();
        Iterator<EventInfo> eventInfoIterator = eventInfos.iterator();
        Iterator<EventInfoExpented> eventInfoExpentedIterator = eventInfoExpenteds.iterator();
        EventInfo curEventInfo;
        EventInfoExpented curEventInfoExpented;
        if(eventInfoExpentedIterator.hasNext() && eventInfoExpentedIterator.hasNext()){
            curEventInfoExpented = eventInfoExpentedIterator.next();
            curEventInfo = eventInfoIterator.next();
            while (true){
                if(curEventInfoExpented.getId().equals(curEventInfo.getId())){
                    //// TODO: тут проверка свойств объектов
                    String str = curEventInfoExpented.getNotEqualsString(curEventInfo);
                    if(str.length() > 0){
                        System.out.println(str);
                    } else {
                        System.out.println(curEventInfoExpented.getId() + " = " + curEventInfo.getId());
                    }
                    if(eventInfoIterator.hasNext() && eventInfoExpentedIterator.hasNext()){
                        curEventInfo = eventInfoIterator.next();
                        curEventInfoExpented = eventInfoExpentedIterator.next();
                    } else {
                        break;
                    }
                } else if(curEventInfoExpented.getId().compareTo(curEventInfo.getId()) < 0){
                    //// TODO: тут выводим что у нас в Actual нету такого объекта и берем next Expected
                    System.out.println(curEventInfoExpented.getId() + " < " + curEventInfo.getId());
                    if(eventInfoIterator.hasNext()){
                        curEventInfoExpented = eventInfoExpentedIterator.next();
                    } else {
                        break;
                    }
                } else {
                    //// TODO: тут выводим что у нас в Expected нету такого объекта и берем next Actual
                    System.out.println(curEventInfoExpented.getId() + " > " + curEventInfo.getId());
                    if(eventInfoIterator.hasNext()){
                        curEventInfo = eventInfoIterator.next();
                    } else {
                        break;
                    }
                }
            }
        }
    }

}
