package br.com.alura.loja.service;

import br.com.alura.loja.modelo.AcaoPedido;
import br.com.alura.loja.modelo.Pedido;

public class EmailService implements AcaoPedido {

	public void executarAcao(Pedido pedido) {
		System.out.println("Enviando e-mail com dados do pedido");
	}

}
