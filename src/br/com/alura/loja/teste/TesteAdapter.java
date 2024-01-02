package br.com.alura.loja.teste;

import java.math.BigDecimal;

import br.com.alura.loja.http.adapter.HttpAdapterClient;
import br.com.alura.loja.modelo.Orcamento;
import br.com.alura.loja.service.RegistroOrcamentoService;

public class TesteAdapter {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento(BigDecimal.TEN, 1);
		orcamento.aprovar();
		orcamento.finalizar();

		RegistroOrcamentoService registroOrcamentoService = new RegistroOrcamentoService(
				new HttpAdapterClient());
		registroOrcamentoService.registrar(orcamento);

	}

}
