package com.shey.dao.impl;

import com.shey.dao.BaseDao;
import com.shey.entity.District;
import com.shey.util.DBUtil;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class DistrictDao implements BaseDao<District> {
    @Override
    public List<District> selectAll() {
        String sql = "SELECT * FROM district";
        try (Connection connection = DBUtil.getConnection()) {
            return getQueryRunner().query(connection, sql, new BeanListHandler<>(District.class));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public District selectById(Integer id) {
        String sql = "SELECT * FROM district WHERE id = ?";
        try (Connection connection = DBUtil.getConnection()) {
            return getQueryRunner().query(connection, sql, new BeanHandler<>(District.class));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean insert(District entity) {
        return false;
    }

    @Override
    public boolean update(District entity) {
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }
}
