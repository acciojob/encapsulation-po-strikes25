package com.driver;

public class RWOnly {
    private String name;
    public String getter() {
        return name;
    }
    public String setter(String value) {
        this.name = value;
        return name;
    }
}
