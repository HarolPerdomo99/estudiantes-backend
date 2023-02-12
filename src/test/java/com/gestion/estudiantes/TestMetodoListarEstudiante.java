package com.gestion.estudiantes;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.gestion.estudiantes.modelo.Estudiante;
import com.gestion.estudiantes.repositorio.EstudianteRepositorio;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;


/*Test del metodo que lista un estudiante en la base de datos se prueba
con Base de datos MYSQL*/
@DataJpaTest
@AutoConfigureTestDatabase(replace =Replace.NONE) 
public class TestMetodoListarEstudiante {
	
	@Autowired
	private EstudianteRepositorio repositorio;
	
	@Test
	public void testListarEstudiante() {
		List<Estudiante> est = (List<Estudiante>)repositorio.findAll();
		//mostrar la lista de estudiantes en consola
		for(Estudiante estudiante : est) {
			System.out.println(estudiante);
		}
			
		//confirmar que el tamaño de la lista de estudiantes es > 0
		assertThat(est).size().isGreaterThan(0);
		
	}
	
	

}
