package com.eventapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventappController{
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
}