package com.shey.entity;

public class District {
    private Integer district_id;
    private String district_name;
    private String district_description;

    public District() {
    }

    public District(Integer district_id, String district_name, String district_description) {
        this.district_id = district_id;
        this.district_name = district_name;
        this.district_description = district_description;
    }

    public Integer getDistrict_id() {
        return district_id;
    }

    public void setDistrict_id(Integer district_id) {
        this.district_id = district_id;
    }

    public String getDistrict_name() {
        return district_name;
    }

    public void setDistrict_name(String district_name) {
        this.district_name = district_name;
    }

    public String getDistrict_description() {
        return district_description;
    }

    public void setDistrict_description(String district_description) {
        this.district_description = district_description;
    }
}
