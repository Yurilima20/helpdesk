package com.yuri.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yuri.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{
	
	//eles que irão fazer as persistencias no banco depois que eu fazer 
	//a injeção de dependencias pelo spring.

}
