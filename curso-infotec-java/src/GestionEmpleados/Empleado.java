package GestionEmpleados;

import java.util.ArrayList;

public abstract class Empleado {
    private String nombre;
    private String apellidos;
    private int edad;
    private ArrayList<String> actividadesDiarias;
    private int codigo;

    public abstract ArrayList<String> obtenerActividadesDiarias();

    public Empleado(String nombre, String apellidos, int edad, ArrayList<String> actividadesDiarias, int codigo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.actividadesDiarias = actividadesDiarias;
        this.codigo = codigo;
    }

    public Empleado(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<String> getActividadesDiarias() {
        return actividadesDiarias;
    }

    public void setActividadesDiarias(ArrayList<String> actividadesDiarias) {
        this.actividadesDiarias = actividadesDiarias;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
