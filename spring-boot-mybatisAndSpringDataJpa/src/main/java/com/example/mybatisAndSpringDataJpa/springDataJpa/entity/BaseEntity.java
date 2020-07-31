package com.example.mybatisAndSpringDataJpa.springDataJpa.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @author steven-wan
 * @desc
 * @date 2020-07-29 10:20
 */
@Data
@MappedSuperclass
public class BaseEntity {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Integer id;
    /**
     *创建时间
     */
    @Column(name = "CREATED_AT")
    Date createdAt;

    /**
     *更新时间
     */
    @Column(name = "UPDATED_AT")
    Date updatedAt;
}
