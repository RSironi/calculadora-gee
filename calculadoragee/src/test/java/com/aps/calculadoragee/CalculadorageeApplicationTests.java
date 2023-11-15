package com.aps.calculadoragee;

import com.aps.calculadoragee.service.RegistroService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.DecimalFormat;
import java.text.NumberFormat;

@SpringBootTest
class CalculadorageeApplicationTests {

	private RegistroService registroService;

	NumberFormat nf = new DecimalFormat("###,###,###");

	@Test
	void contextLoads() {

	}

}