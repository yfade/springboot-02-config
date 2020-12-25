package com.mld;

import com.mld.bean.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

/**
 * @ImportResource：导入Spring的配置文件，让配置文件里面的内容生效；
 * Spring Boot里面没有Spring的配置文件，我们自己编写的配置文件，也不能自动识别；
 * 想让Spring的配置文件生效，加载进来；@ImportResource标注在一个配置类上
 */
//@ImportResource(value = {"classpath:beans.xml"})
@PropertySource(value = {"classpath:person.properties"})
@SpringBootApplication
public class Springboot02ConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot02ConfigApplication.class, args);
    }

}
