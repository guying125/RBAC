package com.guying.rbac;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author CODE POTER
 */
@SpringBootApplication(scanBasePackages = {"com.guying.rbac"})
@MapperScan("com.guying.rbac.repository")
public class RbacServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(RbacServiceApplication.class, args);
    }
}
