package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Member;
import com.example.form.Enshu1Form;

@Controller
@RequestMapping("/Enshu1")
public class Enshu1Controller {

	@ModelAttribute
	public Enshu1Form setUpName() {
		return new Enshu1Form();
		
	}
	@RequestMapping("")
	public String index() {
		return "exam01";
	}
	
	@RequestMapping("/receive-form")
	public String receiveForm(Model model,Enshu1Form enshu1Form) {
		Member member = new Member();
		member.setName(enshu1Form.getName());
		model.addAttribute("member",member);
		return "exam01-result";
	}
	
}
