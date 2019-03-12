package com.yanbian.user.service;

import com.yanbian.user.config.Configuration1;
import com.yanbian.user.entity.User;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.websocket.server.PathParam;

/**
 * name是服务名字
 */
@FeignClient(name = "cloud-movie",configuration = Configuration1.class)
public interface UserFeignClient {

	/**
	 * 这里的请求要和被请求的方法一致，cloud-move中的controller的请求路径一致
	 * @param id
	 * @return
	 */

//	@RequestMapping(value = "findBookByid/{id}", method = RequestMethod.GET)
	@RequestLine("GET /findBookByid/{id}")
	public User findById(@RequestParam("id") int id);

//	@RequestMapping(value = "test", method = RequestMethod.GET)
	@RequestLine("GET /test")
	public User show();

}
