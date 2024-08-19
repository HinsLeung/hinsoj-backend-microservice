package com.hins.hinsojbackendquestionservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.hins.hinsojbackendquestionservice.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.hins")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.hins.hinsojbackendserviceclient.service"})
public class HinsojBackendQuestionServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HinsojBackendQuestionServiceApplication.class, args);
    }

}
