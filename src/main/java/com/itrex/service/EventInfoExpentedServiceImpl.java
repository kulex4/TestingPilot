package com.itrex.service;

import com.itrex.model.EventInfo;
import com.itrex.model.EventInfoExpented;
import com.itrex.repository.EventInfoExpentedRepository;
import com.itrex.repository.EventInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by ITRex-User on 3/21/2016.
 */
@Transactional
@Service("eventInfoExpentedService")
public class EventInfoExpentedServiceImpl implements EventInfoExpentedService {

    private EventInfoExpentedRepository eventInfoExpentedRepository;

    @Autowired
    public EventInfoExpentedServiceImpl(EventInfoExpentedRepository eventInfoExpentedRepository) {
        this.eventInfoExpentedRepository = eventInfoExpentedRepository;
    }

    @Override
    public void insert(EventInfoExpented eventInfo) {
        eventInfoExpentedRepository.save(eventInfo);
    }

    @Override
    public void remove(EventInfoExpented eventInfo) {
        eventInfoExpentedRepository.delete(eventInfo);
    }

    @Override
    public Iterable<EventInfoExpented> findAllByOrderByIdAsc() {
        return eventInfoExpentedRepository.findAllByOrderByIdAsc();
    }
}
