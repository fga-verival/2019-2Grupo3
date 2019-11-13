package tests;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import application.Aplicacao;

@RunWith(Parameterized.class)
public class ImpostoDeRendaTest {
	
	private Integer qtdDias;
	private Float aplicacaoInicial;
	private Float taxaJurosAnual;
	private Float aliquotaImpostoRenda;
	private Float impostoRenda;
	
	public ImpostoDeRendaTest(
			Integer qtdDias, 
			Float aplicacaoInicial, 
			Float taxaJurosAnual, 
			Float aliquotaImpostoRenda, 
			Float impostoRenda) {
		this.qtdDias = qtdDias;
		this.aplicacaoInicial = aplicacaoInicial;
		this.taxaJurosAnual = taxaJurosAnual;
		this.aliquotaImpostoRenda = aliquotaImpostoRenda;
		this.impostoRenda = impostoRenda;
	}
	
	@Parameters
	public static Iterable<Object[]> getParameters() {
		Object[][] res = new Object[][] {
			{120, 500f, 8f, 22.5f, 2.96f},
			{270, 2000f, 8.5f, 20f, 25.15f},
			{550, 400f, 8f, 17.5f, 8.44f}
		};
		return Arrays.asList(res);
	}
	
	@Test
	public void testImpostoRenda() {
		Aplicacao aplicacao = new Aplicacao(qtdDias, aplicacaoInicial, taxaJurosAnual, aliquotaImpostoRenda);
		assertEquals(impostoRenda, aplicacao.calcularImpostoDeRenda(), 0.01f);
	}

}
