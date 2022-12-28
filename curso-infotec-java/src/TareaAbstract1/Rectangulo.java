package TareaAbstract1;

public class Rectangulo extends Figura{
    public Rectangulo(Integer ancho, Integer alto) {
        super(ancho, alto);
    }

    @Override
    public Double area() {
        return Double.valueOf(getAncho() * getAlto());
    }
}
