package com.jenkins;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(value="/get")
public class JenkinController {

	@GetMapping(value="/data")
	public String getName() {
		return "Today is Holiday";
	}
	
}
