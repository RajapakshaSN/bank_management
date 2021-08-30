package com.cbsl.bank_management.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int personal_id;
    private String first_name;
    private String last_name;
    private Date dob;
    private int phone;
    private String NIC;
    private String gender;
    private String address;

    public Person(int personal_id, String first_name, String last_name, Date dob, int phone, String NIC, String gender, String address) {
        this.personal_id = personal_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.dob = dob;
        this.phone = phone;
        this.NIC = NIC;
        this.gender = gender;
        this.address = address;
    }

    public Person() {
    }

    public int getPersonal_id() {
        return personal_id;
    }

    public void setPersonal_id(int personal_id) {
        this.personal_id = personal_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
