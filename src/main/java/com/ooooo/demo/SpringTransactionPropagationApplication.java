package com.ooooo.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author <a href="https://github.com/ooooo-youwillsee">ooooo</a>
 * @since 1.0.0
 */
@SpringBootApplication
@MapperScan(basePackages = "com.ooooo.demo.mapper")
public class SpringTransactionPropagationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringTransactionPropagationApplication.class, args);
    }
}
