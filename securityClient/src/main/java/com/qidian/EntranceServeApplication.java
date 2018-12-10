package com.qidian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication  
@EnableFeignClients 
@EnableHystrixDashboard  
@EnableEurekaClient // 启用服务注册与发现 （声明是个提供者）
public class EntranceServeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EntranceServeApplication.class, args);
	}
}
