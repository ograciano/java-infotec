package com.example.demo.controller;

import com.example.demo.dto.PersonaDTO;
import com.example.demo.entity.Persona;
import com.example.demo.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping("/personas/")
    public ResponseEntity<List<Persona>> allPersonas() {
        return new ResponseEntity<List<Persona>> (this.personaService.getPersonas(), HttpStatus.OK);
    }

    @GetMapping("/personas/{id}")
    public ResponseEntity<Persona> personaById(@PathVariable("id") Integer id) {
        return new ResponseEntity<Persona>(this.personaService.obtenerPorId(id), HttpStatus.OK);
    }

    @PostMapping("/personas/create")
    public ResponseEntity<Integer> create(@RequestBody PersonaDTO data) {
        Persona persona = new Persona();
        persona.setNombre(data.getNombre());
        persona.setApellidos(data.getApellidos());
        persona.setDireccion(data.getDireccion());
        return new ResponseEntity<Integer>(this.personaService.crearPersona(persona), HttpStatus.CREATED);
    }

    @PatchMapping("/personas/{id}")
    public  ResponseEntity<Integer> update(@RequestBody PersonaDTO data, @PathVariable("id") Integer id) {
        Persona persona = this.personaService.obtenerPorId(id);
        persona.setNombre(data.getNombre());
        persona.setApellidos(data.getApellidos());
        persona.setDireccion(data.getDireccion());
        return new ResponseEntity<Integer>( this.personaService.crearPersona(persona), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/personas/{id}")
    public void delete(@PathVariable("id") Integer id) {
        Persona persona = this.personaService.obtenerPorId(id);
        this.personaService.deletePersona(persona);
    }
}
