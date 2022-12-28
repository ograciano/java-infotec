package EjercicioMetodosListas;

import com.sun.source.doctree.SummaryTree;

public class Main {
    public static void main(String[] args) {
        Tarea tarea = new Tarea();

        String cadena = tarea.concatena("Hola", "mundo", 35, 36);

        System.out.println(cadena);

        String cadena2 = tarea.concatenaDouble(cadena, 10.00, 15.00);

        System.out.println(cadena2);

        Tarea tarea2 = new Tarea("hola mundo");
        Tarea tarea3 = new Tarea("hola mundo", 15);

        Integer[] numeros = {10,58,68,920,15,16,85,75,32};
        for (int numero: numeros) System.out.println(numero);
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] == 68) numeros[i] = 90;
            if(numeros[i] == 920) numeros[i] = 25;
        }
        System.out.println("nueva lista");
        for (int numero: numeros) System.out.println(numero);

        String[] cadenaLista = {"15","30","12", "60"};
        int suma = 0;
        for (int i = 0; i < cadenaLista.length; i++) suma += Integer.valueOf(cadenaLista[i]);
        System.out.println("\nLa suma de cadenaLista es: " + suma);

    }
}
