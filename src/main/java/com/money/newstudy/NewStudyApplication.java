package com.money.newstudy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan( basePackages = {"com.money.newstudy.biz.autoCode.mapper","com.money.newstudy.biz.mapper"})
public class NewStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewStudyApplication.class, args);
	}

}
