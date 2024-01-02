package br.com.alura.loja.modelo;

public class Reprovado extends SituacaoOrcamento {

	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacaoOrcamento(new Finalizado());
	}

}
