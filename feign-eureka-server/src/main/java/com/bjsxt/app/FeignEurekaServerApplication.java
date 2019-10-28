package com.bjsxt.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //该项目是注册中心服务端
public class FeignEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignEurekaServerApplication.class, args);
	}

}
