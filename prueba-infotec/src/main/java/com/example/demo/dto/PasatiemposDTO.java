package com.example.demo.dto;

public class PasatiemposDTO {
    private Integer id;
    private String nombre;
    private Integer pasatiempo;
    private Integer idPersona;

    public PasatiemposDTO() {
    }

    public PasatiemposDTO(String nombre, Integer pasatiempo, Integer idPersona) {
        this.nombre = nombre;
        this.pasatiempo = pasatiempo;
        this.idPersona = idPersona;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPasatiempo() {
        return pasatiempo;
    }

    public void setPasatiempo(Integer pasatiempo) {
        this.pasatiempo = pasatiempo;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }
}
