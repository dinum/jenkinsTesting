package lk.dinum.jenkins.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@GetMapping("/employee")
	public String getEmployee() {
		return "Hello World";
	}
	
}
