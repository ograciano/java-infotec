package Evaluacion;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        ArrayList<Producto> productos = new ArrayList<Producto>();
        for (int i = 1; i <= 20; i++) productos.add(new Producto());
        empleados.add(new Empleado(Empleado.Tipo.Tipo1, "Oscar Graciano", "35", "10"));
        empleados.add(new Empleado(Empleado.Tipo.Tipo1, "Oscar Graciano", "35", "10"));
        empleados.add(new Empleado(Empleado.Tipo.Tipo2, "Oscar Graciano", "35", "10"));
        empleados.add(new Empleado(Empleado.Tipo.Tipo2, "Oscar Graciano", "35", "10"));
        empleados.add(new Empleado(Empleado.Tipo.Tipo3, "Oscar Graciano", "35", "10"));
        empleados.add(new Empleado(Empleado.Tipo.Tipo3, "Oscar Graciano", "35", "10"));

        if (empleados.get(2).correr()) System.out.println("Si puede correr");
        if (empleados.get(5).correr()) System.out.println("Si puede correr");
        if (empleados.get(0).sentarse()) System.out.println("Si puede sentarse");
        if (empleados.get(5).sentarse()) System.out.println("Si puede sentarse");
        if (empleados.get(2).descansar()) System.out.println("Si puede descansar");
        if (empleados.get(5).descansar()) System.out.println("Si puede descansar");
        if (empleados.get(0).venderProductos()) System.out.println("Si puede vender");
        if (empleados.get(5).venderProductos()) System.out.println("Si puede vender");

        System.out.println(productos.get(0).toString());
        if (empleados.get(0).venderProductos()) productos.get(0).venta();
        System.out.println(productos.get(0).toString());

        Utileria.resultado(productos);
        Utileria.horaActual();
        ArrayList<Empleado> nuevosEmpleados = Utileria.sinTipo3(empleados);
        for (int i = 0; i < nuevosEmpleados.size(); i++) System.out.println(nuevosEmpleados.get(i).toString());
        String cadenaMayus = Utileria.cadenaMayuscula("Soy una cadena en Mayusculas");
        System.out.println(cadenaMayus);
        String cadenaReves = Utileria.cadenaReves("Soy una cadena al reves");
        System.out.println(cadenaReves);

    }
}
