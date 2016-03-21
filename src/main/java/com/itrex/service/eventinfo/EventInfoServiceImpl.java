package com.itrex.service.eventinfo;

import com.itrex.model.eventinfo.EventInfo;
import com.itrex.repository.EventInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Author: nikolai.pashkevich.
 */
@Transactional
@Service("eventInfoService")
public class EventInfoServiceImpl implements EventInfoService {

    private EventInfoRepository eventInfoRepository;

    @Autowired
    public EventInfoServiceImpl(EventInfoRepository eventInfoRepository) {
        this.eventInfoRepository = eventInfoRepository;
    }

    @Override
    public void insert(EventInfo eventInfo) {
        eventInfoRepository.save(eventInfo);
    }

    @Override
    public void remove(EventInfo eventInfo) {
        eventInfoRepository.delete(eventInfo);
    }

    @Override
    public Iterable<EventInfo> findAllByOrderByIdAsc() {
        return eventInfoRepository.findAllByOrderByIdAsc();
    }

}
