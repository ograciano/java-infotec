package com.example.demo.dto;

public class DireccionDTO {

    private Integer id;

    private String calle;

    private String numeroInteror;

    private String numeroExterior;

    private Integer codigoPostal;

    private String colonia;

    private Integer ciudad;

    private Integer estado;

    public Integer getId() {
        return id;
    }

    public DireccionDTO() {
    }

    public DireccionDTO(String numeroInteror, String numeroExterior, Integer codigoPostal, String colonia, Integer ciudad, Integer estado) {
        this.numeroInteror = numeroInteror;
        this.numeroExterior = numeroExterior;
        this.codigoPostal = codigoPostal;
        this.colonia = colonia;
        this.ciudad = ciudad;
        this.estado = estado;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumeroInteror() {
        return numeroInteror;
    }

    public void setNumeroInteror(String numeroInteror) {
        this.numeroInteror = numeroInteror;
    }

    public String getNumeroExterior() {
        return numeroExterior;
    }

    public void setNumeroExterior(String numeroExterior) {
        this.numeroExterior = numeroExterior;
    }

    public Integer getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(Integer codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public Integer getCiudad() {
        return ciudad;
    }

    public void setCiudad(Integer ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }
}
