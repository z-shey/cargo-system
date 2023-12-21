package com.shey.entity;

public class CargoType {
    private Integer cargo_type_id;
    private String cargo_type_name;
    private String cargo_type_description;
    private Integer cargo_stock;

    public CargoType() {
    }

    public CargoType(Integer cargo_type_id, String cargo_type_name, String cargo_type_description, Integer cargo_stock) {
        this.cargo_type_id = cargo_type_id;
        this.cargo_type_name = cargo_type_name;
        this.cargo_type_description = cargo_type_description;
        this.cargo_stock = cargo_stock;
    }

    public Integer getCargo_type_id() {
        return cargo_type_id;
    }

    public void setCargo_type_id(Integer cargo_type_id) {
        this.cargo_type_id = cargo_type_id;
    }

    public String getCargo_type_name() {
        return cargo_type_name;
    }

    public void setCargo_type_name(String cargo_type_name) {
        this.cargo_type_name = cargo_type_name;
    }

    public String getCargo_type_description() {
        return cargo_type_description;
    }

    public void setCargo_type_description(String cargo_type_description) {
        this.cargo_type_description = cargo_type_description;
    }

    public Integer getCargo_stock() {
        return cargo_stock;
    }

    public void setCargo_stock(Integer cargo_stock) {
        this.cargo_stock = cargo_stock;
    }
}
