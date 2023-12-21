package com.shey.dao.impl;

import com.shey.dao.BaseDao;
import com.shey.entity.Role;
import com.shey.entity.Staff;
import com.shey.util.DBUtil;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class RoleDao implements BaseDao<Role> {
    @Override
    public List<Role> selectAll() {
        String sql = "SELECT * FROM role";
        try (Connection connection = DBUtil.getConnection()) {
            return getQueryRunner().query(connection, sql, new BeanListHandler<>(Role.class));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public Role selectById(Integer id) {
        String sql = "SELECT * FROM role WHERE role_id = ?";
        try (Connection connection = DBUtil.getConnection()) {
            return getQueryRunner().query(connection, sql, new BeanHandler<>(Role.class), id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean insert(Role entity) {
        return false;
    }

    @Override
    public boolean update(Role entity) {
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    public List<Role> getRolesWithPermissionLessThan(Staff staff) {
        String sql = "SELECT * FROM role WHERE role_id > ?";
        try (Connection connection = DBUtil.getConnection()) {
            return getQueryRunner().query(connection, sql, new BeanListHandler<>(Role.class), staff.getRole_id());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
