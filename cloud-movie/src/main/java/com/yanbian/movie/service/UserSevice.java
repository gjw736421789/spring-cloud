package com.yanbian.movie.service;

import com.yanbian.movie.entity.User;
import com.yanbian.movie.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserSevice {

	@Autowired
	private UserMapper userMapper;

	public User findBookByid(int id){
		System.out.println("2222222222222222222");
		User user = userMapper.findBookByid(id);

		return user;
	}
}
