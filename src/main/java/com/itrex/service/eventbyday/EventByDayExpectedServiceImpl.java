package com.itrex.service.eventbyday;

import com.itrex.model.eventbyday.EventByDayExpected;
import com.itrex.repository.EventByDayExpectedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Author: nikolai.pashkevich.
 */
@Transactional
@Service("eventByDayExpectedService")
public class EventByDayExpectedServiceImpl implements EventByDayExpectedService {

    private EventByDayExpectedRepository eventByDayExpectedRepository;

    @Autowired
    public EventByDayExpectedServiceImpl(EventByDayExpectedRepository eventByDayExpectedRepository) {
        this.eventByDayExpectedRepository = eventByDayExpectedRepository;
    }

    @Override
    public void insert(EventByDayExpected event) {
        eventByDayExpectedRepository.save(event);
    }

    @Override
    public void remove(EventByDayExpected event) {
        eventByDayExpectedRepository.delete(event);
    }

    @Override
    public Iterable<EventByDayExpected> findAllByOrderByIdAsc() {
        return eventByDayExpectedRepository.findAllByOrderByIdAsc();
    }
}
