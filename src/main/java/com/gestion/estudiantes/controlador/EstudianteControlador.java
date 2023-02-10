package com.gestion.estudiantes.controlador;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.estudiantes.repositorio.EstudianteRepositorio;

import com.gestion.estudiantes.modelo.Estudiante;


@RestController
@RequestMapping("/api/rest/")
@CrossOrigin(origins ="http://localhost:4200/")
public class EstudianteControlador {
	
	@Autowired
	private EstudianteRepositorio repositorio;
	
	//metodo para listar todos los estudiantes
	@GetMapping("/estudiantes")
	public List<Estudiante> listarEstudiantes(){
		return repositorio.findAll();	}

	// metodo para guardar estudiantes
	@PostMapping("/estudiantes")
	public Estudiante guardarEstudiante(@RequestBody Estudiante estudiante) {
		return repositorio.save(estudiante);
	}
	
}
