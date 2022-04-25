package com.ddd_bootcamp.domain.events;

public class AddressVO {

    private String city;

    public AddressVO(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
