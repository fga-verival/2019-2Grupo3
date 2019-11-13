package tests;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import application.Aplicacao;

@RunWith(Parameterized.class)
public class RendimentoLiquidoTest {
	
	private Integer qtdDias;
	private Float aplicacaoInicial;
	private Float taxaJurosAnual;
	private Float aliquotaImpostoRenda;
	private Float rendimentoLiquido;
	
	public RendimentoLiquidoTest(
			Integer qtdDias, 
			Float aplicacaoInicial, 
			Float taxaJurosAnual, 
			Float aliquotaImpostoRenda, 
			Float rendimentoLiquido) {
		this.qtdDias = qtdDias;
		this.aplicacaoInicial = aplicacaoInicial;
		this.taxaJurosAnual = taxaJurosAnual;
		this.aliquotaImpostoRenda = aliquotaImpostoRenda;
		this.rendimentoLiquido = rendimentoLiquido;
	}
	
	@Parameters
	public static Iterable<Object[]> getParameters() {
		Object[][] res = new Object[][] {
			{60, 1000f, 8.5f, 22.5f, 1.0829f},
			{120, 500f, 8f, 22.5f, 2.0384f},
			{240, 3000f, 9f, 20f, 4.7342f},
			{1000, 100f, 7.5f, 15f, 17.4658f}
		};
		return Arrays.asList(res);
	}
	
	@Test
	public void testRendimentoLiquido() {
		Aplicacao aplicacao = new Aplicacao(qtdDias, aplicacaoInicial, taxaJurosAnual, aliquotaImpostoRenda);
		assertEquals(rendimentoLiquido, aplicacao.calcularRendimentoLiquido(), 0.01f);
	}

}
