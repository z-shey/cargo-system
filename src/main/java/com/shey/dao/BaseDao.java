package com.shey.dao;

import org.apache.commons.dbutils.QueryRunner;

import java.util.List;

public interface BaseDao<T> {
    default QueryRunner getQueryRunner() {
        return new QueryRunner();
    }

    List<T> selectAll();

    T selectById(Integer id);

    boolean insert(T entity);

    boolean update(T entity);

    boolean delete(Integer id);
}
