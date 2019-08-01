package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Calculation;
import com.example.form.CalculationForm;

@Controller
@RequestMapping("/enshu2")
public class Enshu2Controller {

	@Autowired
	private HttpSession session;

	@ModelAttribute
	public CalculationForm setUpName() {
		return new CalculationForm();

	}

	@RequestMapping("")
	public String index() {
		return "exam02";
	}

	@RequestMapping("/receive-form")
	public String receiveForm(CalculationForm calculationForm) {
		Calculation calculation = new Calculation();
		calculation.setNum1(calculationForm.getIntNum1());
		calculation.setNum2(calculationForm.getIntNum2());
		int total = calculationForm.getIntNum1() + calculationForm.getIntNum2();
		session.setAttribute("num1", calculation);
		session.setAttribute("num2", calculation);
		session.setAttribute("total", total);
		return "exam02-result";

	}

	@RequestMapping("/togo2")
	public String togo2() {
		return "exam02-result2";

	}

}
