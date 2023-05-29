package com.demo.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {
	
	@Autowired
	private CurrencyServiceConfiguration config;
	
	@RequestMapping("/currency-config")
	public CurrencyServiceConfiguration retrieveConfig() {
		return config;
	}
}
