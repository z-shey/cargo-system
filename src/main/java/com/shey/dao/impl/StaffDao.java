package com.shey.dao.impl;

import com.shey.dao.BaseDao;
import com.shey.entity.Staff;
import com.shey.util.DBUtil;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class StaffDao implements BaseDao<Staff> {
    @Override
    public List<Staff> selectAll() {
        String sql = "SELECT * FROM staff";
        try (Connection connection = DBUtil.getConnection()) {
            return getQueryRunner().query(connection, sql, new BeanListHandler<Staff>(Staff.class));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Staff selectById(Integer id) {
        String sql = "SELECT * FROM staff WHERE staff_id = ?";
        try (Connection connection = DBUtil.getConnection()) {
            return getQueryRunner().query(connection, sql, new BeanHandler<>(Staff.class), id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean insert(Staff entity) {
        String sql = "INSERT INTO staff (staff_name, staff_username, staff_password, role_id, warehouse_id, staff_description) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection connection = DBUtil.getConnection()) {
            return getQueryRunner().update(connection, sql,
                    entity.getStaff_name(),
                    entity.getStaff_username(),
                    entity.getStaff_password(),
                    entity.getRole_id(),
                    entity.getWarehouse_id(),
                    entity.getStaff_description()) > 1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean update(Staff entity) {
        String sql = "UPDATE staff SET staff_name = ?, staff_username = ?, staff_password = ?, role_id = ?, warehouse_id =?, staff_description = ? WHERE staff_id = ?";
        try (Connection connection = DBUtil.getConnection()) {
            return getQueryRunner().update(connection, sql,
                    entity.getStaff_name(),
                    entity.getStaff_username(),
                    entity.getStaff_password(),
                    entity.getRole_id(),
                    entity.getWarehouse_id(),
                    entity.getStaff_description(),
                    entity.getStaff_id()) > 1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean delete(Integer id) {
        String sql = "DELETE FROM staff WHERE staff_id = ?";
        try (Connection connection = DBUtil.getConnection()) {
            return getQueryRunner().update(connection, sql, id) > 1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean selectStaffByUsernamePassword(String username, String password) {
        String sql = "SELECT * FROM staff WHERE staff_username = ? AND staff_password = ?";
        try (Connection connection = DBUtil.getConnection()) {
            return getQueryRunner().query(connection, sql, new BeanHandler<>(Staff.class), username, password) != null;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Staff selectStaffByUsernamePasswordReturnStaff(String username, String password) {
        String sql = "SELECT * FROM staff WHERE staff_username = ? AND staff_password = ?";
        try (Connection connection = DBUtil.getConnection()) {
            return getQueryRunner().query(connection, sql, new BeanHandler<>(Staff.class), username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
