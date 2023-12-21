package com.shey.entity;

public enum RoleEnum {
    NATIONAL_MANAGER(1),
    DISTRICT_MANAGER(2),
    WAREHOUSE_MANAGER(3),
    STAFF_MANAGER(4),
    GENERAL_STAFF(5);

    private final Integer role;

    RoleEnum(Integer role) {
        this.role = role;
    }

    public Integer getRole() {
        return role;
    }
}
