package com.example.demo.service;

import com.example.demo.entity.Direccion;
import com.example.demo.repository.DireccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DireccionService {

    @Autowired
    DireccionRepository direccionRepository;

    public List<Direccion> findAll() {
        return this.direccionRepository.findAll();
    }

    public Direccion findById(Integer id) {
        return this.direccionRepository.findById(id).get();
    }

    public Integer create(Direccion direccion) {
        return this.direccionRepository.save(direccion).getId();
    }

    public void delete(Direccion direccion) {
        this.direccionRepository.delete(direccion);
    }
}
