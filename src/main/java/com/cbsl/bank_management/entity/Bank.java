package com.cbsl.bank_management.entity;

import javax.persistence.*;

@Entity
@Table(name = "bank")
public class Bank {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bankID;

    private String bank_name;

    public Bank() {

    }

    public Bank(int bankID, String bank_name) {
        this.bankID = bankID;
        this.bank_name = bank_name;
    }

    public int getBankID() {
        return bankID;
    }

    public void setBankID(int bankID) {
        this.bankID = bankID;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }
}
