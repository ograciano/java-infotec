package com.example.demo.controller;

import com.example.demo.dto.PasatiemposDTO;
import com.example.demo.entity.Pasatiempos;
import com.example.demo.service.PasatiemposService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pasatiempos")
@CrossOrigin(origins = "http://localhost:8080")
public class PasatiemposController {

    @Autowired
    PasatiemposService pasatiemposService;

    @GetMapping("/")
    public ResponseEntity<List<Pasatiempos>> getPasatiempos() {
        return new ResponseEntity<List<Pasatiempos>>(this.pasatiemposService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pasatiempos> getPasatiempo(@PathVariable("id") Integer id) {
        return new ResponseEntity<Pasatiempos>(this.pasatiemposService.findById(id), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Integer> createPasatiempo(@RequestBody PasatiemposDTO data) {
        Pasatiempos pasatiempos = new Pasatiempos();
        pasatiempos.setNombre(data.getNombre());
        pasatiempos.setPasatiempo(data.getPasatiempo());
        pasatiempos.setIdPersona(data.getIdPersona());
        return new ResponseEntity<Integer>(this.pasatiemposService.create(pasatiempos), HttpStatus.CREATED);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Integer> patchPasatiempos(@RequestBody PasatiemposDTO data, @PathVariable("id") Integer id) {
        Pasatiempos pasatiempos = this.pasatiemposService.findById(id);
        pasatiempos.setNombre(data.getNombre());
        pasatiempos.setPasatiempo(data.getPasatiempo());
        pasatiempos.setIdPersona(data.getIdPersona());
        return new ResponseEntity<Integer>(this.pasatiemposService.create(pasatiempos), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePasatiempos(@PathVariable("id") Integer id) {
        Pasatiempos pasatiempos = this.pasatiemposService.findById(id);
        this.pasatiemposService.delete(pasatiempos);
        return new ResponseEntity<String>("Pasatiempo Borrado", HttpStatus.ACCEPTED);
    }
}
