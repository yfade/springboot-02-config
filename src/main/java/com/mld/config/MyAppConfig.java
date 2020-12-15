package com.mld.config;

import com.mld.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 指明当前类是一个配置类，代替之前的spring配置文件
 * springboot 推荐使用这种注解方式向容器中添加组件
 */
@Configuration
public class MyAppConfig {

    /**
     * @return
     * @Bean:将当前方法的返回值放入容器中，容器中这个组件的id为方法名
     */
    @Bean
    public HelloService helloService2() {
        System.out.println("@Bean向容器中添加HelloService组件...");
        return new HelloService();
    }

}
