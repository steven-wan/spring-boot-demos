package com.example.mybatisAndSpringDataJpa.mybatis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mybatisAndSpringDataJpa.springDataJpa.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.repository.query.Param;


public interface UserMapper extends BaseMapper<User> {
    @Select(value = "select count(distinct USER_ID) from \"ORDER\" where GOODS_ID =#{goodsId}")
    int countUserIdDistinctByGoodsId(@Param("goodsId") int goodsId);

    User selectUser(int id);
}
