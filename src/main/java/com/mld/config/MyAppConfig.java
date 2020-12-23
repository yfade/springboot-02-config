package com.mld.config;

import com.mld.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 指明当前类是一个配置类，代替之前的spring配置文件
 * springboot 推荐使用这种注解方式向容器中添加组件
 * 1、配置类里面使用@Bean标注在方法上给容器注册组件，默认也是单实例的
 * 2、配置类本身也是组件
 * 3、proxyBeanMethods：代理bean的方法
 * Full(proxyBeanMethods = true)、【保证每个@Bean方法被调用多少次返回的组件都是单实例的】
 * Lite(proxyBeanMethods = false)【每个@Bean方法被调用多少次返回的组件都是新创建的】
 * 组件依赖必须使用Full模式默认。其他默认是否Lite模式
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
