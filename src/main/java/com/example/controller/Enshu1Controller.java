package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.form.Enshu1Form;

@Controller
@RequestMapping("/Enshu1")
public class Enshu1Controller {

	@ModelAttribute
	public Enshu1Form setUpName() {
		return new Enshu1Form();
		
	}
	
	
}
