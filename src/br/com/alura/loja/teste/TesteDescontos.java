package br.com.alura.loja.teste;

import java.math.BigDecimal;

import br.com.alura.loja.modelo.ItemOrcamento;
import br.com.alura.loja.modelo.Orcamento;
import br.com.alura.loja.service.CalculadoraDescontosService;

public class TesteDescontos {

	public static void main(String[] args) {

		Orcamento orcamento1 = new Orcamento();

		for (int i = 0; i <= 3; i++)
			orcamento1.adicionarItem(new ItemOrcamento(new BigDecimal("200")));

		Orcamento orcamento2 = new Orcamento();
		orcamento2.adicionarItem(new ItemOrcamento(new BigDecimal("1000")));

		CalculadoraDescontosService calculadoraDescontosService = new CalculadoraDescontosService();

		System.out.println("Desconto: " + calculadoraDescontosService
				.calcular(orcamento1));

		System.out.println("Desconto: " + calculadoraDescontosService
				.calcular(orcamento2));

	}

}
