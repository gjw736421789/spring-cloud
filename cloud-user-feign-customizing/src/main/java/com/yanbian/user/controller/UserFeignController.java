package com.yanbian.user.controller;

import com.yanbian.user.entity.User;
import com.yanbian.user.service.UserFeignClient;
import com.yanbian.user.service.UserFeignClient2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserFeignController {

	@Autowired
	private UserFeignClient userFeignClient;
	@Autowired
	private UserFeignClient2 userFeignClient2;

	@RequestMapping(value = "feign/{id}",method = RequestMethod.GET)
	public User find(@PathVariable("id") int id) {
		return userFeignClient.find(id);
	}
	@RequestMapping("/test")
	public User show() {

		return this.userFeignClient.show();
	}

	@GetMapping("/{serviceName}")
	public String getServiceInfoByserviceName(@PathVariable String serviceName){
		return userFeignClient2.getServiceInfoByserviceName(serviceName);
	}


}
