package br.com.alura.loja.modelo;

import java.math.BigDecimal;

public class ICMScomISS implements Imposto {

	public BigDecimal calcular(Orcamento orcamento) {

		BigDecimal icms = new ICMS().calcular(orcamento);
		BigDecimal iss = new ISS().calcular(orcamento);

		return icms.add(iss);

	}

}
