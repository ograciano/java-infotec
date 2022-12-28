package TareaAbstract1;

public class Main {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(10,20);
        Rectangulo rectangulo = new Rectangulo(5,15);
        Circulo circulo = new Circulo(8, 10);

        System.out.println(triangulo.area());
        System.out.println(rectangulo.area());
        System.out.println(circulo.area());
    }
}
