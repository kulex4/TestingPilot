package com.itrex.repository;

import com.itrex.model.EventByDay;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Author: nikolai.pashkevich.
 */
public interface EventByDayRepository extends CrudRepository<EventByDay, Integer> {

    List<EventByDay> findAllByOrderByIdAsc();
}
