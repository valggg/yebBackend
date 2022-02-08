package com.alex.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 旋木頵頵
 * @date 2021/10/20 22:03
 * @email 1020626977@qq.com
 */
@RestController
public class HelloController {
    @GetMapping("hello")
    public String hello() {
        return "hello world!";
    }

    @GetMapping("/employee/basic/hello")
    public String hello2() {
        return "basic";
    }

    @GetMapping("/employee/advanced/hello")
    public String hello3() {
        return "advanced";
    }
}
