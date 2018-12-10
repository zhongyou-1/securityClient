package com.qidian.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.qidian.server.client.SecurityClient;

/**
 * 
 * @title 测试类
 * @author Xrt rong tao
 * @version 1.0.0
 * @since jdk1.8
 * @创建时间：2018年11月27日下午7:40:15 @功能描述：
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

	protected static Logger logger = LoggerFactory.getLogger(DemoController.class);
 
	
	@Autowired
	private  SecurityClient securityClient;
	
	@RequestMapping("/testServer")
	@ResponseBody
	public String testServer( ) {
		 
		logger.info("进来了--------------》》》》");
		return securityClient.hello( )+""+System.currentTimeMillis() ;
	}
	
	@RequestMapping(value="/testServerPost",method = RequestMethod.POST)
	@ResponseBody
	public String testServerPost( ) {
		 
		logger.info("进来了--------------》》》》");
		return securityClient.helloPost( )+""+System.currentTimeMillis() ;
	}
}
