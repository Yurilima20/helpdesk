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
		
		Tecnico tec2 = new Tecnico(null, "Richard", "63653230260", "alex33@mail.com", "123");
		Tecnico tec3 = new Tecnico(null, "Claude", "63853230268", "alex22@mail.com", "123");
		Tecnico tec4 = new Tecnico(null, "Tim", "63653230296", "alex11@mail.com", "123");
		Tecnico tec5 = new Tecnico(null, "DD", "63653230294", "alex45@mail.com", "123");
		
		Cliente cli1 = new Cliente(null, "Lineu", "80527954781", "lineu99@mail.com", "1235");
		Cliente cli2 = new Cliente(null, "Mat", "80537954780", "lineu66@mail.com", "1235");
		Cliente cli3 = new Cliente(null, "Rod", "80527954782", "lineu00@mail.com", "1235");
		Cliente cli4 = new Cliente(null, "Yuri", "80527954785", "lineu45@mail.com", "1235");
		Cliente cli5 = new Cliente(null, "Me", "80527954723", "lineu88@mail.com", "1235");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "chamado 01", "Primeiro chamado", tec1, cli1);
		Chamado c2 = new Chamado(null, Prioridade.ALTA, Status.ABERTO, "chamado 02", "Segundo chamado", tec2, cli2);
		Chamado c3 = new Chamado(null, Prioridade.BAIXA, Status.ENCERRADO, "chamado 03", "Terceiro chamado", tec3, cli3);
		Chamado c4 = new Chamado(null, Prioridade.MEDIA, Status.ABERTO, "chamado 04", "Quarto chamado", tec4, cli4);
		Chamado c5 = new Chamado(null, Prioridade.ALTA, Status.ANDAMENTO, "chamado 05", "Quint chamado", tec5, cli5);
		
		tecnicoRepo.saveAll(Arrays.asList(tec1, tec2, tec3, tec4, tec5));
		clienteRepo.saveAll(Arrays.asList(cli1, cli2, cli3, cli4, cli5));
		chamadoRepo.saveAll(Arrays.asList(c1, c2, c3, c4, c5));
	}

}
