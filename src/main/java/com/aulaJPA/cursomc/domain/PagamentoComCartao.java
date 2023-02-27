package com.aulaJPA.cursomc.domain;

import javax.persistence.Entity;

import com.aulaJPA.cursomc.domain.enums.EstadoPagamento;

@Entity
public class PagamentoComCartao extends Pagamento {
	private static final long serialVersionUID = 1L; //facilitar o trasnporte pela rede ou em salvamento em disco
	
	private Integer numeroDeParcelas;
	
	public PagamentoComCartao() {}

	public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numeroDeParcelas) {
		super(id, estado, pedido);
		this.numeroDeParcelas = numeroDeParcelas;
	}

	public Integer getNumeroDeParcelas() {
		return numeroDeParcelas;
	}

	public void setNumeroDeParcelas(Integer numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}
	
	
}
