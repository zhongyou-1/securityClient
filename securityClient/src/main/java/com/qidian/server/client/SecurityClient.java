package com.qidian.server.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.qidian.server.hystric.DemoHystric;

/***
 * 
 * @title 
 * @author Xrt rong tao
 * @version 1.0.0
 * @since jdk1.8
 * @创建时间：2018年11月27日下午9:59:55
 * @功能描述： 这里的name 名称是提供者application.yml 中
 * application:
    name 的名称（serviceSecurity）
 */
/* value="serviceSecurity"  所要消费的提供者名称
 * fallback = DemoHystric.class
 * DemoHystric 是开启 断路器，当提供者崩溃或者连接超时则响应自定义提示
 * */
@FeignClient(value="serviceSecurity",fallback = DemoHystric.class)
public interface SecurityClient {

	/**
	 * server-hello 为提供者定义的访问地址
	 * @return
	 */
	 @RequestMapping(value = "hello",method = RequestMethod.GET)
	 public String hello();
	 
	/**
	 * server-hello 为提供者定义的访问地址
	 * @return
	 */
	 @RequestMapping(value = "helloPost",method = RequestMethod.POST)
	 public String helloPost();
}
