package com.example.demo.dto;

import com.example.demo.entity.Persona;

public class PersonaDTO {

    private Integer id;

    private String nombre;

    private String apellidos;

    private Integer direccion;

    public Integer getDireccion() {
        return direccion;
    }

    public void setDireccion(Integer direccion) {
        this.direccion = direccion;
    }

    public PersonaDTO() {}

    public PersonaDTO(Persona persona) {
        this.nombre = persona.getNombre();
        this.apellidos = persona.getApellidos();
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public static class DireccionDTO {

        private Integer id;

        private String numeroInteror;

        private String numeroExterior;

        private Integer codigoPostal;

        private String colonia;

        private Integer ciudad;

        private Integer estado;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
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
}
