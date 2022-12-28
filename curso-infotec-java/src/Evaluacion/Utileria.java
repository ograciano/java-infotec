package Evaluacion;

import java.util.ArrayList;
import java.util.Date;

public class Utileria {

    private static int contador;
    public static Producto mayorPrecio(ArrayList<Producto> productos) {
        int mayor = 0;
        Producto producto = new Producto();
        for (int i = 0; i < productos.size(); i++) {
            int precio = productos.get(i).getPrecio();
            if(mayor == 0) {
                mayor = precio;
                producto = productos.get(i);
            } else if(precio > mayor) {
                mayor = precio;
                producto = productos.get(i);
            }

        }

        return producto;
    }

    public static Producto mayorCantidad(ArrayList<Producto> productos) {
        int mayor = 0;
        Producto producto = new Producto();
        for (int i = 0; i < productos.size(); i++) {
            int cantidad = productos.get(i).getCantidad();
            if(mayor == 0) {
                mayor = cantidad;
                producto = productos.get(i);
            } else if(cantidad > mayor) {
                mayor = cantidad;
                producto = productos.get(i);
            }

        }

        return producto;
    }

    public static String totalCosto(ArrayList<Producto> productos) {
        int costoTotal = 0;
        for (int i = 0; i < productos.size(); i++)
            costoTotal += productos.get(i).getCantidad() * productos.get(i).getPrecio();
        return "El costo total de los prductos es: " + costoTotal;
    }

    public static String sinDisponibilidad(ArrayList<Producto> productos) {
        String mensaje = "";
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getCantidad() == 0) mensaje += productos.get(i).toString();
        }
        return mensaje;
    }

    public static void resultado(ArrayList<Producto> productos) {
        Producto precioMayor = mayorPrecio(productos);
        Producto cantidadMayor = mayorCantidad(productos);
        String costoTotal = totalCosto(productos);
        String sinDisponibilidad = sinDisponibilidad(productos);
        String mensaje = "";

        mensaje += "El producto con el mayor perecio es: " + precioMayor.toString() + ".\n";
        mensaje += "El producto con la mayor cantidad es: " + cantidadMayor.toString() + ".\n";
        mensaje += costoTotal + ".\n";
        mensaje += "Los productos sin disponibilidad son: " + sinDisponibilidad + ".\n";
        contar();
        System.out.println(mensaje);

    }

    public static void horaActual() {
        contar();
        System.out.println(" Hora actual: " + new Date(new Date().getTime()));
    }

    public static ArrayList<Empleado> sinTipo3(ArrayList<Empleado> empleados) {
        ArrayList<Empleado> newEmpleados = new ArrayList<Empleado>();
        for (int i = 0; i < empleados.size(); i++) {
            Empleado.Tipo tipo = empleados.get(i).getTipo();
            if( tipo == Empleado.Tipo.Tipo1 || tipo == Empleado.Tipo.Tipo2) newEmpleados.add(empleados.get(i));
        }
        contar();
        return newEmpleados;
    }

    public static String cadenaMayuscula(String cadena) {
        contar();
        return cadena.toUpperCase();
    }

    public static String cadenaReves(String cadena) {
        String invertida ="";
        for (int i = cadena.length() - 1; i >= 0 ; i--) {
            invertida += cadena.charAt(i);
        }
        contar();
        return invertida;
    }

    private static void contar() {
        contador++;
        System.out.println("Se ha visitado la utileria " + contador + " Veces");
    }


}
