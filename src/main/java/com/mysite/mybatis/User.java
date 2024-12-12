package com.mysite.mybatis;

//DB와 user 테이블과 같은 클래스
public class User {
    private String id;
    private String name;
    private String phone;
    private String address;

    public User(String address, String phone, String name, String id) {
        this.address = address;
        this.phone = phone;
        this.name = name;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
