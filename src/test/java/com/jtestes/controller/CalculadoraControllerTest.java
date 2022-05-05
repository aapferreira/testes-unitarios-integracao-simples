package com.jtestes.controller;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.junit.jupiter.api.Test;

@ExtendWith(SpringExtension.class)
@WebMvcTest(CalculadoraController.class)
public class CalculadoraControllerTest {
	
	@Autowired
	private MockMvc mvc;
	
	@Test
	void somarTest() throws Exception {
		RequestBuilder request = get("/calc").param("n", "2.0").param("m", "2.0");
		MvcResult resultado = mvc.perform(request).andReturn();
		assertEquals("4.0", resultado.getResponse().getContentAsString());
	}

}
