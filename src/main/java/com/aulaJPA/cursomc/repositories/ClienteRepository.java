package com.aulaJPA.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulaJPA.cursomc.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
