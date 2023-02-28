package com.test.start1.tester;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("test2")
@RestController
@ResponseBody
public class TestController {
	
	@GetMapping("main")
	public String main() {
		System.out.println("work");
		return "mainiswork";
	}
}
