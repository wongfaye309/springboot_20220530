package com.example.springboot_20220530.controller;

import com.example.springboot_20220530.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {
    @Resource
    private Person person;
    @ResponseBody
    @RequestMapping(value="/person")
    public Person person(){

        System.out.println(person);
        return person;
    }
}
