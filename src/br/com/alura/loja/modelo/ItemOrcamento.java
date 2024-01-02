package br.com.alura.loja.modelo;

import java.math.BigDecimal;

public class ItemOrcamento implements Orcavel {

	private BigDecimal valor;

	public ItemOrcamento(BigDecimal valor) {
		super();
		this.valor = valor;
	}

	public BigDecimal getValor() {
		return valor;
	}

}
