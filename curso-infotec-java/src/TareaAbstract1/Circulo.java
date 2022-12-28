package TareaAbstract1;

public class Circulo extends Figura {
    private Double pi = 3.1416;
    public Circulo(Integer ancho, Integer alto) {
        super(ancho, alto);
    }

    @Override
    public Double area() {
        return pi * Math.pow((getAncho() / 2), 2);
    }
}
