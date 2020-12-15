package com.mld.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

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
@Component
//@PropertySource(value = {"classpath:person.properties"})
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

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                ", map=" + map +
                ", list=" + list +
                ", dog=" + dog +
                ", weight=" + weight +
                ", height=" + height +
                ", email='" + email + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBoss() {
        return boss;
    }

    public void setBoss(boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

}
