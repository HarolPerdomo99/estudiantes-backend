package com.gestion.estudiantes;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.gestion.estudiantes.modelo.Estudiante;
import com.gestion.estudiantes.repositorio.EstudianteRepositorio;

@DataJpaTest
public class TestMetodoGuardarEstudiante {
	
	@Autowired
	private EstudianteRepositorio repositorio;

	/*Test del metodo que guarda un estudiante en la base de datos se prueba,
	    con Base de da BD en memoria*/
	
		@Test
		public void testGuardarEstudiante() {
			Estudiante estudiante = new Estudiante(1L,"hola","hodo","hffhf","hola@gmail.com");
			repositorio.save(estudiante);
			
		}
}
