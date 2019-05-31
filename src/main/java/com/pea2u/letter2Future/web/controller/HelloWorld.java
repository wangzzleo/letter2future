package com.pea2u.letter2Future.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangzz
 * @date 15:17:43 2019.5.31
 * hello world
 */
@RestController
public class HelloWorld {

    @RequestMapping("hello")
    public String index() {
        return "Hello World!";
    }
}
