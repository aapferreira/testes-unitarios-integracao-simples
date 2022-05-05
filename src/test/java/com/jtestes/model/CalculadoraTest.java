package com.jtestes.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculadoraTest {
	
	Calculadora calculadora;
	Double n1, n2;
	
	@BeforeEach
	void iniciar() {
		calculadora = new Calculadora();
		n1 = 2.0;
		n2 = 2.0;
	}
	
	@Test
	void somaTest() {		
		assertEquals(4, calculadora.soma(n1, n2));
	}

	@Test
	void subtracao() {		
		assertEquals(0.0, calculadora.subtracao(n1, n2));
	}
	
}
