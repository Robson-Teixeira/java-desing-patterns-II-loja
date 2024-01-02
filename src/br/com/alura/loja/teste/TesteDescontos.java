package br.com.alura.loja.teste;

import java.math.BigDecimal;

import br.com.alura.loja.modelo.Orcamento;
import br.com.alura.loja.service.CalculadoraDescontosService;

public class TesteDescontos {

	public static void main(String[] args) {

		Orcamento orcamento1 = new Orcamento(new BigDecimal("200"), 4);
		Orcamento orcamento2 = new Orcamento(new BigDecimal("1000"), 1);
		CalculadoraDescontosService calculadoraDescontosService = new CalculadoraDescontosService();

		System.out.println("Desconto: " + calculadoraDescontosService
				.calcular(orcamento1));

		System.out.println("Desconto: " + calculadoraDescontosService
				.calcular(orcamento2));

	}

}
