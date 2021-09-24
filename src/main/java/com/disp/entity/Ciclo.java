package com.disp.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ciclo")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ciclo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCiclo;
	private String nombre;
	private String estado;

}
