package com.hyrc.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author ：kui
 * @description：${description}
 * @date ：Created in 2021/4/14 11:54
 * @modified By：
 * @version: $version$
 */
@Configuration
public class RestTemplateConfig {


    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}