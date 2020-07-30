package com.example.mybatisAndSpringDataJpa.springDataJpa.dao;

import com.example.mybatisAndSpringDataJpa.springDataJpa.entity.Order;
import org.springframework.data.jpa.repository.Query;

public interface OrderDao extends BaseDao<Order, Integer> {
    @Query(value = "select count(distinct USER_ID) from \"ORDER\" where GOODS_ID =?" ,nativeQuery = true)
    int countUserIdDistinctByGoodsId(int goodsId);
}
