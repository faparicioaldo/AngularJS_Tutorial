package com.tutorial.angular.js.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitController {

	@GetMapping("/init")
	public @ResponseBody String init() {
		return "Hola Mundo!!!";
	}
}
