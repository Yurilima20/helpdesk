package com.yuri.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yuri.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
