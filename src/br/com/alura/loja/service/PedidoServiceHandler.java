package br.com.alura.loja.service;

import java.time.LocalDateTime;
import java.util.List;

import br.com.alura.loja.modelo.AcaoPedido;
import br.com.alura.loja.modelo.ItemOrcamento;
import br.com.alura.loja.modelo.Orcamento;
import br.com.alura.loja.modelo.Pedido;

public class PedidoServiceHandler {
	
	private List<AcaoPedido> acaoPedido;

	// Incluir construtor com injeção de dependências: repositório, serviço e etc
	public PedidoServiceHandler(List<AcaoPedido> acaoPedido) {
		this.acaoPedido = acaoPedido;
	}
	
	public void executar(PedidoService pedidoService) {

		Orcamento orcamento = new Orcamento();

		for (int i = 0; i < pedidoService.getQuantidadeItens(); i++)
			orcamento.adicionarItem(new ItemOrcamento(pedidoService.getValorOrcamento()));

		Pedido pedido = new Pedido(
				pedidoService.getCliente(), LocalDateTime.now(), orcamento);

		acaoPedido.forEach(ap -> ap.executarAcao(pedido));

	}

}
