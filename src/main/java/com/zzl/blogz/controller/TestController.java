package com.zzl.blogz.controller;

import com.zzl.blogz.domain.Test;
import com.zzl.blogz.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Zz1
 * @version 1.0
 * @date 2021/6/26 22:17
 */
@RestController
public class TestController {

    @Value("${test.hello:TEST}")
    private String testHello;

    @Resource
    private TestService testService;

    @RequestMapping("/hello")
    public String hello(){
        return testHello;
    }

    @GetMapping("/test/list")
    public List<Test> list(){
        return testService.list();
    }
}
