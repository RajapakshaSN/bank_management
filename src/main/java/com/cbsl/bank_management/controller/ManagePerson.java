package com.cbsl.bank_management.controller;



import com.cbsl.bank_management.entity.Person;
import com.cbsl.bank_management.repositry.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class ManagePerson {
    @Autowired
    private PersonRepository personRepository;

    @PostMapping("/addperson")
    public Person addPerson(@RequestBody Person person){
        return(personRepository.save(person));
    }
}
