package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.web.model.Persona;
import com.web.repository.IPersonaRepo;

 

@Service
public class PersonaServiceImpl implements IPersonaService {

	@Autowired
//	@Qualifier("persona")
	private IPersonaRepo repo;

	@Override
	public void registrar(Persona p) {
		repo.save(p);
	}
 
	
	@Override
	public List<Persona> regresaPersonas() {
		 
		return (List<Persona>) repo.findAll(Sort.by(Sort.Direction.ASC, "idPersona"))  ;
	}

	@Override
	public Persona agregaPersona(Persona per) {
		per.setIdPersona(this.regresaPersonas().size()+1);
		return repo.save(per);
	}

	@Override
	public void eliminarPersona(Integer id) {
		repo.deleteById(id);
	}


	@Override
	public Persona modificarPersona(Persona per) {
		return repo.save(per);
	}
	
 

}
