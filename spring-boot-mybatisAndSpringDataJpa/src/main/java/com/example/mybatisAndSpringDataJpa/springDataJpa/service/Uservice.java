package com.example.mybatisAndSpringDataJpa.springDataJpa.service;

import com.example.mybatisAndSpringDataJpa.springDataJpa.dao.UserDao;
import com.example.mybatisAndSpringDataJpa.springDataJpa.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author steven-wan
 * @desc
 * @date 2020-07-29 11:08
 */
@Service
public class Uservice {
    @Autowired
    UserDao userDao;

    public User findById(Integer id) {
        return userDao.findById(id).get();
    }
}
