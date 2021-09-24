package com.disp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.disp.entity.Disponibilidad;
import com.disp.repository.DisponibilidadRepository;

@Service
public class DisponibilidadServiveImpl implements DisponibilidadService {

	@Autowired
	private DisponibilidadRepository repository;
	
	@Override
	public List<Disponibilidad> listaDisponibilidad() {
		
		return repository.findAll();
	}

	@Override
	public Disponibilidad registraDisponibilidad(Disponibilidad d) {
		return repository.save(d);
	}

}
