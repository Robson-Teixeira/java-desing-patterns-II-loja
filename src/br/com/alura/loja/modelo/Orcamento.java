package br.com.alura.loja.modelo;

import java.math.BigDecimal;

public class Orcamento {

	private BigDecimal valor;
	private int quantidadeItens;
	private SituacaoOrcamento situacaoOrcamento;

	public Orcamento(BigDecimal valor, int quantidadeItens) {
		this.valor = valor;
		this.quantidadeItens = quantidadeItens;
		this.situacaoOrcamento = new EmAnalise();
	}

	public BigDecimal getValor() {
		return valor;
	}

	public int getQuantidadeItens() {
		return quantidadeItens;
	}

	public void setSituacaoOrcamento(SituacaoOrcamento situacaoOrcamento) {
		this.situacaoOrcamento = situacaoOrcamento;
	}

	public void aplicarDescontoExtra() {

		BigDecimal valorDescontoExtra = this.situacaoOrcamento
				.calcularValorDescontoExtra(this);

		this.valor = this.valor.subtract(valorDescontoExtra);

	}

	public void aprovar() {
		this.situacaoOrcamento.aprovar(this);
	}

	public void reprovar() {
		this.situacaoOrcamento.reprovar(this);
	}

	public void finalizar() {
		this.situacaoOrcamento.finalizar(this);
	}

}
