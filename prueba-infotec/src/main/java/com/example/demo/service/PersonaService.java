package com.example.demo.service;

import com.example.demo.entity.Persona;
import com.example.demo.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    public List<Persona> getPersonas() {
        return this.personaRepository.findAll();
    }
    public Persona obtenerPorId(Integer id) {
        return this.personaRepository.findById(id).get();
    }
    
    public Integer crearPersona(Persona persona) {return this.personaRepository.save(persona).getId();}

    public void deletePersona(Persona persona) {
        this.personaRepository.delete(persona);
    }


}
