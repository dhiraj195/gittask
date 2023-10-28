package com.trigent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestNortvisTaskApplication {

	public static void main(String[] args) {
		SpringApplication.from(NortvisTaskApplication::main).with(TestNortvisTaskApplication.class).run(args);
	}

}
