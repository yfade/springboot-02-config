package com.mld.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.rmi.Naming;
import java.util.Date;
import java.util.List;
import java.util.Map;


/**
 * 将配置文件中配置的每一个属性的值，映射到组件中
 *
 * @ConfigurationProperties：告诉springBoot将本类中的所有属性和配置文件中的相关配置进行绑定，prefix="person":配置文件中哪个下面属性进行一一映射
 * 只有这个组件是容器中的组件，才能用容器提供的@ConfigurationProperties功能
 *
 * ConfigurationProperties默认去主配置文件中读取配置，
 * 如果想加载指定的配置文件需要配合@PropertySource一块使用
 *
 * 配置文件读取顺序：
 *  1.application.properties
 *  2.application.yml
 *  3.自定义的配置文件
 */
@Component("ffffff")
@Data
@ToString
@PropertySource(value = {"classpath:person.properties"})
@ConfigurationProperties(prefix = "person")
public class Person {
    private String lastName;
    private int age;
    private boolean boss;
    private Date birth;
    private Map<String, Object> map;
    private List<String> list;
    private Dog dog;
    private int weight;
    private double height;
    private String email;



}
