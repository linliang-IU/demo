package com.example.testDemo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "测试接口")
public class TestController {

    @GetMapping("/test")
    @ApiOperation(value = "/test",notes = "测试")
    public String test(){
        return "aaa";
    }
}
