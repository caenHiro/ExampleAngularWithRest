package com.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.model.Persona;
import com.web.service.IPersonaService;

@Controller
public class PersonaController {
	
	@Autowired
	private IPersonaService service;
	
	@GetMapping("/imprimePersona")
    public String creaPersona(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        //logica 
		
		Persona p = new Persona();
		p.setIdPersona(service.regresaPersonas().size() +1);
		p.setNombre(name);
		
		service.registrar(p);
		
		model.addAttribute("name", name);
        return "pintaPersona";
    }
	
	@GetMapping("/listar")
    public String listar(Model model) {
        //logica 							
		model.addAttribute("personas",  service.regresaPersonas());
        return "listaPersona";
    }
	
	
}
