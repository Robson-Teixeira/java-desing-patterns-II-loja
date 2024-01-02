package br.com.alura.loja.modelo;

import java.math.BigDecimal;

public class ICMS extends Imposto {

	public ICMS(Imposto imposto) {
		super(imposto);
	}

	@Override
	public BigDecimal realizarCalculo(Orcamento orcamento) {

		return orcamento.getValor()
				.multiply(new BigDecimal("0.1"));

	}

}
