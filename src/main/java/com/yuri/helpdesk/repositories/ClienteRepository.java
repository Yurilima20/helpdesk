package com.yuri.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yuri.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
