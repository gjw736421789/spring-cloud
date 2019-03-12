package com.yanbian.user.config;

import feign.Contract;
import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuration1 {
	@Bean
	public Contract FeignCurrency(){
		return new feign.Contract.Default();
	}

	/**
	 * 添加日志级别FULL全部打印
	 * @return
	 */
	@Bean
	Logger.Level feihnLoggerLevel(){
		return Logger.Level.FULL;
	}
}
