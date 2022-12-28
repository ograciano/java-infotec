package GestionEmpleados;

public class Main {
    public static void main(String[] args) {
        Programadores programador1 = new Programadores("Oscar", "Graciano", 35);
        Diseñadores disenador1 = new Diseñadores("Luis", "Graciano", 31);
        Diseñadores disenador2 = new Diseñadores("Juan", "Graciano", 25);

        System.out.println(programador1.obtenerActividadesDiarias());
        System.out.println(disenador1.obtenerActividadesDiarias());
        System.out.println(disenador2.obtenerActividadesDiarias());
    }
}
