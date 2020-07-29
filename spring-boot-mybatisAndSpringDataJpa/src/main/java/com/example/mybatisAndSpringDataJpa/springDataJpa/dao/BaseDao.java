package com.example.mybatisAndSpringDataJpa.springDataJpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseDao<T, ID> extends CrudRepository<T, ID>, JpaRepository<T, ID> {
}
