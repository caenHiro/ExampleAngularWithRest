package com.web.service;

import java.util.List;

import com.web.model.Persona;
 

public interface IPersonaService {

	void registrar(Persona p);

	List<Persona> regresaPersonas();

	Persona agregaPersona(Persona per);

	void eliminarPersona(Integer id);

	Persona modificarPersona(Persona per);
}
