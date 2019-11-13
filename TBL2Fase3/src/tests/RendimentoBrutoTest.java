package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import application.Aplicacao;

public class RendimentoBrutoTest {

	@Test
	public void testRendimentoBruto() {
		// 60 dias, 1000 de aplicação inicial, 8.5 de taxa de juros anual, 22.5 aliquota
		Aplicacao aplicacao = new Aplicacao(60, 1000f, 8.5f, 22.5f);
		assertEquals(13.97f, aplicacao.calcularRendimentoBruto(), 0.01f);
	}

}
