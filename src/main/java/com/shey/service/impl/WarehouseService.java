package com.shey.service.impl;

import com.shey.dao.impl.WarehouseDao;
import com.shey.entity.Warehouse;
import com.shey.service.BaseService;

import java.util.List;

public class WarehouseService implements BaseService<Warehouse> {
    static WarehouseDao warehouseDao = new WarehouseDao();

    @Override
    public List<Warehouse> getList() {
        return warehouseDao.selectAll();
    }

    @Override
    public Warehouse getById(Integer warehouseId) {
        return warehouseDao.selectById(warehouseId);
    }

    @Override
    public boolean add(Warehouse entity) {
        return false;
    }

    @Override
    public boolean update(Warehouse entity) {
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    static public String getName(Integer id) {
        return warehouseDao.selectById(id).getWarehouse_name();
    }
}
