package com.example.springboot_20220530.service.impl;

import com.example.springboot_20220530.bean.Person;
import com.example.springboot_20220530.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonServiceImpl implements PersonService {

    @Autowired
    private Person person;

    @Override
    public Person getPersonInfo() {
        return person;
    }
}
