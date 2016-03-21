package com.itrex.service.eventinfo;

import com.itrex.model.eventinfo.EventInfoExpected;
import com.itrex.repository.EventInfoExpectedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by ITRex-User on 3/21/2016.
 */
@Transactional
@Service("eventInfoExpectedService")
public class EventInfoExpectedServiceImpl implements EventInfoExpectedService {

    private EventInfoExpectedRepository eventInfoExpectedRepository;

    @Autowired
    public EventInfoExpectedServiceImpl(EventInfoExpectedRepository eventInfoExpectedRepository) {
        this.eventInfoExpectedRepository = eventInfoExpectedRepository;
    }

    @Override
    public void insert(EventInfoExpected eventInfo) {
        eventInfoExpectedRepository.save(eventInfo);
    }

    @Override
    public void remove(EventInfoExpected eventInfo) {
        eventInfoExpectedRepository.delete(eventInfo);
    }

    @Override
    public Iterable<EventInfoExpected> findAllByOrderByIdAsc() {
        return eventInfoExpectedRepository.findAllByOrderByIdAsc();
    }
}
