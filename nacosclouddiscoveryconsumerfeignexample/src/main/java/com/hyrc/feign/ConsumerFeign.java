package com.hyrc.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author ：kui
 * @description：${description}
 * @date ：Created in 2021/4/14 14:31
 * @modified By：
 * @version: $version$
 */
@FeignClient(name = "nacos-provider")
public interface ConsumerFeign {
    /**
     * 请求服务提供方的 接口
     * @param name
     * @return
     */
    @GetMapping("/echo/{name}")
    String echo(@PathVariable(value = "name") String name);
}
