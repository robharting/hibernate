package org.rob.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by robendiane on 21-12-17.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "org.rob.spring.controller" })
public class WebConfig {
}
