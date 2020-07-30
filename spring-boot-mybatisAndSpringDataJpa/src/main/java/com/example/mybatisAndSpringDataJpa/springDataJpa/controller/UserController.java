package com.example.mybatisAndSpringDataJpa.springDataJpa.controller;

import com.alibaba.fastjson.JSON;
import com.example.mybatisAndSpringDataJpa.springDataJpa.dao.OrderDao;
import com.example.mybatisAndSpringDataJpa.springDataJpa.entity.User;
import com.example.mybatisAndSpringDataJpa.springDataJpa.service.Uservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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

    @Autowired
    OrderDao orderDao;

    @RequestMapping(value = "/user")
    @ResponseBody
    public String findById(Integer id) {
        User user = uservice.findById(id);
        return user.getName();
    }

    @RequestMapping(value = "/countUsersWhoHaveBoughtGoods")
    @ResponseBody
    public String countUsersWhoHaveBoughtGoods(Integer id) {
        int i = orderDao.countUserIdDistinctByGoodsId(id);
        return i+"";
    }

    @RequestMapping(value = "/getUsersByPageOrderedByIdDesc")
    @ResponseBody
    public String getUsersByPageOrderedByIdDesc() {
        List<User> userList = uservice.getUsersByPageOrderedByIdDesc();
        return JSON.toJSONString(userList);
    }
}
