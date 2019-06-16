package com.xpp.sbdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@Slf4j
@EnableScheduling
@EnableTransactionManagement
public class SbdemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(SbdemoApplication.class, args);
	}

}
