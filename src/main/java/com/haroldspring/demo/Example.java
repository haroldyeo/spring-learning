package com.haroldspring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;


@Controller
@ComponentScan
@EnableAutoConfiguration
public class Example {
	
//	@Autowired
//	private MailSender mockMailSender;
	
//	@RequestMapping("/")
//	public String index(){
//		mockMailSender.send("Harold", "Hello","Hello Harold");
//		return "home";
//	}

    public static void main(String[] args) throws Exception {
    	SpringApplication application = new SpringApplication(Example.class);
		application.setApplicationContextClass(AnnotationConfigApplicationContext.class);
        SpringApplication.run(Example.class, args);
    }

}