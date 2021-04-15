package com.hyrc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：kui
 * @description：${description}
 * @date ：Created in 2021/4/14 11:48
 * @modified By：
 * @version: $version$
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosProviderApplication {

    @Value("${server.port}")
    private String port;

    public static void main(String[] args) {
        SpringApplication.run(NacosProviderApplication.class, args);
    }


    @RestController
    class EchoController {
        @GetMapping(value = "/echo/{name}")
        public String echo(@PathVariable String name) {
            return port+": Hello Nacos Discovery " + name;
        }
    }

}
