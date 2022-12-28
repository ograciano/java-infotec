package Ejercicios7y8;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            int x = 0,num ,mayor = 0, menor = 0, suma = 0, sumaPos = 0, sumaNeg = 0;
            ArrayList<Integer> primosNeg = new ArrayList<Integer>();
            while(x != -1) {
                System.out.println("introdusca un numero (-1 para salir)");
                num = scan.nextInt();
                if(0 == mayor && 0 == menor){
                    mayor = num;
                    menor = num;
                }
                if (num > mayor) mayor = num;
                if (num < menor) menor = num;
                suma += num;
                if(num > 0) sumaPos += num;
                if(num < 0) sumaNeg += num;

                if(primo(num)) primosNeg.add(num);

                x = num;
            }

            System.out.println("El numero mayor es: " + mayor);
            System.out.println("El numero menor es: " + menor);
            System.out.println("la suma total es: " + suma);
            System.out.println("la suma de positivos es: " + sumaPos);
            System.out.println("la suma de negativos es: " + sumaNeg);
            System.out.println("el arreglo de numero primos negativos es: " + primosNeg.toString());
        } catch(InputMismatchException e) {
            System.out.println("Error en el sistema: " + e);
        }
    }

    private static boolean primo(int num) {
        if(num >= 0) return false;
        int abs = Math.abs(num);
        if(abs == 1 || abs == 4) return false;
        for (int i = 2; i < abs / 2; i++) if (abs % i == 0) return false;
        return true;
    }
}
