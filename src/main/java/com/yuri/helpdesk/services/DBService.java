package com.yuri.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuri.helpdesk.domain.Chamado;
import com.yuri.helpdesk.domain.Cliente;
import com.yuri.helpdesk.domain.Tecnico;
import com.yuri.helpdesk.domain.enums.Perfil;
import com.yuri.helpdesk.domain.enums.Prioridade;
import com.yuri.helpdesk.domain.enums.Status;
import com.yuri.helpdesk.repositories.ChamadoRepository;
import com.yuri.helpdesk.repositories.ClienteRepository;
import com.yuri.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {
	
	@Autowired
	private TecnicoRepository tecnicoRepo;
	@Autowired
	private ClienteRepository clienteRepo;
	@Autowired
	private ChamadoRepository chamadoRepo;
	
	public void instanciaDB() {
		
		Tecnico tec1 = new Tecnico(null, "Alex", "63653230268", "alex@mail.com", "123");
		tec1.addPerfis(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Lineu", "80527954780", "lineu@mail.com", "1235");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "chamado 01", "Primeiro chamado", tec1, cli1);
		
		tecnicoRepo.saveAll(Arrays.asList(tec1));
		clienteRepo.saveAll(Arrays.asList(cli1));
		chamadoRepo.saveAll(Arrays.asList(c1));
	}

}
