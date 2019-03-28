package com.ttn.thymeleaf.enums;

public enum  Enum {
    USER("Dhanedra"),ADMIN("Vineet"),SUPER_ADMIN("Deepak");

    private String value;
    Enum(String val) {
        value=val;
    }

    public String getValue() {
        return value;
    }


}
