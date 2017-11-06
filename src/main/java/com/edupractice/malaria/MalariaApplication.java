package com.edupractice.malaria;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.DispatcherServlet;

@SpringBootApplication
@EnableCaching //启用缓存
@EnableScheduling //启用定时任务
@EnableAsync //启用异步执行注解
@MapperScan("com.edupractice.malaria.modules.*.dao")//配置Mapper接口类扫描路径
public class MalariaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MalariaApplication.class, args);
	}
}
