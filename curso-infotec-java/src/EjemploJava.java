public class EjemploJava {
    public static void main(String[] args) {
        Producto servilleta = new Producto("servilleta", 140.00);
        Cliente cliente1 = new Cliente("Juanito",10.00);
        Tienda tienda = new Tienda("Sonora", "Calle robles",servilleta,cliente1);

        System.out.println("Nombre del cliente " + tienda.getCliente().getNombre());
        System.out.println("Nombre del Producto " + tienda.getProducto().getNombre());
    }
}
