import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un nunmero entero: ");
        int numeroDecimal = 0;
        try {
            numeroDecimal = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("IError. Debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }
        String message = "numeroDecimal = " + numeroDecimal;
        message += "\nnumero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        message += "\nnumero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        message += "\nnumero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(message);



    }
}
