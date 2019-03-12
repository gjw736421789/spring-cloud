package com.yanbian.movie.controller;

import com.yanbian.movie.entity.User;
import com.yanbian.movie.service.UserSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UserController {

	@Autowired
	private UserSevice userSsevice;

	@RequestMapping("findBookByid/{id}")
	public User fingall(@PathVariable int id){
		User user = userSsevice.findBookByid(id);
		return user;
	}

	@RequestMapping("test")
//	public String test(){
		public User test(){
//		System.out.println("21111111111111111111");
		User user =new User();
		user.setAnswer("哈哈");
		user.setEmail("736421789@qq.com");
		user.setId(5);
		user.setNickname("阿伟");
		user.setQuestion("密码问题");
		return user;
//		return "12345678";
	}
}
