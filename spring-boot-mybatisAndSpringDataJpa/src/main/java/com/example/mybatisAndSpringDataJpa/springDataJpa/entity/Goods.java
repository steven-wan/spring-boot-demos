package com.example.mybatisAndSpringDataJpa.springDataJpa.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author steven-wan
 * @desc
 * @date 2020-07-29 10:25
 */
@Data
@Entity
@Table(name = "GOODS")
public class Goods extends BaseEntity{

    /**
     *姓名
     */
    String name;

    /**
     *商品金额
     */
    BigDecimal price;
}
