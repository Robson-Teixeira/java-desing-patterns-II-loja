package br.com.alura.loja.modelo;

import java.math.BigDecimal;

public abstract class Desconto {

	protected Desconto proximo;

	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}

	protected abstract boolean deveAplicar(Orcamento orcamento);

	protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);

	public BigDecimal calcular(Orcamento orcamento) {
		if (deveAplicar(orcamento))
			return efetuarCalculo(orcamento);

		return proximo.calcular(orcamento);
	}

}
