package Ejercicios7y8.Traductor;

import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        String x = "1";
        try (Scanner scan = new Scanner(System.in);){
            while(x != "-1") {
                String palabra = pregunta(scan);
                if (!Traductor.buscarPalabra(palabra)) {
                    Traductor.setPalabra(scan);
                    System.out.println("Palabra creada correctamente");
                    break;
                }
            }
        }catch (InputMismatchException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }catch (ParseException e) {
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

    }

    private static String pregunta(Scanner scan) {
        scan.reset();
        System.out.println("Intruduzca la palabra que quiere buscar:");
        String palabra = scan.nextLine();
        return palabra;
    }

}
