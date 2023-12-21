package com.shey.dao.impl;

import com.shey.dao.BaseDao;
import com.shey.entity.Cargo;
import com.shey.util.DBUtil;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class CargoDao implements BaseDao<Cargo> {
    @Override
    public List<Cargo> selectAll() {
        String sql = "SELECT * FROM cargo";
        try (Connection connection = DBUtil.getConnection()) {
            return getQueryRunner().query(connection, sql, new BeanListHandler<>(Cargo.class));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Cargo selectById(Integer id) {
        String sql = "SELECT * FROM cargo WHERE cargo_id = ?";
        try (Connection connection = DBUtil.getConnection()) {
            return getQueryRunner().query(connection, sql, new BeanHandler<>(Cargo.class), id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean insert(Cargo entity) {
        String sql = "INSERT INTO cargo (cargo_name, cargo_price, cargo_type_id, warehouse_id, cargo_description) VALUES (?, ?, ?, ?, ?)";
        try (Connection connection = DBUtil.getConnection()) {
            return getQueryRunner().update(connection, sql,
                    entity.getCargo_name(),
                    entity.getCargo_price(),
                    entity.getCargo_type_id(),
                    entity.getWarehouse_id(),
                    entity.getCargo_description()) > 1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean update(Cargo entity) {
        String sql = "UPDATE cargo SET cargo_name = ?, cargo_price = ?, cargo_type_id = ?, warehouse_id = ?, cargo_description = ? WHERE cargo_id = ?";
        try (Connection connection = DBUtil.getConnection()) {
            return getQueryRunner().update(connection, sql,
                    entity.getCargo_name(),
                    entity.getCargo_price(),
                    entity.getCargo_type_id(),
                    entity.getWarehouse_id(),
                    entity.getCargo_description()) > 1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean delete(Integer id) {
        String sql = "DELETE FROM cargo WHERE cargo_id = ?";
        try (Connection connection = DBUtil.getConnection()) {
            return getQueryRunner().update(connection, sql, id) > 1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
