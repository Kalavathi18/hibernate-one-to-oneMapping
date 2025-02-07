package com.tap.entity;

import jakarta.persistence.*;

@Entity
@Table(name="employee_details2")
public class EmployeeDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="email")
    private String email;

    @Column(name="address")
    private String address;

    @Column(name="phoneNum")
    private String phoneNum;  // Changed to String

    public EmployeeDetails(String email, String address, String phoneNum) {
        this.email = email;
        this.address = address;
        this.phoneNum = phoneNum;
    }

    public EmployeeDetails() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "EmployeeDetails [id=" + id + ", email=" + email + ", address=" + address + ", phoneNum=" + phoneNum + "]";
    }
}
