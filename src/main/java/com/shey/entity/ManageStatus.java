package com.shey.entity;

public class ManageStatus {
    private Integer status_id;
    private String status;
    private String status_description;

    public ManageStatus() {
    }

    public ManageStatus(Integer status_id, String status, String status_description) {
        this.status_id = status_id;
        this.status = status;
        this.status_description = status_description;
    }

    public Integer getStatus_id() {
        return status_id;
    }

    public void setStatus_id(Integer status_id) {
        this.status_id = status_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus_description() {
        return status_description;
    }

    public void setStatus_description(String status_description) {
        this.status_description = status_description;
    }
}
