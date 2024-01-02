package br.com.alura.loja.service;

import java.math.BigDecimal;

import br.com.alura.loja.dao.PedidoDAO;
import br.com.alura.loja.modelo.AcaoPedido;
import br.com.alura.loja.modelo.Pedido;

public class PedidoService implements AcaoPedido {

	private String cliente;
	private BigDecimal valorOrcamento;
	private int quantidadeItens;

	public PedidoService(String cliente, BigDecimal valorOrcamento, int quantidadeItens) {
		this.cliente = cliente;
		this.valorOrcamento = valorOrcamento;
		this.quantidadeItens = quantidadeItens;
	}

	public String getCliente() {
		return cliente;
	}

	public BigDecimal getValorOrcamento() {
		return valorOrcamento;
	}

	public int getQuantidadeItens() {
		return quantidadeItens;
	}
	
	public void executarAcao(Pedido pedido) {
		PedidoDAO pedidoDao = new PedidoDAO();
		pedidoDao.salvar(pedido);
	}

}
