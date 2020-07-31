package com.example.mybatisAndSpringDataJpa.springDataJpa.controller;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mybatisAndSpringDataJpa.mybatis.mapper.UserMapper;
import com.example.mybatisAndSpringDataJpa.springDataJpa.dao.OrderDao;
import com.example.mybatisAndSpringDataJpa.springDataJpa.entity.User;
import com.example.mybatisAndSpringDataJpa.springDataJpa.service.Uservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
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

    @Autowired
    UserMapper userMapper;

    @RequestMapping(value = "/user")
    @ResponseBody
    public String findById(Integer id) {
        User user = uservice.findById(id);
        return user.getName();
    }

    @RequestMapping(value = "/insert")
    @ResponseBody
    public String insert() {
        User user = new User();
        user.setName("steven");
        user.setAddress("shizo");
        user.setTel("13207459687");
        user.setCreatedAt(new Date());
        user.setUpdatedAt(new Date());
        boolean save = uservice.save(user);
        System.out.println(save);
        return "";
    }

    @RequestMapping(value = "/countUsersWhoHaveBoughtGoods")
    @ResponseBody
    public String countUsersWhoHaveBoughtGoods(Integer id) {
        int i = userMapper.countUserIdDistinctByGoodsId(id);
        User user = userMapper.selectUser(id);
        User user1 = userMapper.selectById(id);
        System.out.println(JSON.toJSONString(user1));

        System.out.println(JSON.toJSONString(user));
        return i+"";
    }

    @RequestMapping(value = "/getUsersByPageOrderedByIdDesc")
    @ResponseBody
    public String getUsersByPageOrderedByIdDesc() {
        Page page = new Page(1,3);

        Page page1 = uservice.page(page);
      //  page.setOptimizeCountSql(true);
        List records = page1.getRecords();
        //List<User> userList = uservice.getUsersByPageOrderedByIdDesc();
        return JSON.toJSONString(page1);
    }
}
