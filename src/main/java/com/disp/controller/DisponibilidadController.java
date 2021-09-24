package com.disp.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.disp.entity.Ciclo;
import com.disp.entity.Disponibilidad;
import com.disp.entity.Usuario;
import com.disp.service.CicloService;
import com.disp.service.DisponibilidadService;
import com.disp.service.UsuarioService;

@RestController
@RequestMapping("/rest/disponibilidad")
@CrossOrigin(origins = "http://localhost:4200")
public class DisponibilidadController {

	@Autowired
	 DisponibilidadService dispoService;
	
	@Autowired
	CicloService cicloService;
	
	@Autowired
	UsuarioService usuarioService;
	
	
	
	@GetMapping("/listaDisp")
	@ResponseBody
	public List<Disponibilidad> listaDisponibildiad(){
		return dispoService.listaDisponibilidad();
	}
	
	@PostMapping("/RegistrarDisp")
	@ResponseBody
	public ResponseEntity<Map<String,Object>> registraCliente(@RequestBody Disponibilidad c) {	
		Map<String,Object> salida = new HashMap<>();
		try {
			Disponibilidad objSalida = dispoService.registraDisponibilidad(c);
			if (objSalida == null) {
				salida.put("mensaje", "Error al momento de registrar");
			}else {
				salida.put("mensaje", "Se registro la disponibilidad");
			}
		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error al momento de registrar");
		}
		
		return ResponseEntity.ok(salida);
	}
	
	@GetMapping("/listaCiclo")
	@ResponseBody
	public List<Ciclo> listaCiclos(){
		return cicloService.listaCiclos();
		
	}
	
	
	@GetMapping("/listaUsuario")
	@ResponseBody
	public List<Usuario> listaUsuarios(){
		return usuarioService.listaUsuarios();
	}
}
