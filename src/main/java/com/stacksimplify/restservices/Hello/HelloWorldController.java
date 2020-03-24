package com.stacksimplify.restservices.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
	//URI and simple method
//	@RequestMapping(method = RequestMethod.GET, path = "/helloworld")
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World";
	}

	@GetMapping("/hello-world-bean")
	public UserDetail helloWorldBean() {
		return new UserDetail("Aman", "Deep", "Delhi");
	}
}
