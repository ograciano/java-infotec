package TareaAbstract1;

public abstract class Figura {
    private Integer coordenada_x;
    private Integer coordenada_y;
    private Integer ancho;
    private Integer alto;
    private Double perimetro;
    private Double area;

    public Integer getCoordenada_x() {
        return coordenada_x;
    }

    public void setCoordenada_x(Integer coordenada_x) {
        this.coordenada_x = coordenada_x;
    }

    public Integer getCoordenada_y() {
        return coordenada_y;
    }

    public void setCoordenada_y(Integer coordenada_y) {
        this.coordenada_y = coordenada_y;
    }

    public Integer getAncho() {
        return ancho;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    public Integer getAlto() {
        return alto;
    }

    public void setAlto(Integer alto) {
        this.alto = alto;
    }

    public Double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(Double perimetro) {
        this.perimetro = perimetro;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Figura(Integer ancho, Integer alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    abstract public Double area();

}
