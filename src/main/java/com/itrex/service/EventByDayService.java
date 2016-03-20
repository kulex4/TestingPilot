package com.itrex.service;

import com.itrex.model.EventByDay;

/**
 * Author: nikolai.pashkevich.
 */
public interface EventByDayService {
    void insert(EventByDay eventByDay);
    void remove(EventByDay eventByDay);
    Iterable<EventByDay> findAllEventByDays();
}
