package br.com.alura.loja.teste;

import java.math.BigDecimal;

import br.com.alura.loja.modelo.Orcamento;
import br.com.alura.loja.modelo.ICMS;
import br.com.alura.loja.modelo.ISS;
import br.com.alura.loja.service.CalculadoraImpostosService;

public class TesteImpostos {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
		CalculadoraImpostosService calculadoraImpostosService = new CalculadoraImpostosService();

		System.out.println("Imposto ICMS: " + calculadoraImpostosService
				.calcular(orcamento, new ICMS()));

		System.out.println("Imposto ISS: " + calculadoraImpostosService
				.calcular(orcamento, new ISS()));

	}

}
