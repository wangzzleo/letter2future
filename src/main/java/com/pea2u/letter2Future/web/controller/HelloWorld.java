package com.pea2u.letter2Future.web.controller;

import com.pea2u.letter2Future.model.User;
import com.pea2u.letter2Future.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangzz
 * @date 15:17:43 2019.5.31
 * hello world
 */
@Controller
public class HelloWorld {

    @Autowired
    private HelloService helloService;

    @RequestMapping("hello")
    public User hello() {
        return helloService.sayHello(1);
    }

    @GetMapping("/index")
    public String index() {
        return "hello";
    }
}
