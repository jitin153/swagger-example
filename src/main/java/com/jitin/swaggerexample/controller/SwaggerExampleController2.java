package com.jitin.swaggerexample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/cntlr2")
public class SwaggerExampleController2 {

	@RequestMapping(value="/test1",method=RequestMethod.GET)
	public String testMethod1() {
		return "Swagger Example";
	}
	@RequestMapping(value="/test2",method=RequestMethod.GET)
	public int testMethod2() {
		return 1;
	}
}
