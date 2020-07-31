package com.example.mybatisAndSpringDataJpa.mybatis.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.pagination.optimize.JsqlParserCountOptimize;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileUrlResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * @author steven-wan
 * @desc
 * @date 2020-07-31 15:04
 */
@Configuration
@MapperScan(value = {"com.example.mybatisAndSpringDataJpa.mybatis.mapper"})
public class MybatisConifg {
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        // 设置请求的页面大于最大页后操作， true调回到首页，false 继续请求  默认false
        // paginationInterceptor.setOverflow(false);
        // 设置最大单页限制数量，默认 500 条，-1 不受限制
        // paginationInterceptor.setLimit(500);
        // 开启 count 的 join 优化,只针对部分 left join
        paginationInterceptor.setCountSqlParser(new JsqlParserCountOptimize(true));
        return paginationInterceptor;
    }
//    @Bean
//    public SqlSessionFactory sqlSessionFactory(DataSource dateSource) throws Exception {
//        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
//        factoryBean.setDataSource(dateSource);
//        ResourcePatternResolver resourceResolver = new PathMatchingResourcePatternResolver();
//        factoryBean.setMapperLocations(resourceResolver.getResources("classpath:db/mapper/*Mapper.xml"));
//        return factoryBean.getObject();
//    }
//
//    @Bean
//    public DataSourceTransactionManager transactionManager(DataSource dateSource) {
//        return new DataSourceTransactionManager(dateSource);
//    }
}
