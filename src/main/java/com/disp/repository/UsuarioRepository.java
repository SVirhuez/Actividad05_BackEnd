package com.disp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.disp.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
