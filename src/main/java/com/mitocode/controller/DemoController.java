package com.mitocode.controller;

import java.util.List;

import com.mitocode.model.Persona;
import com.mitocode.repository.IPersonaRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * DemoController
 */
@Controller
public class DemoController {

    @Autowired
    IPersonaRepo personaRepo;

    @GetMapping("/greeting")
    public String greeting(@RequestParam (name="name",required = false,defaultValue = "WORLD") String name,Model model){

        Persona persona = new Persona();
        persona.setNombre(name);
        personaRepo.save(persona);
        model.addAttribute("name",name);
        return "greeting";
    }

    @GetMapping("/personas")
    public String greeting(Model model){

        List<Persona> listaPersonas = personaRepo.findAll();
        model.addAttribute("personas",listaPersonas);
        return "personas";
    }
}