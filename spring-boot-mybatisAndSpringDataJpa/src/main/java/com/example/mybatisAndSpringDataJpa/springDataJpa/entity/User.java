package com.example.mybatisAndSpringDataJpa.springDataJpa.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author steven-wan
 * @desc
 * @date 2020-07-29 10:19
 */
@Data
@Entity
@Table(name = "USER")
public class User extends BaseEntity{

    /**
     *姓名
     */
    String name;

    /**
     *电话
     */
    String tel;

    /**
     *地址
     */
    String address;
}
