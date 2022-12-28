package interfazFuncional;

public class Main {
    public static void main(String[] args) {
        // POO
        Implementacion instancia = new Implementacion();

        String resultado = instancia.concatena("1000");

        System.out.println(resultado);

        //PF
        //clase
        InterfazFuncional inter = new InterfazFuncional() {
            @Override
            public String concatena(String x) {
                return "el El valor concatenado es: " + x;
            }
        };

        String resultado2 = inter.concatena("2000");
        System.out.println(resultado2);

        concatenaSuperior(inter);
        concatenaSuperior(instancia);
    }

    public static void concatenaSuperior(InterfazFuncional inter) {
        System.out.println(inter.concatena("Orden Superior"));
    }
}
