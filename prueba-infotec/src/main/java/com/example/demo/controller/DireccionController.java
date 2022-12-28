package com.example.demo.controller;

import com.example.demo.dto.DireccionDTO;
import com.example.demo.entity.Direccion;
import com.example.demo.service.DireccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/direcciones")
@CrossOrigin(origins = "http://localhost:8080")
public class DireccionController {

    @Autowired
    DireccionService direccionService;

    @GetMapping("/")
    public ResponseEntity<List<Direccion>> getDirecciones() {
        return new ResponseEntity<List<Direccion>>(this.direccionService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Direccion> getDireccion(@PathVariable("id") Integer id) {
        return new ResponseEntity<Direccion>(this.direccionService.findById(id), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Integer> createDireccion(@RequestBody DireccionDTO data) {
        Direccion direccion = new Direccion();
        direccion.setCalle(data.getCalle());
        direccion.setNumeroInterior(data.getNumeroInteror());
        direccion.setNumeroExterior(data.getNumeroExterior());
        direccion.setCodigoPostal(data.getCodigoPostal());
        direccion.setColonia(data.getColonia());
        direccion.setCiudad(data.getCiudad());
        direccion.setEstado(data.getEstado());
        return new ResponseEntity<Integer>(this.direccionService.create(direccion), HttpStatus.CREATED);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Integer> patchDireccion(@RequestBody DireccionDTO data, @PathVariable("id") Integer id) {
        Direccion direccion = this.direccionService.findById(id);
        direccion.setCalle(data.getCalle());
        direccion.setNumeroInterior(data.getNumeroInteror());
        direccion.setNumeroExterior(data.getNumeroExterior());
        direccion.setCodigoPostal(data.getCodigoPostal());
        direccion.setColonia(data.getColonia());
        direccion.setCiudad(data.getCiudad());
        direccion.setEstado(direccion.getEstado());
        return new ResponseEntity<Integer>(this.direccionService.create(direccion), HttpStatus.ACCEPTED);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteDireccion(@PathVariable("id") Integer id){
        Direccion direccion = this.direccionService.findById(id);
        this.direccionService.delete(direccion);
        return new ResponseEntity<String>("Direccion Borrada", HttpStatus.OK);
    }
}
