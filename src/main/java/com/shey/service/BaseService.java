package com.shey.service;

import java.util.List;

public interface BaseService<T> {
    List<T> getList();

    T getById(Integer id);

    boolean add(T entity);

    boolean update(T entity);

    boolean delete(Integer id);
}
