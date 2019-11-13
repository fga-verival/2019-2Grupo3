package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import application.Aplicacao;

public class RendimentoLiquidoTest {

	@Test
	public void testRendimentoLiquido() {
		Aplicacao aplicacao = new Aplicacao(60, 1000f, 8.5f, 22.5f);
		assertEquals(1.0829f, aplicacao.calcularRendimentoLiquido(), 0.01f);
	}

}
