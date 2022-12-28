package EjercicioMetodosListas;

public class Tarea {
    String parametro1;
    int parametro2;
    double parametro3;

    public Tarea() { }
    public Tarea(String parametro1) {
        this.parametro1 = parametro1;
    }

    public Tarea(String parametro1, int parametro2) {
        this.parametro1 = parametro1;
        this.parametro2 = parametro2;
    }

    public String concatena(String cadena1, String cadena2, int entero1, int entero2) {
        return "cadena 1: " + cadena1 + " cadena2: " + cadena2 + " entero1: " + + entero1+" enetro2: " + entero2;
    }

    public String concatenaDouble(String cadena,double double1, double double2) {
        return "Cadena1: " + cadena + " double1: " + double1 + " double2: " + double2;
    }
}
