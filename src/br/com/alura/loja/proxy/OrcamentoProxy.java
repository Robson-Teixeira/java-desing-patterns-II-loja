package br.com.alura.loja.proxy;

import java.math.BigDecimal;

import br.com.alura.loja.modelo.Orcamento;
import br.com.alura.loja.modelo.Orcavel;

public class OrcamentoProxy implements Orcavel {

	private BigDecimal valor;
	private Orcamento orcamento;

	public OrcamentoProxy(Orcamento orcamento) {
		this.orcamento = orcamento;
	}

	@Override
	public BigDecimal getValor() {

		if (valor == null)
			this.valor = orcamento.getValor();

		return this.valor;
	}

}
