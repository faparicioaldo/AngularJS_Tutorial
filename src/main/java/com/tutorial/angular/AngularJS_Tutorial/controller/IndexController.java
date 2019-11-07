package com.tutorial.angular.AngularJS_Tutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

	@GetMapping("/Hola")
	public @ResponseBody String init() {
		return "Hola Mundo!!!";
	}
}
