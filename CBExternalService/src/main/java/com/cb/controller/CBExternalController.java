package com.cb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CBExternalController {
	
	@GetMapping("/call_external_service")
	public String message() {
		return "External Service has been called successfully";
		
	}

}
