package com.shey.entity;

public class Cargo {
    private Integer cargo_id;
    private String cargo_name;
    private Double cargo_price;
    private Integer cargo_type_id;
    private Integer warehouse_id;
    private String cargo_description;

    public Cargo() {
    }

    public Cargo(Integer cargo_id, String cargo_name, Double cargo_price, Integer cargo_type_id, Integer warehouse_id, String cargo_description) {
        this.cargo_id = cargo_id;
        this.cargo_name = cargo_name;
        this.cargo_price = cargo_price;
        this.cargo_type_id = cargo_type_id;
        this.warehouse_id = warehouse_id;
        this.cargo_description = cargo_description;
    }

    public Integer getCargo_id() {
        return cargo_id;
    }

    public void setCargo_id(Integer cargo_id) {
        this.cargo_id = cargo_id;
    }

    public String getCargo_name() {
        return cargo_name;
    }

    public void setCargo_name(String cargo_name) {
        this.cargo_name = cargo_name;
    }

    public Double getCargo_price() {
        return cargo_price;
    }

    public void setCargo_price(Double cargo_price) {
        this.cargo_price = cargo_price;
    }

    public Integer getCargo_type_id() {
        return cargo_type_id;
    }

    public void setCargo_type_id(Integer cargo_type_id) {
        this.cargo_type_id = cargo_type_id;
    }

    public Integer getWarehouse_id() {
        return warehouse_id;
    }

    public void setWarehouse_id(Integer warehouse_id) {
        this.warehouse_id = warehouse_id;
    }

    public String getCargo_description() {
        return cargo_description;
    }

    public void setCargo_description(String cargo_description) {
        this.cargo_description = cargo_description;
    }
}
