 package com.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//启动类,标识是一个SpringBoot应用程序
//这个类必须放在所有运行服务@Contr..@Ser...的父级目录
@SpringBootApplication
public class RunApp {
//入口
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(RunApp.class,args );
	}

}
