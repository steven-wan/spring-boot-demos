package com.example.mybatisAndSpringDataJpa.springDataJpa.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mybatisAndSpringDataJpa.mybatis.mapper.UserMapper;
import com.example.mybatisAndSpringDataJpa.springDataJpa.dao.UserDao;
import com.example.mybatisAndSpringDataJpa.springDataJpa.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author steven-wan
 * @desc
 * @date 2020-07-29 11:08
 */
@Service
public class Uservice extends ServiceImpl<UserMapper,User> {
    @Autowired
    UserDao userDao;

    public User findById(Integer id) {
        return userDao.findById(id).get();
    }

    public List<User> getUsersByPageOrderedByIdDesc() {
        return userDao.findAllByOrderByIdDesc(PageRequest.of(1, 3));
    }
}
