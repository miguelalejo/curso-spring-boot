package com.mitocode.repository;

import com.mitocode.model.Persona;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Persona
 */
@Repository
public interface IPersonaRepo extends JpaRepository<Persona,Integer>{

}