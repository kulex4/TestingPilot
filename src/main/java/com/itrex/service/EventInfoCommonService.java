package com.itrex.service;

/**
 * Author: nikolai.pashkevich.
 */
public interface EventInfoCommonService<T> {
    void insert(T event);
    void remove(T event);
    Iterable<T> findAllByOrderByIdAsc();
}
