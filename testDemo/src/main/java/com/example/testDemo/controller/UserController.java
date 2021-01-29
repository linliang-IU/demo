package com.example.testDemo.controller;

import com.example.testDemo.dto.UserDTO;
import com.example.testDemo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(value = "用户控制层")
@RestController
@RequestMapping(name = "/user")
public class UserController {
    @Autowired
    private UserService service;

    @ApiOperation(value = "新增")
    @RequestMapping(value = "/add",method = RequestMethod.PUT)
    private void insert(@RequestBody UserDTO userDTO){
        service.insert(userDTO);
    }

    @ApiOperation(value = "修改")
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    private void update(@RequestBody UserDTO userDTO){
        service.update(userDTO);
    }

    @ApiOperation(value = "删除")
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    private void delete(@Deprecated int id){
        service.delete(id);
    }

    

}
