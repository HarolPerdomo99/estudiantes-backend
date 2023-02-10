package com.gestion.estudiantes.exepciones;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResouceNotFoundException extends RuntimeException {

	private static final long serialVersionID = 1L;
	
	public ResouceNotFoundException(String mensaje) {
		super(mensaje);
	}
}
