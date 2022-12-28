package TareaAbstract1;

public class Triangulo extends Figura {
    public Triangulo(Integer ancho, Integer alto) {
        super(ancho, alto);
    }

    @Override
    public Double area() {
        return Double.valueOf((getAncho() * getAlto())/2);
    }
}
