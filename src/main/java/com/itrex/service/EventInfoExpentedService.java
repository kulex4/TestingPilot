package com.itrex.service;

import com.itrex.model.EventInfoExpented;

/**
 * Created by ITRex-User on 3/21/2016.
 */
public interface EventInfoExpentedService {
    void insert(EventInfoExpented eventInfo);
    void remove(EventInfoExpented eventInfo);
    Iterable<EventInfoExpented> findAllByOrderByIdAsc();
}
