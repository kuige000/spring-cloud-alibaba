package com.hyrc.controller;



import com.hyrc.feign.ConsumerFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：kui
 * @description：${description}
 * @date ：Created in 2021/4/14 12:54
 * @modified By：
 * @version: $version$
 */
@RestController
public class FeignClientController {

    @Autowired
    private ConsumerFeign feign;

    @GetMapping(value = "/echo/{name}")
    public String echo(@PathVariable String name) {
        return feign.echo(name);
    }
}
