package com.reddyjava.springjenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringJenkinsApplication {
	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);
	@PostConstruct
	public void init(){
		logger.info("application started.....");
	}

	public static void main(String[] args) {
		logger.info("application started.....");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
