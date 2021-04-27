package com.web;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.web.model.Persona;
import com.web.service.IPersonaService;

 

@SpringBootApplication
public class ProyectoPruebaWebApplication implements CommandLineRunner{

	Logger logger = LoggerFactory.getLogger(ProyectoPruebaWebApplication.class);

	@Autowired
	private IPersonaService service;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPruebaWebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		Persona p = new Persona();
//		p.setIdPersona(1);
//		p.setNombre("Dede el run");
//		service.registrar(p);
		
		logger.info("***********************************************");
		logger.info("***********************************************");
		logger.info("**** desde la aplicacion ****");
		logger.info("***********************************************");
		logger.info("***********************************************");
		
	}

}
