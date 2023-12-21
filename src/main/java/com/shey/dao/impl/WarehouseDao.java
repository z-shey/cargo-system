package com.shey.dao.impl;

import com.shey.dao.BaseDao;
import com.shey.entity.Warehouse;
import com.shey.util.DBUtil;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class WarehouseDao implements BaseDao<Warehouse> {

    public List<Warehouse> selectAll() {
        String sql = "SELECT * FROM warehouse";
        try (Connection connection = DBUtil.getConnection()) {
            return getQueryRunner().query(connection, sql, new BeanListHandler<>(Warehouse.class));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Warehouse selectById(Integer id) {
        String sql = "SELECT * FROM warehouse WHERE warehouse_id = ?";
        try (Connection connection = DBUtil.getConnection()) {
            return getQueryRunner().query(connection, sql, new BeanHandler<>(Warehouse.class), id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean insert(Warehouse entity) {
        String sql = "INSERT INTO warehouse(warehouse_name, warehouse_type, district_id, warehouse_location, warehouse_description) VALUES(?, ?, ?, ?, ?)";
        try (Connection connection = DBUtil.getConnection()) {
            return getQueryRunner().update(connection, sql,
                    entity.getWarehouse_name(),
                    entity.getWarehouse_type(),
                    entity.getDistrict_id(),
                    entity.getWarehouse_location(),
                    entity.getWarehouse_description()) > 1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean update(Warehouse entity) {
        String sql = "UPDATE warehouse SET warehouse_name = ?, warehouse_type = ?, district_id = ?, warehouse_location = ?, warehouse_description =? WHERE warehouse_id = ?";
        try (Connection connection = DBUtil.getConnection()) {
            return getQueryRunner().update(connection, sql,
                    entity.getWarehouse_name(),
                    entity.getWarehouse_type(),
                    entity.getDistrict_id(),
                    entity.getWarehouse_location(),
                    entity.getWarehouse_description()) > 1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean delete(Integer id) {
        String sql = "DELETE FROM warehouse WHERE warehouse_id = ?";
        try (Connection connection = DBUtil.getConnection()) {
            return getQueryRunner().update(connection, sql, id) > 1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
