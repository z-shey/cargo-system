package com.shey.entity;

import java.sql.Timestamp;

public class OutboundOrder {
    private Integer order_id;
    private Timestamp order_date;
    private Integer cargo_id;
    private Integer order_quantity;
    private Integer order_total_price;
    private Timestamp delivery_date;
    private Integer order_status;
    private String customer_name;
    private String customer_contact;
    private Integer warehouse_id;
    private String outbound_order_description;

    public OutboundOrder() {
    }

    public OutboundOrder(Integer order_id, Timestamp order_date, Integer cargo_id, Integer order_quantity, Integer order_total_price, Timestamp delivery_date, Integer order_status, String customer_name, String customer_contact, Integer warehouse_id, String outbound_order_description) {
        this.order_id = order_id;
        this.order_date = order_date;
        this.cargo_id = cargo_id;
        this.order_quantity = order_quantity;
        this.order_total_price = order_total_price;
        this.delivery_date = delivery_date;
        this.order_status = order_status;
        this.customer_name = customer_name;
        this.customer_contact = customer_contact;
        this.warehouse_id = warehouse_id;
        this.outbound_order_description = outbound_order_description;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public Timestamp getOrder_date() {
        return order_date;
    }

    public void setOrder_date(Timestamp order_date) {
        this.order_date = order_date;
    }

    public Integer getCargo_id() {
        return cargo_id;
    }

    public void setCargo_id(Integer cargo_id) {
        this.cargo_id = cargo_id;
    }

    public Integer getOrder_quantity() {
        return order_quantity;
    }

    public void setOrder_quantity(Integer order_quantity) {
        this.order_quantity = order_quantity;
    }

    public Integer getOrder_total_price() {
        return order_total_price;
    }

    public void setOrder_total_price(Integer order_total_price) {
        this.order_total_price = order_total_price;
    }

    public Timestamp getDelivery_date() {
        return delivery_date;
    }

    public void setDelivery_date(Timestamp delivery_date) {
        this.delivery_date = delivery_date;
    }

    public Integer getOrder_status() {
        return order_status;
    }

    public void setOrder_status(Integer order_status) {
        this.order_status = order_status;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_contact() {
        return customer_contact;
    }

    public void setCustomer_contact(String customer_contact) {
        this.customer_contact = customer_contact;
    }

    public Integer getWarehouse_id() {
        return warehouse_id;
    }

    public void setWarehouse_id(Integer warehouse_id) {
        this.warehouse_id = warehouse_id;
    }

    public String getOutbound_order_description() {
        return outbound_order_description;
    }

    public void setOutbound_order_description(String outbound_order_description) {
        this.outbound_order_description = outbound_order_description;
    }
}
