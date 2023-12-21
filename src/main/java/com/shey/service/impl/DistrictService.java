package com.shey.service.impl;

import com.shey.dao.impl.DistrictDao;
import com.shey.entity.District;
import com.shey.service.BaseService;

import java.util.List;

public class DistrictService implements BaseService<District> {
    DistrictDao districtDao = new DistrictDao();

    @Override
    public List<District> getList() {
        return districtDao.selectAll();
    }

    @Override
    public District getById(Integer id) {
        return districtDao.selectById(id);
    }

    @Override
    public boolean add(District entity) {
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
