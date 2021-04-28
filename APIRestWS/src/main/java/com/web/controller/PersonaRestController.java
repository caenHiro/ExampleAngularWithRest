package com.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.model.Persona;
import com.web.service.IPersonaService;

@RestController
@RequestMapping("api")
public class PersonaRestController {
	
	@Autowired
	private IPersonaService service;
	
	@SuppressWarnings("unchecked")
	@CrossOrigin
	@GetMapping("/listarJson")
    public List<Persona> listarJson(  ) {

        return   (List<Persona>) service.regresaPersonas();
    }
	
	@CrossOrigin
	@PostMapping("/agregar")
	public Persona inserta (@RequestBody Persona per) {
		return service.agregaPersona(per);
	}
	
	@CrossOrigin
	@PutMapping("/modificar")
	public Persona modificar (@RequestBody Persona per) {
		return service.modificarPersona(per);
	}
	
	@CrossOrigin
	@DeleteMapping( value = "/{id}")
	public void eliminar(@PathVariable("id")  Integer id) {
		service.eliminarPersona(id);
	}
	
}
