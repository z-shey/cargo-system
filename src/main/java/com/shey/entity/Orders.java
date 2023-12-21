package com.shey.entity;

import java.sql.Timestamp;

public class Orders {
    private Integer order_id;
    private Timestamp order_date;
    private Integer cargo_id;
    private Integer order_quantity;
    private Double order_total_price;
    private Timestamp delivery_date;
    private Integer order_status;
    private Integer inbound_order_id;
    private Integer outbound_order_id;
    private String orders_description;

    public Orders() {
    }

    public Orders(Integer order_id, Timestamp order_date, Integer cargo_id, Integer order_quantity, Double order_total_price, Timestamp delivery_date, Integer order_status, Integer inbound_order_id, Integer outbound_order_id, String orders_description) {
        this.order_id = order_id;
        this.order_date = order_date;
        this.cargo_id = cargo_id;
        this.order_quantity = order_quantity;
        this.order_total_price = order_total_price;
        this.delivery_date = delivery_date;
        this.order_status = order_status;
        this.inbound_order_id = inbound_order_id;
        this.outbound_order_id = outbound_order_id;
        this.orders_description = orders_description;
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

    public Double getOrder_total_price() {
        return order_total_price;
    }

    public void setOrder_total_price(Double order_total_price) {
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

    public Integer getInbound_order_id() {
        return inbound_order_id;
    }

    public void setInbound_order_id(Integer inbound_order_id) {
        this.inbound_order_id = inbound_order_id;
    }

    public Integer getOutbound_order_id() {
        return outbound_order_id;
    }

    public void setOutbound_order_id(Integer outbound_order_id) {
        this.outbound_order_id = outbound_order_id;
    }

    public String getOrders_description() {
        return orders_description;
    }

    public void setOrders_description(String orders_description) {
        this.orders_description = orders_description;
    }
}
