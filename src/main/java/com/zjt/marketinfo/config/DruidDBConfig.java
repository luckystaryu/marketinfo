package com.zjt.marketinfo.config;


import com.alibaba.druid.pool.DruidDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.sql.SQLException;


/**
 * springboot 整合druid连接池
 */
@Configuration
public class DruidDBConfig {

    private static final Logger logger = LoggerFactory.getLogger(DruidDBConfig.class);
    @Bean
    public ServletRegistrationBean druidServlt() {
        logger.info("init Druid Sevrvlt Configuration");
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();
        //IP白名单
        servletRegistrationBean.addInitParameter("allow", "");
        //IP黑名单(同时存在DENY优先于allow)
        servletRegistrationBean.addInitParameter("deny", "");
        //控制台管理用户
        servletRegistrationBean.addInitParameter("loginUsername", "root");
        servletRegistrationBean.addInitParameter("loginPassword", "root");
        //是否能够重置数据,禁用HTML页面上的"RESET ALL"功能
        servletRegistrationBean.addInitParameter("resetEnable", "false");
        return servletRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        return filterRegistrationBean;
    }
}
