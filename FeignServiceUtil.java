package com.example.springboot.feign.util;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="feignStudent",url="http://localhost:8084/student")
public interface FeignServiceUtil {
	
	
	@GetMapping("/name")
	String getName() ;
	
	@GetMapping("/address")
	String getAddress();

	@GetMapping("/branch")
	String getBranch();

}
