package com.hyrc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author ：kui
 * @description：${description}
 * @date ：Created in 2021/4/14 11:55
 * @modified By：
 * @version: $version$
 */
@RestController
public class RestTemplateController {

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping(value = "/echo/{name}")
    public String echo(@PathVariable String name) {
        // 原始方式通过 ip:port 进行访问
        // restTemplate.getForObject("http://localhost:8081/msg"+name,String.class);

        //  通过 spring.application.name 名称发现
        return restTemplate.getForObject("http://nacos-provider/echo/" + name, String.class);
    }

}
