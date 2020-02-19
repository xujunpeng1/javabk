package com.jabk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jabk.mapper")
public class JavabkApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavabkApplication.class, args);
	}

}
