package br.com.alura.loja.modelo;

import java.math.BigDecimal;

public class Aprovado extends SituacaoOrcamento {

	@Override
	public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
		return orcamento.getValor()
				.multiply(new BigDecimal("0.02"));
	}

	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacaoOrcamento(new Finalizado());
	}

}
