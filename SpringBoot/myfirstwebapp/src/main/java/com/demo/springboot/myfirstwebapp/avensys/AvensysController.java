package com.demo.springboot.myfirstwebapp.avensys;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AvensysController {
	// localhost:8080/avensys?name=Trainees
	@RequestMapping("avensys")
	public String AvensysPage(@RequestParam String name, ModelMap model) {
		model.put("name", name);
		return "avensys";
	}
}
