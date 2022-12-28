package TareaEjercicio1;

public class Main {
    public static void main(String[] args) {
        Clase1 clase11 = new Clase1("hola", 1, 1.1, true, 1.1f);
        Clase1 clase12 = new Clase1("hola", 1, 1.1, true, 1.1f);

        Calse2 clase21 = new Calse2();
        Calse2 clase22 = new Calse2();

        System.out.println(clase11 instanceof Clase1);
        System.out.println(clase11.equals(clase12));
        System.out.println(clase11.hashCode() == clase12.hashCode());

        Clase1 claseMetodo1 = Calse2.metodo1(clase11);
        System.out.println(claseMetodo1.getVarBoolean());

        System.out.println(Calse2.metodo2("Hola", "Mundo"));

        Clase1 clase13 = new Clase1("hola", 1, 1.1, true, 1.1f);
        System.out.println(clase13.getVarBoolean().equals(clase12.getVarBoolean()));


    }
}
