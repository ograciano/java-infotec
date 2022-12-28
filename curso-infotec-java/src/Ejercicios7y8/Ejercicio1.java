package Ejercicios7y8;

import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)) {
            System.out.println("Ingresa una hora en formato 24hrs: ");
            int hora = scan.nextInt();
            if (hora >= 6 && hora <= 12) System.out.println("Buenos dias");
            if (hora >= 13 && hora <= 20) System.out.println("Buenas Tardes");
            if (hora >= 21 && hora <= 24 || hora >= 0 && hora <= 5) System.out.println("Buenas noches");
        } catch (InputMismatchException e) {
            System.out.println("error en el sistema: " + e);
        }
    }
}

