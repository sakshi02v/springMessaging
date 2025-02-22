package com.example.demo;
	
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class Controller {
	    @GetMapping("/hello")
	    public String hello(){
	        return "Hello from Bridgelabz ";
	    }
	    
	    @GetMapping("/query")
	    public String getHello(@RequestParam String name) {
	        return "Hello " + name + " from BridgeLabz";
	    }
	    
	    @GetMapping("/param/{name}")
	    public String sayHello(@PathVariable String name) {
	        return "Hello " + name + " from BridgeLabz";
	    }
	    
	    @PostMapping("/hello/post")
	    public String postHello(@RequestBody User user) {
	        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
	    }

}
