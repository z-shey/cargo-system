package com.shey.service.impl;

import com.shey.dao.impl.RoleDao;
import com.shey.entity.Role;
import com.shey.entity.Staff;
import com.shey.service.BaseService;

import java.util.List;

public class RoleService implements BaseService<Role> {
    static RoleDao roleDao = new RoleDao();

    @Override
    public List<Role> getList() {
        return roleDao.selectAll();
    }

    @Override
    public Role getById(Integer roleId) {
        return roleDao.selectById(roleId);
    }

    @Override
    public boolean add(Role entity) {
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
        return roleDao.getRolesWithPermissionLessThan(staff);
    }

    static public String getName(Integer id) {
        return roleDao.selectById(id).getRole_name();
    }
}
