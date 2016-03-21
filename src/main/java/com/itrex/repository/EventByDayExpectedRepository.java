package com.itrex.repository;

import com.itrex.model.eventbyday.EventByDayExpected;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Author: nikolai.pashkevich.
 */
public interface EventByDayExpectedRepository extends CrudRepository<EventByDayExpected, Integer> {
    List<EventByDayExpected> findAllByOrderByIdAsc();
}
