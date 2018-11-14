package com.tedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController //springboot专门的注解, 标识是一个controller,(里面包含了controller注解)
public class HelloController{
	@RequestMapping("/hello/{name}")
	@ResponseBody
	public String hello(@PathVariable String name){
		return "hello"+name;
	}
	

}
