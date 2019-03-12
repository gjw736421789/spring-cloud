package com.yanbian.user.service;

import com.yanbian.user.config.Configuration1;
import com.yanbian.user.entity.User;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
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
	public User find(@Param("id") int id);

//	@RequestMapping(value = "test", method = RequestMethod.GET)
	@RequestLine("GET /test")
	public User show();

}
