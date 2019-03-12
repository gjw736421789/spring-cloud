package com.yanbian.user.service;

import com.yanbian.user.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * name是服务名字
 */
@FeignClient("cloud-movie")
public interface UserFeignClient {

	/**
	 * 这里的请求要和被请求的方法一致，cloud-move中的controller的请求路径一致
	 * @param id
	 * @return
	 */

	@RequestMapping(value = "findBookByid/{id}", method = RequestMethod.GET)
	public User findById(@PathVariable("id") int id);

	@RequestMapping(value = "test", method = RequestMethod.GET)
	public User show();

}
