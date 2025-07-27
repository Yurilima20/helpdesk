package com.yuri.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yuri.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
