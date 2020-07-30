package com.example.mybatisAndSpringDataJpa.springDataJpa.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author steven-wan
 * @desc
 * @date 2020-07-29 10:09
 */
@Data
@Entity
@Table(name = "\"ORDER\"")
public class Order extends BaseEntity{

    /**
     * 用户ID
     */
    @Column(name = "USER_ID")
    Integer userId;
    /**
     * 商品ID
     */
    @Column(name = "GOODS_ID")
    Integer goodsId;
    /**
     *订单数量
     */
    @Column(name = "GOODS_NUM")
    Integer goodsNum;

    /**
     *订单金额
     */
    @Column(name = "GOODS_PRICE")
    BigDecimal goodsPrice;



}
