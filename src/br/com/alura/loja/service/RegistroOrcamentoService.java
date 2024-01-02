package br.com.alura.loja.service;

import java.util.Map;

import br.com.alura.loja.adapter.HttpAdapter;
import br.com.alura.loja.modelo.Orcamento;
import br.com.alura.loja.modelo.exception.DomainException;

public class RegistroOrcamentoService {

	private HttpAdapter httpAdapter;

	public RegistroOrcamentoService(HttpAdapter httpAdapter) {
		this.httpAdapter = httpAdapter;
	}

	public void registrar(Orcamento orcamento) {

		if (!orcamento.isFinalizado())
			throw new DomainException("Orçamento não finalizado!");

		String url = "http://api.externa/orcamento";
		Map<String, Object> dados = Map.of(
				"valor", orcamento.getValor(), 
				"quantidadeItens", orcamento.getQuantidadeItens());

		httpAdapter.post(url, dados);

	}

}
