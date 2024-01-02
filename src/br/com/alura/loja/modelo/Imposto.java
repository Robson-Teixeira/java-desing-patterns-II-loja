package br.com.alura.loja.modelo;

import java.math.BigDecimal;

public abstract class Imposto {

	private Imposto imposto;

	public Imposto(Imposto imposto) {
		this.imposto = imposto;
	}

	protected abstract BigDecimal realizarCalculo(Orcamento orcamento);

	public BigDecimal calcular(Orcamento orcamento) {

		BigDecimal valorImpostoTotal = realizarCalculo(orcamento);
		BigDecimal valorImposto = BigDecimal.ZERO;

		if (imposto != null)
			valorImposto = imposto.realizarCalculo(orcamento);

		return valorImpostoTotal.add(valorImposto);

	}

}
