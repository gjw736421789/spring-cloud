package com.yanbian.movie.Controller;

import com.yanbian.movie.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import sun.net.www.http.HttpClient;

import java.awt.print.Book;

@RestController
public class UserController {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("movie/{id}")
	public User show(@PathVariable int id){
		String url="http://cloud-movie/findBookByid/"+id;
		System.out.println(url);
		User user=restTemplate.getForObject(url,User.class);
		return user;
	}


	@RequestMapping("movie/test")
	public String test(){
		String string=restTemplate.getForObject("http://cloud-movie/test",String.class);
//		System.out.println(string);
		return string;
	}
}
