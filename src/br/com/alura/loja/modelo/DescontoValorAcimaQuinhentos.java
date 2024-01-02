package br.com.alura.loja.modelo;

import java.math.BigDecimal;

public class DescontoValorAcimaQuinhentos extends Desconto {

	public DescontoValorAcimaQuinhentos(Desconto proximo) {
		super(proximo);
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getValor()
				.compareTo(new BigDecimal("500")) > 0;
	}

	@Override
	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor()
				.multiply(new BigDecimal("0.05"));
	}

}
