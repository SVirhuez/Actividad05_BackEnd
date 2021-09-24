package com.disp.service;

import java.util.List;

import com.disp.entity.Disponibilidad;


public interface DisponibilidadService {

	public abstract List<Disponibilidad> listaDisponibilidad();
	
	public Disponibilidad registraDisponibilidad(Disponibilidad d);
	
}
