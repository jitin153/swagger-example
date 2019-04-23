package com.jitin.swaggerexample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/cntlr1")
public class SwaggerExampleController1 {

	@RequestMapping(value="/test",method=RequestMethod.GET)
	public String testMethod() {
		return "Swagger Example";
	}
}
