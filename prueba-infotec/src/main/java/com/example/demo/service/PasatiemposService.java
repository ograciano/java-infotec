package com.example.demo.service;

import com.example.demo.entity.Pasatiempos;
import com.example.demo.repository.PasatiemposRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PasatiemposService {

    @Autowired
    PasatiemposRepository pasatiemposRepository;

    public List<Pasatiempos> findAll() {
        return this.pasatiemposRepository.findAll();
    }

    public Pasatiempos findById(Integer id) {
        return this.pasatiemposRepository.findById(id).get();
    }

    public Integer create(Pasatiempos pasatiempos) {
        return this.pasatiemposRepository.save(pasatiempos).getId();
    }

    public void delete(Pasatiempos pasatiempos) {
        this.pasatiemposRepository.delete(pasatiempos);
    }
}
