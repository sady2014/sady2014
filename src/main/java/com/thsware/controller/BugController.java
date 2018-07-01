package com.thsware.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.thsware.entity.BugEntity;
import com.thsware.mapper.BugMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller

public class BugController {

    @Autowired
    private BugMapper bugMapper;
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/1")
    public String one(){
        return "1";
    }
    @ResponseBody
    @RequestMapping("/get")
    public JSONObject getAll(){
        List<BugEntity> bugEntities = bugMapper.getAll();
        String jsonObject = JSON.toJSONString(bugEntities);
        String text = "{\"code\":0,\"msg\":\"\",\"count\":35,\"data\":"+jsonObject+"}";
        JSONObject json = JSON.parseObject(text);
        return json;
    }
    @ResponseBody
    @RequestMapping("test")
    public List<BugEntity> test(){
        List<BugEntity> bugEntities = bugMapper.getAll();
        return bugEntities;
    }
}
