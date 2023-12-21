package com.shey.entity;

public class Role {
    private Integer role_id;
    private String role_name;
    private String role_description;

    public Role() {
    }

    public Role(Integer role_id, String role_name, String role_description) {
        this.role_id = role_id;
        this.role_name = role_name;
        this.role_description = role_description;
    }

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public String getRole_description() {
        return role_description;
    }

    public void setRole_description(String role_description) {
        this.role_description = role_description;
    }
}
