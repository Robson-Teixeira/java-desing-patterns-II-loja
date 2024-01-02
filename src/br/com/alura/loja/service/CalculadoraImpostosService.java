package br.com.alura.loja.service;

import java.math.BigDecimal;

import br.com.alura.loja.modelo.Orcamento;
import br.com.alura.loja.modelo.Imposto;

public class CalculadoraImpostosService {

	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {

		return imposto.calcular(orcamento);

	}

}
