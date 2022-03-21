package com.eventapp.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@ComponentScan
public class EventoController {
	@RequestMapping("/cadastrarEvento")
	public String form() {
		return "evento/formEvento";
	}
}
