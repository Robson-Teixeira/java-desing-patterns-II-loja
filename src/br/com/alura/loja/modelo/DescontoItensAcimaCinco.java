package br.com.alura.loja.modelo;

import java.math.BigDecimal;

public class DescontoItensAcimaCinco extends Desconto {

	public DescontoItensAcimaCinco(Desconto proximo) {
		super(proximo);
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getQuantidadeItens() > 5;
	}

	@Override
	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor()
				.multiply(new BigDecimal("0.1"));
	}

}
