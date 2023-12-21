package com.shey.entity;

import java.sql.Timestamp;

public class Staff {
    private Integer staff_id;
    private String staff_name;
    private String staff_username;
    private String staff_password;
    private Integer role_id;
    private Integer warehouse_id;
    private Timestamp hire_date;
    private Timestamp login_time;
    private Timestamp logout_time;
    private String staff_description;
    private Integer staff_years;

    public Staff() {
    }

    public Staff(Integer staff_id, String staff_name, String staff_username, String staff_password, Integer role_id, Integer warehouse_id, Timestamp hire_date, Timestamp login_time, Timestamp logout_time, String staff_description, Integer staff_years) {
        this.staff_id = staff_id;
        this.staff_name = staff_name;
        this.staff_username = staff_username;
        this.staff_password = staff_password;
        this.role_id = role_id;
        this.warehouse_id = warehouse_id;
        this.hire_date = hire_date;
        this.login_time = login_time;
        this.logout_time = logout_time;
        this.staff_description = staff_description;
        this.staff_years = staff_years;
    }

    public Integer getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(Integer staff_id) {
        this.staff_id = staff_id;
    }

    public String getStaff_name() {
        return staff_name;
    }

    public void setStaff_name(String staff_name) {
        this.staff_name = staff_name;
    }

    public String getStaff_username() {
        return staff_username;
    }

    public void setStaff_username(String staff_username) {
        this.staff_username = staff_username;
    }

    public String getStaff_password() {
        return staff_password;
    }

    public void setStaff_password(String staff_password) {
        this.staff_password = staff_password;
    }

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public Integer getWarehouse_id() {
        return warehouse_id;
    }

    public void setWarehouse_id(Integer warehouse_id) {
        this.warehouse_id = warehouse_id;
    }

    public Timestamp getHire_date() {
        return hire_date;
    }

    public void setHire_date(Timestamp hire_date) {
        this.hire_date = hire_date;
    }

    public Timestamp getLogin_time() {
        return login_time;
    }

    public void setLogin_time(Timestamp login_time) {
        this.login_time = login_time;
    }

    public Timestamp getLogout_time() {
        return logout_time;
    }

    public void setLogout_time(Timestamp logout_time) {
        this.logout_time = logout_time;
    }

    public String getStaff_description() {
        return staff_description;
    }

    public void setStaff_description(String staff_description) {
        this.staff_description = staff_description;
    }

    public Integer getStaff_years() {
        return staff_years;
    }

    public void setStaff_years(Integer staff_years) {
        this.staff_years = staff_years;
    }
}
