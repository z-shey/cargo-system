package com.shey.entity;

public class Supplier {
    private Integer supplier_id;
    private String supplier_name;
    private String supplier_contact;
    private String supplier_address;
    private String supplier_description;

    public Supplier() {
    }

    public Supplier(Integer supplier_id, String supplier_name, String supplier_contact, String supplier_address, String supplier_description) {
        this.supplier_id = supplier_id;
        this.supplier_name = supplier_name;
        this.supplier_contact = supplier_contact;
        this.supplier_address = supplier_address;
        this.supplier_description = supplier_description;
    }

    public Integer getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(Integer supplier_id) {
        this.supplier_id = supplier_id;
    }

    public String getSupplier_name() {
        return supplier_name;
    }

    public void setSupplier_name(String supplier_name) {
        this.supplier_name = supplier_name;
    }

    public String getSupplier_contact() {
        return supplier_contact;
    }

    public void setSupplier_contact(String supplier_contact) {
        this.supplier_contact = supplier_contact;
    }

    public String getSupplier_address() {
        return supplier_address;
    }

    public void setSupplier_address(String supplier_address) {
        this.supplier_address = supplier_address;
    }

    public String getSupplier_description() {
        return supplier_description;
    }

    public void setSupplier_description(String supplier_description) {
        this.supplier_description = supplier_description;
    }
}
