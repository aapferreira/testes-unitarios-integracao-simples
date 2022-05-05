package com.jtestes.controller;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jtestes.model.Calculadora;

@RestController
public class CalculadoraController {

	@GetMapping("/calc")
	public Double somar(@RequestParam(name="n") Double n, @RequestParam(name="m") Double m) {
		return new Calculadora().soma(n, m);
	}
	
//	@GetMapping("/calc/{n1}/{n2}")
//	public Double somar(@PathVariable("n1") Double n1, @PathVariable("n2") Double n2) {
//		return new Calculadora().soma(n1, n2);
//	}
	
	
}
