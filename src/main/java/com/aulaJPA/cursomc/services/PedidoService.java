package com.aulaJPA.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aulaJPA.cursomc.domain.Pedido;
import com.aulaJPA.cursomc.repositories.PedidoRepository;
import com.aulaJPA.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	@Autowired //instacia automaticamente a dependencia
	private PedidoRepository repo;
	
	public Pedido buscar(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
	}
}
