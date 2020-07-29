package com.example.mybatisAndSpringDataJpa.springDataJpa.controller;

import com.example.mybatisAndSpringDataJpa.springDataJpa.entity.User;
import com.example.mybatisAndSpringDataJpa.springDataJpa.service.Uservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author steven-wan
 * @desc
 * @date 2020-07-29 10:55
 */
@Controller
@RequestMapping
public class UserController {

    @Autowired
    Uservice uservice;

    @RequestMapping(value = "/user")
    @ResponseBody
    public String findById(Integer id) {
        User user = uservice.findById(id);
        return user.getName();
    }
}
