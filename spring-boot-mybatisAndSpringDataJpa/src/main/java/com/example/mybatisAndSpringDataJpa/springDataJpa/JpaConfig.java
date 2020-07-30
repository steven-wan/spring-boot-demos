//package com.example.mybatisAndSpringDataJpa.springDataJpa;
//
//import com.zaxxer.hikari.HikariConfig;
//import com.zaxxer.hikari.HikariDataSource;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import javax.persistence.EntityManagerFactory;
//import javax.sql.DataSource;
//
///**
// * @author steven-wan
// * @desc
// * @date 2020-07-29 09:23
// */
//@Configuration
//@EnableJpaRepositories
//@EnableTransactionManagement
//public class JpaConfig {
////    @Bean
////    public DataSource dataSource() {
//////        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
//////        return builder.setType(EmbeddedDatabaseType.H2).build();
//////        HikariConfig config = new HikariConfig();
////        HikariDataSource ds = new HikariDataSource();
////        ds.setJdbcUrl("jdbc:h2:file:D:/workspace/hcsp/spring-boot-demos/spring-boot-mybatisAndSpringDataJpa/target/test");
////        ds.setUsername("root");
////        ds.setPassword("Jxi1Oxc92qSj");
////        return ds;
////    }
//
//    @Bean
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {
//
//        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
//
//        // vendorAdapter.setGenerateDdl(true);
//
//        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
//        factory.setJpaVendorAdapter(vendorAdapter);
//
//        factory.setPackagesToScan("com.example.mybatisAndSpringDataJpa.springDataJpa");
//        factory.setDataSource(dataSource);
//        return factory;
//    }
//
//    @Bean
//    public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
//
//        JpaTransactionManager txManager = new JpaTransactionManager();
//        txManager.setEntityManagerFactory(entityManagerFactory);
//        return txManager;
//    }
//}
