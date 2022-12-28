public class Hijo extends Padre {
    Integer edad;

    public static void main(String[] args) {
        Hijo instanciaHijo = new Hijo();

        instanciaHijo.edad=11;
        instanciaHijo.nombre="Oscar";
        instanciaHijo.apellido="Graciano";
        instanciaHijo.imprimirNombre();
    }
}
