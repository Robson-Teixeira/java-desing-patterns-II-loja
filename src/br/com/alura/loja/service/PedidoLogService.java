package br.com.alura.loja.service;

import br.com.alura.loja.modelo.AcaoPedido;
import br.com.alura.loja.modelo.Pedido;

public class PedidoLogService implements AcaoPedido {

	@Override
	public void executarAcao(Pedido pedido) {
		System.out.println("Pedido foi gerado: " + pedido);
	}

}
