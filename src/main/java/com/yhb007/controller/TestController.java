package com.yhb007.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author yhb
 * @Date 2021/6/29
 */
@RestController
public class TestController {

//    @Value("${mybatis-plus.mapper-locations}")
    private String name;

    @GetMapping("/getName")
    public String getName() {
        return "mybatis-plus.mapper-locations: " + name;
    }

}
