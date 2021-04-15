package com.hyrc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ：kui
 * @description：${description}
 * @date ：Created in 2021/4/14 12:52
 * @modified By：
 * @version: $version$
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class NaocsConsumerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(NaocsConsumerFeignApplication.class, args);
    }

}
