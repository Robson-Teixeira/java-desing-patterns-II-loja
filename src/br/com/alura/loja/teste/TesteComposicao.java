package br.com.alura.loja.teste;

import java.math.BigDecimal;

import br.com.alura.loja.modelo.ItemOrcamento;
import br.com.alura.loja.modelo.Orcamento;

public class TesteComposicao {

	public static void main(String[] args) {

		Orcamento orcamentoAntigo = new Orcamento();
		orcamentoAntigo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
		orcamentoAntigo.reprovar();
		orcamentoAntigo.finalizar();

		Orcamento orcamentoNovo = new Orcamento();
		orcamentoNovo.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
		orcamentoNovo.adicionarItem(orcamentoAntigo);

		System.out.println("Valor orçamento: " + orcamentoNovo.getValor());

	}

}
