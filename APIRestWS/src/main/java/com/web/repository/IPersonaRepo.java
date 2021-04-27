package com.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer>{
	
	 

}
