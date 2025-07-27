package com.yuri.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yuri.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
