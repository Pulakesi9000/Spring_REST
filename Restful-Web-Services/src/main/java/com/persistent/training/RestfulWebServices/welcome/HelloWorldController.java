 package com.persistent.training.RestfulWebServices.welcome;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

 @RestController
public class HelloWorldController {

	 @RequestMapping(method=RequestMethod.GET, path="/welcome")
	 public String welcomeMessage(){
		 return "Hi Dude :)";
	 }
	 
	 @RequestMapping(method=RequestMethod.GET, path="/welcome-bean")
	 public WelcomeMessageBean welcomeMessageBean(){
		 return new WelcomeMessageBean("Hi, I am bean.");
	 }
	 
	 @GetMapping(path="/welcome/{name}")
	 public WelcomeMessageBean welcomeWithName(@PathVariable String name){
		 return new WelcomeMessageBean(String.format("Hi, %s welcome to REST services.", name));
	 }
}
