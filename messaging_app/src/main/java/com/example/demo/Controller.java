package com.example.demo;
	
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	    

}
