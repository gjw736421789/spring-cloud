package com.yanbian.user.service;

import com.yanbian.user.config.Configuration1;
import com.yanbian.user.config.Configuration2;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "XXX",url = "http://localhost:8761/",configuration = Configuration2.class)
public interface UserFeignClient2 {
	@RequestLine("GET /eureka/apps/{serviceName}")
	public String getServiceInfoByserviceName(@Param("serviceName") String serviceName) ;
	/**
	 * 不清楚这里为什么必须用Param
	 */
}
