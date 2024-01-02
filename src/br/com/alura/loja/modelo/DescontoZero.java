package br.com.alura.loja.modelo;

import java.math.BigDecimal;

public class DescontoZero extends Desconto {

	public DescontoZero() {
		super(null);
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		return true;
	}

	@Override
	public BigDecimal efetuarCalculo(Orcamento orcamento) {

		return BigDecimal.ZERO;

	}

}
