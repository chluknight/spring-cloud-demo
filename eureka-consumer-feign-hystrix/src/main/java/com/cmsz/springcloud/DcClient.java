package com.cmsz.springcloud;

import com.netflix.hystrix.Hystrix;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "eureka-client",fallback = DcClientFallback.class)
public interface DcClient {
    @GetMapping("/dc")
    String consumer();
}