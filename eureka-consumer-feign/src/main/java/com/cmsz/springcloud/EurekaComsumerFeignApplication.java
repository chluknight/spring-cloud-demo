package com.cmsz.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
//开启扫描Spring Cloud Feign客户端的功能
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaComsumerFeignApplication {
	/**
	 * 初始化RestTemplate，用来真正发起REST请求。
	 * **/
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	public static void main(String[] args) {
		SpringApplication.run(EurekaComsumerFeignApplication.class, args);
	}
}
