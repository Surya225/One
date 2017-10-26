package com.sbi_ins.hh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories({"com.sbi_ins.hh.dao"})
@ComponentScan({"com.sbi_ins.hh.controller","com.sbi_ins.hh.service"})
@EntityScan({"com.sbi_ins.hh.entity"})
public class HHApplication{

	public static void main(String[] args) {
		SpringApplication.run(HHApplication.class, args);
	}
}
