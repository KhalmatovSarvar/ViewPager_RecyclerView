package com.example.viewpager_recyclerview.model;

public class Contacts {
    String name;
    String phone_num;

    public Contacts(String name, String phone_num) {
        this.name = name;
        this.phone_num = phone_num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }
}
