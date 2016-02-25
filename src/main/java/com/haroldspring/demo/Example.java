package com.haroldspring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.haroldspring.mail.MailSender;

@RestController
//@EnableAutoConfiguration
@ComponentScan
public class Example {
	
	@Autowired
	private MailSender mockMailSender;
	
	@RequestMapping("/")
	public String index(){
		mockMailSender.send("Harold", "Hello","Hello Harold");
		return "Hello, world";
	}

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }

}