package com.aulaJPA.cursomc.domain;

import java.util.Date;

import javax.persistence.Entity;

import com.aulaJPA.cursomc.domain.enums.EstadoPagamento;

@Entity
public class PagamentoComBoleto extends Pagamento{
	private static final long serialVersionUID = 1L; //facilitar o trasnporte pela rede ou em salvamento em disco
	
	private Date dataVencimento;
	private Date dataPagamento;
	
	public PagamentoComBoleto() {}

	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Date dataVencimento, Date dataPagamento) {
		super(id, estado, pedido);
		this.dataPagamento = dataPagamento;
		this.dataVencimento = dataVencimento;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	
	
}
