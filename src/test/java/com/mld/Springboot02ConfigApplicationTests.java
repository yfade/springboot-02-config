package com.mld;

import com.mld.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

@SpringBootTest
class Springboot02ConfigApplicationTests {
//    @Autowired
//    private Person person;


    @Autowired
    private ApplicationContext ac;

    @Test
    void testHello(){
        boolean flag = ac.containsBean("helloService2");
        System.out.println(flag);
    }

    @Test
    void contextLoads() {
        System.out.println("---------------------");
        String[] beanNamesForType = ac.getBeanNamesForType(Person.class);
        for (int i = 0; i < beanNamesForType.length; i++) {
            String s=beanNamesForType[i];
            System.out.println(s);
            Person person = ac.getBean(s, Person.class);
            System.out.println(person);
            System.out.println("======================");

        }
//        System.out.println(person);
    }

}
