package br.com.alura.loja.teste;

import java.math.BigDecimal;

import br.com.alura.loja.modelo.Orcamento;
import br.com.alura.loja.modelo.ICMS;
import br.com.alura.loja.modelo.ISS;
import br.com.alura.loja.modelo.ItemOrcamento;
import br.com.alura.loja.service.CalculadoraImpostosService;

public class TesteImpostos {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("100")));

		CalculadoraImpostosService calculadoraImpostosService = new CalculadoraImpostosService();

		System.out.println("Imposto ICMS: " + calculadoraImpostosService
				.calcular(orcamento, new ICMS(null)));

		System.out.println("Imposto ISS: " + calculadoraImpostosService
				.calcular(orcamento, new ISS(null)));

		System.out.println(
				"Imposto ISS com ICMS: " + calculadoraImpostosService
				.calcular(orcamento, new ISS(new ICMS(null))));

	}

}
