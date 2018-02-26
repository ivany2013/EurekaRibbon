package com.example.demo;

import com.example.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Xul on 2018/2/26.
 */
@RestController
public class TestController {

    @Autowired
    HelloService helloService;

    @RequestMapping("hi")
    public String hi(String name){
        return helloService.hiService(name);
    }
}
