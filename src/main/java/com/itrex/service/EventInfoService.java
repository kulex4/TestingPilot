package com.itrex.service;

import com.itrex.model.EventInfo;

/**
 * Author: nikolai.pashkevich.
 */
public interface EventInfoService {
    void insert(EventInfo eventInfo);
    void remove(EventInfo eventInfo);
    Iterable<EventInfo> findAllEventInfos();
}
