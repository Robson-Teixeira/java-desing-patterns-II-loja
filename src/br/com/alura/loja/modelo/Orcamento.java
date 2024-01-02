package br.com.alura.loja.modelo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Orcamento {

	private BigDecimal valor;
	private List<ItemOrcamento> itensOrcamento;
	private SituacaoOrcamento situacaoOrcamento;

	public Orcamento() {
		this.valor = BigDecimal.ZERO;
		this.itensOrcamento = new ArrayList<ItemOrcamento>();
		this.situacaoOrcamento = new EmAnalise();
	}

	public BigDecimal getValor() {
		return valor;
	}

	public int getQuantidadeItens() {
		return itensOrcamento.size();
	}

	public void adicionarItem(ItemOrcamento itemOrcamento) {
		this.valor = valor.add(itemOrcamento.getValor());
		this.itensOrcamento.add(itemOrcamento);
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

	public boolean isFinalizado() {
		return situacaoOrcamento instanceof Finalizado;
	}

}
