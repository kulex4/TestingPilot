package com.itrex.service.eventbyday;

import com.itrex.model.eventbyday.EventByDay;
import com.itrex.repository.EventByDayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Author: nikolai.pashkevich.
 */
@Transactional
@Service("eventByDayService")
public class EventByDayServiceImpl implements EventByDayService {

    private EventByDayRepository eventByDayRepository;

    @Autowired
    public EventByDayServiceImpl(EventByDayRepository eventByDayRepository) {
        this.eventByDayRepository = eventByDayRepository;
    }

    @Override
    public void insert(EventByDay eventByDay) {
        eventByDayRepository.save(eventByDay);
    }

    @Override
    public void remove(EventByDay eventByDay) {
        eventByDayRepository.delete(eventByDay);
    }

    @Override
    public Iterable<EventByDay> findAllByOrderByIdAsc() {
        return eventByDayRepository.findAllByOrderByIdAsc();
    }
}
