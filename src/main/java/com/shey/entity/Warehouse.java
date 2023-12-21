package com.shey.entity;

public class Warehouse {
    private Integer warehouse_id;
    private String warehouse_name;
    private Integer warehouse_type;
    private Integer district_id;
    private String warehouse_location;
    private String warehouse_description;

    public Warehouse() {
    }

    public Warehouse(Integer warehouse_id, String warehouse_name, Integer warehouse_type, Integer district_id, String warehouse_location, String warehouse_description) {
        this.warehouse_id = warehouse_id;
        this.warehouse_name = warehouse_name;
        this.warehouse_type = warehouse_type;
        this.district_id = district_id;
        this.warehouse_location = warehouse_location;
        this.warehouse_description = warehouse_description;
    }

    public Integer getWarehouse_id() {
        return warehouse_id;
    }

    public void setWarehouse_id(Integer warehouse_id) {
        this.warehouse_id = warehouse_id;
    }

    public String getWarehouse_name() {
        return warehouse_name;
    }

    public void setWarehouse_name(String warehouse_name) {
        this.warehouse_name = warehouse_name;
    }

    public Integer getWarehouse_type() {
        return warehouse_type;
    }

    public void setWarehouse_type(Integer warehouse_type) {
        this.warehouse_type = warehouse_type;
    }

    public Integer getDistrict_id() {
        return district_id;
    }

    public void setDistrict_id(Integer district_id) {
        this.district_id = district_id;
    }

    public String getWarehouse_location() {
        return warehouse_location;
    }

    public void setWarehouse_location(String warehouse_location) {
        this.warehouse_location = warehouse_location;
    }

    public String getWarehouse_description() {
        return warehouse_description;
    }

    public void setWarehouse_description(String warehouse_description) {
        this.warehouse_description = warehouse_description;
    }
}
