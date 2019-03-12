package com.yanbian.user.controller;

import com.yanbian.user.entity.User;
import com.yanbian.user.service.UserFeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserFeignController {

	@Resource
	private UserFeignClient userFeignClient;

	@RequestMapping("/feignInfo/{id}")
	public User feignInfo(@PathVariable("id") int id) {

		return this.userFeignClient.find(id);
	}
	@RequestMapping("/test")
	public User show() {

		return this.userFeignClient.show();
	}


}
