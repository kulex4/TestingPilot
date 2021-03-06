package com.itrex.repository;

import com.itrex.model.eventinfo.EventInfo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Author: nikolai.pashkevich.
 */
public interface EventInfoRepository extends CrudRepository<EventInfo, String> {

    List<EventInfo> findAllByOrderByIdAsc();
}
