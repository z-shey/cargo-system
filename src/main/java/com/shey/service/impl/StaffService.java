package com.shey.service.impl;

import com.shey.dao.impl.StaffDao;
import com.shey.entity.Staff;
import com.shey.service.BaseService;

import java.util.List;

public class StaffService implements BaseService<Staff> {
    StaffDao staffDao = new StaffDao();

    @Override
    public List<Staff> getList() {
        return staffDao.selectAll();
    }

    @Override
    public Staff getById(Integer id) {
        return staffDao.selectById(id);
    }

    @Override
    public boolean add(Staff entity) {
        return staffDao.insert(entity);
    }

    @Override
    public boolean update(Staff entity) {
        return staffDao.update(entity);
    }

    @Override
    public boolean delete(Integer id) {
        return staffDao.delete(id);
    }

    public boolean isValid(String username, String password) {
        return staffDao.selectStaffByUsernamePassword(username, password);
    }

    public Staff login(String username, String password) {
        return staffDao.selectStaffByUsernamePasswordReturnStaff(username, password);
    }
}
