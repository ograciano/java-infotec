import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese el nombre se la factura:");
            String factura = scanner.nextLine();

            double precio1 = 0.0;
            double precio2 = 0.0;
            try {
                System.out.println("Ingrese el precio del producto 1");
                precio1 = scanner.nextDouble();
                System.out.println("Ingrese el precio del producto 2");
                precio2 = scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Error, El numero debe ser double");
            }

            double precioSinIva = precio1 + precio2;
            double iva = precioSinIva * .19;
            double precioTotal = precioSinIva + iva;

            System.out.println("La factura " + factura + " iene un total bruto de " + precioSinIva +
                    ", con un impuesto de " + iva + " y el monto después de impuesto es de " + precioTotal);
        }

    }
}