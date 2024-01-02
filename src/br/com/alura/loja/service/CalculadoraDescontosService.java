package br.com.alura.loja.service;

import java.math.BigDecimal;

import br.com.alura.loja.modelo.Desconto;
import br.com.alura.loja.modelo.DescontoItensAcimaCinco;
import br.com.alura.loja.modelo.DescontoValorAcimaQuinhentos;
import br.com.alura.loja.modelo.DescontoZero;
import br.com.alura.loja.modelo.Orcamento;

public class CalculadoraDescontosService {

	public BigDecimal calcular(Orcamento orcamento) {

		Desconto desconto = new DescontoItensAcimaCinco(
				new DescontoValorAcimaQuinhentos(
						new DescontoZero()));

		return desconto.calcular(orcamento);

	}

}
