package Evaluacion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Producto {

    // prueba
    private static List<TipoProducto> tList;
    private static void regenerateList() {
        tList = new ArrayList<TipoProducto>(Arrays.asList(TipoProducto.values()));
        Collections.shuffle(tList);
    }



    public static TipoProducto getRandomProducto() {
        if (tList == null) regenerateList();
        if (tList.size() > 0) {
            return tList.remove(0);
        } else {
            regenerateList();
            return getRandomProducto();
        }
    }

    private int precio = ThreadLocalRandom.current().nextInt(300, 501);
    private int cantidad = ThreadLocalRandom.current().nextInt(10, 16);
    private TipoProducto tipo = getRandomProducto();
    private String nombre = tipo.getNombreProducto();

    public Producto() {}

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void venta() {
        if(getCantidad() != 0) setCantidad(getCantidad() - 1);
        else System.out.println("El producto: " + tipo.getNombreProducto() + " no hay mas en stock");
    }

    @Override
    public String toString() {
        return "Producto{" +
                "precio=" + precio +
                ", cantidad=" + cantidad +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
