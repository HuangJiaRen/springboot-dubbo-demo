package com.huangli.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import java.io.IOException;

/**
 * @author huangli
 * @version 1.0
 * @description TODO
 * @date 2019-07-22 16:26
 */
@SpringBootApplication
@ImportResource({"classpath:config/spring-dubbo.xml"})
@MapperScan("com.huangli.provider.mapper")
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}