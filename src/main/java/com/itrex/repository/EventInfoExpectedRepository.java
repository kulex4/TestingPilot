package com.itrex.repository;


import com.itrex.model.eventinfo.EventInfoExpected;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by ITRex-User on 3/21/2016.
 */
public interface EventInfoExpectedRepository extends CrudRepository<EventInfoExpected, String> {
    List<EventInfoExpected> findAllByOrderByIdAsc();
}
