package tests;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import application.Aplicacao;

@RunWith(Parameterized.class)
public class RendimentoBrutoTest {
	
	private Integer qtdDias;
	private Float aplicacaoInicial;
	private Float taxaJurosAnual;
	private Float aliquotaImpostoRenda;
	private Float rendimentoBruto;
	
	public RendimentoBrutoTest(
			Integer qtdDias, 
			Float aplicacaoInicial, 
			Float taxaJurosAnual, 
			Float aliquotaImpostoRenda, 
			Float rendimentoBruto) {
		this.qtdDias = qtdDias;
		this.aplicacaoInicial = aplicacaoInicial;
		this.taxaJurosAnual = taxaJurosAnual;
		this.aliquotaImpostoRenda = aliquotaImpostoRenda;
		this.rendimentoBruto = rendimentoBruto;
	}
	
	@Parameters
	public static Iterable<Object[]> getParameters() {
		Object[][] res = new Object[][] {
			{60, 1000f, 8.5f, 22.5f, 13.97f},
			{120, 500f, 8f, 22.5f, 13.15f},
			{240, 3000f, 9f, 20f, 177.53f},
			{420, 250f, 8f, 17.5f, 23.01f}
		};
		return Arrays.asList(res);
	}
	
	@Test
	public void testRendimentoBruto() {
		Aplicacao aplicacao = new Aplicacao(qtdDias, aplicacaoInicial, taxaJurosAnual, aliquotaImpostoRenda);
		assertEquals(rendimentoBruto, aplicacao.calcularRendimentoBruto(), 0.01f);
	}
	
}
