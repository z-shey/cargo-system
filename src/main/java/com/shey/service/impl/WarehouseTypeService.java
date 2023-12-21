package com.shey.service.impl;

import com.shey.dao.impl.WarehouseTypeDao;
import com.shey.entity.WarehouseType;
import com.shey.service.BaseService;

import java.util.List;

public class WarehouseTypeService implements BaseService<WarehouseType> {
    static WarehouseTypeDao warehouseTypeDao = new WarehouseTypeDao();

    @Override
    public List<WarehouseType> getList() {
        return warehouseTypeDao.selectAll();
    }

    @Override
    public WarehouseType getById(Integer id) {
        return warehouseTypeDao.selectById(id);
    }

    @Override
    public boolean add(WarehouseType entity) {
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

    static public String getName(Integer id) {
        return warehouseTypeDao.selectById(id).getWarehouse_type_name();
    }
}
