package br.com.alura.loja.teste;

import java.math.BigDecimal;

import br.com.alura.loja.http.adapter.HttpAdapterClient;
import br.com.alura.loja.modelo.ItemOrcamento;
import br.com.alura.loja.modelo.Orcamento;
import br.com.alura.loja.service.RegistroOrcamentoService;

public class TesteAdapter {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(BigDecimal.TEN));
		orcamento.aprovar();
		orcamento.finalizar();

		RegistroOrcamentoService registroOrcamentoService = new RegistroOrcamentoService(
				new HttpAdapterClient());
		registroOrcamentoService.registrar(orcamento);

	}

}
