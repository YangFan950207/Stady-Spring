package com.yang.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.yang.pojo")
public class YangConfig2 {
    @Bean
    public Integer integer(){
        return 123;
    }
}
