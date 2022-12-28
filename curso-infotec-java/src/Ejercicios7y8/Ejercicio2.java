package Ejercicios7y8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)) {
            System.out.println("Introcusza la altura del triangulo: ");
            int altura = scan.nextInt();
            triangulo(altura);
        } catch (InputMismatchException e) {
            System.out.println("Error en el sistema " + e);
        }
    }

    private static void triangulo(int altura) {
        for (int i = altura; i > 0; i--) System.out.println("*".repeat(i));
        System.out.println("\n");
        for (int i = altura; i > 0 ; i--) {
            if(i == altura || i <= 2) System.out.println("*".repeat(i));
            if(i != altura && i > 2) System.out.println("*" + " ".repeat(i-2) + "*");
        }
    }
}
