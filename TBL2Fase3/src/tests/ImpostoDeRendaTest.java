package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import application.Aplicacao;

public class ImpostoDeRendaTest {

	@Test
	public void testImpostoRenda() {
		Aplicacao aplicacao = new Aplicacao(60, 1000f, 8.5f, 22.5f);
		assertEquals(3.14f, aplicacao.calcularImpostoDeRenda(), 0.01f);
	}
	
	@Test
	public void testImpostoRenda2() {
		Aplicacao aplicacao = new Aplicacao(120, 500f, 8f, 22.5f);
		assertEquals(2.96f, aplicacao.calcularImpostoDeRenda(), 0.01f);
	}

}
