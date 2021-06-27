package com.zzl.blogz.config;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

@SpringBootApplication
@ComponentScan("com.zzl") //扫描这个包
@MapperScan("com.zzl.blogz.mapper") //声明这个包是持久层
public class BlogzApplication {

    private static Logger LOG = LoggerFactory.getLogger(BlogzApplication.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(BlogzApplication.class);
        Environment environment = app.run(args).getEnvironment();
        LOG.info("启动成功!");
        LOG.info("地址:\thttp://127.0.0.1:{}", environment.getProperty("server.port"));
    }

}
