package com.mld;

import com.mld.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Springboot02ConfigApplicationTests {
    @Autowired
    private Person person;


    @Autowired
    private ApplicationContext ac;

    @Test
    void testHello(){
        boolean flag = ac.containsBean("helloService2");
        System.out.println(flag);
    }

    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
