package com.example.springboot_20220530;

import com.example.springboot_20220530.bean.Person;
//import com.example.springboot_20220530.controller.HelloController;
import com.example.springboot_20220530.service.impl.PersonServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Springboot20220530ApplicationTests {
    @Autowired
    Person person;
    //IOC 容器
    @Autowired
    ApplicationContext ioc;
    @Autowired
    PersonServiceImpl personService;
    @Test
    void testHelloService() {
        //校验 IOC 容器中是否包含组件 personService
        boolean b = ioc.containsBean("personService");
        if (b) {
            System.out.println("personService 已经添加到 IOC 容器中");
        } else {
            System.out.println("personService 没添加到 IOC 容器中");
        }
    }
    @Test
    void contextLoads() {
        System.out.println(personService.getPersonInfo());
        System.out.println(person);
    }

}
