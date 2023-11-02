package com.henggao.cmlake.config;

import javax.sql.DataSource;

// import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;

// 配置类
@Configuration
public class DruidConfig {
    /*
        将自定义的Druid数据源添加到容器中，不再由Spring Boot自动创建
        绑定全局配置文件中的druid数据源属性，到com.alibaba.druid.pool.DruidDataSource从而让它们生效
        @ConfigurationProperties(prefix = "spring.datasource")：作用就是将全局配置文件中，
        前缀为spring.datasource的属性值注入到com.alibaba.druid.pool.DruidDataSource的同名参数中
    */
    // @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource druidDataSource() {
        // return new DruidDataSource();
        //使用构造器模式创建数据源，这是druid里面提供给我们的入口
        return DruidDataSourceBuilder.create().build();
    }
}