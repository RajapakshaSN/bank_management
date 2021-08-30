package com.cbsl.bank_management.service;

import com.cbsl.bank_management.entity.Bank;
import com.cbsl.bank_management.repositry.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankService {
    @Autowired
    private BankRepository bankRepository;

    public Bank createBank(Bank bank){
        return(bankRepository.save(bank));
    }
}
