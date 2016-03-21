package com.itrex.repository;


import com.itrex.model.EventByDay;
import com.itrex.model.EventInfoExpented;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by ITRex-User on 3/21/2016.
 */
public interface EventInfoExpentedRepository extends CrudRepository<EventInfoExpented, String> {

    List<EventInfoExpented> findAllByOrderByIdAsc();
}
