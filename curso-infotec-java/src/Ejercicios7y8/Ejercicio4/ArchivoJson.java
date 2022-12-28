package Ejercicios7y8.Ejercicio4;

public class ArchivoJson {
    private String nombre;
    private String tipo;
    private String peso;

    public ArchivoJson() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public ArchivoJson(String nombre, String tipo, String peso) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.peso = peso;
    }
}
