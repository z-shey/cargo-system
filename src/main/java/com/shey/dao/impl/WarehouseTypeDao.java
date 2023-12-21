package com.shey.dao.impl;

import com.shey.dao.BaseDao;
import com.shey.entity.WarehouseType;
import com.shey.util.DBUtil;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class WarehouseTypeDao implements BaseDao<WarehouseType> {
    @Override
    public List<WarehouseType> selectAll() {
        String sql = "SELECT * FROM warehouse_type";
        try (Connection connection = DBUtil.getConnection()) {
            return getQueryRunner().query(connection, sql, new BeanListHandler<>(WarehouseType.class));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public WarehouseType selectById(Integer id) {
        String sql = "SELECT * FROM warehouse_type WHERE warehouse_type_id = ?";
        try (Connection connection = DBUtil.getConnection()) {
            return getQueryRunner().query(connection, sql, new BeanHandler<>(WarehouseType.class));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean insert(WarehouseType entity) {
        return false;
    }

    @Override
    public boolean update(WarehouseType entity) {
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }
}
