package com.thsware.controller;

import com.thsware.entity.UserEntity;
import com.thsware.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.Console;
import java.util.List;

@Controller
public class QdjjController {
    @Autowired
    private UserMapper userMapper;
    //
    @RequestMapping("/")
    public String index(){
        return "index";
    }
    //测试数据库连接
    @RequestMapping("/aa")
    @ResponseBody
    public List<UserEntity> getAll(){
        List<UserEntity> userEntities = userMapper.getAll();
        System.out.println(userEntities);
        return userEntities;
    }
}
