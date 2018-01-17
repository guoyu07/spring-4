package com.spring.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by jun.chen on 2018/1/17.
 */
@Configuration
@Import({CDPlayerConfig.class, CDConfig.class})
@ImportResource("classpath:/config/cd-config.xml")
public class BaseConfig {
}
