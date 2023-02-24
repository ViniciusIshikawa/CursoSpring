package com.aulaJPA.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aulaJPA.cursomc.domain.Cliente;
import com.aulaJPA.cursomc.repositories.ClienteRepository;
import com.aulaJPA.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	@Autowired //instacia automaticamente a dependencia
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
	}
}
