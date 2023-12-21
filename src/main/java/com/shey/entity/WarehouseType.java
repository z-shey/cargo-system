package com.shey.entity;

public class WarehouseType {
    private Integer warehouse_type_id;
    private String warehouse_type_name;
    private String warehouse_type_description;

    public WarehouseType() {
    }

    public WarehouseType(Integer warehouse_type_id, String warehouse_type_name, String warehouse_type_description) {
        this.warehouse_type_id = warehouse_type_id;
        this.warehouse_type_name = warehouse_type_name;
        this.warehouse_type_description = warehouse_type_description;
    }

    public Integer getWarehouse_type_id() {
        return warehouse_type_id;
    }

    public void setWarehouse_type_id(Integer warehouse_type_id) {
        this.warehouse_type_id = warehouse_type_id;
    }

    public String getWarehouse_type_name() {
        return warehouse_type_name;
    }

    public void setWarehouse_type_name(String warehouse_type_name) {
        this.warehouse_type_name = warehouse_type_name;
    }

    public String getWarehouse_type_description() {
        return warehouse_type_description;
    }

    public void setWarehouse_type_description(String warehouse_type_description) {
        this.warehouse_type_description = warehouse_type_description;
    }
}
