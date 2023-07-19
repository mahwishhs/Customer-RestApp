package com.example.demo1.domain;
public class Customer {
    private int id;
    private String name;
    private String email;
    private String address;
    private String phone;

    public Customer(){

    }

    public Customer(int id, String name, String email, String address, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Getters and setters
    public String toString() {
        return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", phone="
                + phone + "]";
    }
}