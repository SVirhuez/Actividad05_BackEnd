package com.disp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.disp.entity.Usuario;
import com.disp.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository repository;
	
	
	@Override
	public List<Usuario> listaUsuarios() {
		
		return repository.findAll();
	}

}
