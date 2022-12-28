package Evaluacion;

import java.time.Year;

public class Empleado {
    public enum Tipo {Tipo1, Tipo2, Tipo3};
    private Tipo tipo;
    private String nombre_completo;
    private String edad;
    private String antiguedad;

    public Empleado(Tipo tipo, String nombre_completo, String edad, String antiguedad) {
        this.tipo = tipo;
        this.nombre_completo = nombre_completo;
        this.edad = edad;
        this.antiguedad = antiguedad;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(String antiguedad) {
        this.antiguedad = antiguedad;
    }

    public boolean venderProductos(){
        if(getTipo() == Tipo.Tipo1 || getTipo() == Tipo.Tipo2) return true;
        System.out.println("No puedes realizar esta acción. Consulta con el administrador");
        return false;
    }

    public boolean descansar() {
        if(getTipo() == Tipo.Tipo1 || getTipo() == Tipo.Tipo2) return true;
        System.out.println("No puedes realizar esta acción. Consulta con el administrador");
        return false;
    }

    public boolean sentarse() {
        if(getTipo() == Tipo.Tipo1) return true;
        System.out.println("No puedes realizar esta acción. Consulta con el administrador");
        return false;
    }

    public boolean correr() {
        if(getTipo() == Tipo.Tipo2) return true;
        System.out.println("No puedes realizar esta acción. Consulta con el administrador");
        return false;
    }

    public String recibirPago(int pago){
        return "Se le a pagado al emplado de tipo: " + tipo + " La cantidad de: " + pago + " pesos";
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "tipo='" + tipo + '\'' +
                ", nombre_completo='" + nombre_completo + '\'' +
                ", edad='" + edad + '\'' +
                ", antiguedad='" + antiguedad + '\'' +
                '}';
    }
}
