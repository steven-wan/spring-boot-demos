package com.example.mybatisAndSpringDataJpa.springDataJpa.dao;

import com.example.mybatisAndSpringDataJpa.springDataJpa.entity.User;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author steven-wan
 * @desc
 * @date 2020-07-29 10:27
 */
public interface UserDao extends BaseDao<User,Integer> {
    List<User> findAllByOrderByIdDesc(Pageable pageable);
}
