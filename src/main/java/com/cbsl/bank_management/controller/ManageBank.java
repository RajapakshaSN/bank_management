package com.cbsl.bank_management.controller;


import com.cbsl.bank_management.entity.Bank;
import com.cbsl.bank_management.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManageBank {
    @Autowired
    private BankService bankService;

    @PostMapping("/registerBank")
    public Bank registerBank(@RequestBody Bank bank){
        return bankService.createBank(bank);
    }
}
