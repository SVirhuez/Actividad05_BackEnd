package com.disp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.disp.entity.Ciclo;
import com.disp.repository.CicloRepository;

@Service
public class CicloServiceImpl implements CicloService {
	
	@Autowired
	private CicloRepository repository;

	@Override
	public List<Ciclo> listaCiclos() {
		
		return repository.findAll();
	}
	
	

}
