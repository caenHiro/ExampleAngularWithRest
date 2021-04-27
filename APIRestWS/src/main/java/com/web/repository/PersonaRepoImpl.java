package com.web.repository;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import com.web.model.Persona;
 
@Repository
@Qualifier("persona")
public class PersonaRepoImpl  {

	private static Logger logger = LoggerFactory.getLogger(PersonaRepoImpl.class);
	
 
	public void registrar(Persona nombre) {
		logger.info("registrando a la persona  " + nombre);
		 
	}
 
}
