package TareaAbstact2;

public class Revista extends Publicacion implements PrestaRevista{
    private Integer numero;
    public Revista(Integer codigo, String titulo, String estado, Integer anioPublicacion, Integer numero) {
        super(codigo, titulo, estado, anioPublicacion);
        this.numero = numero;
    }

    @Override
    public String toString(){
        return "codigo: " + getCodigo() + ", titulo: " + getTitulo() + ", estado: " + getEstado() + ", año publicacion" + getAnioPublicacion() + ", Numero: " + numero;
    }

    public String anioCodigo() {
        return "Año de Publicacion: " + getAnioPublicacion() + ", Codigo: " + getCodigo();
    }

    @Override
    public void prestar() {
        return;
    }

    @Override
    public void devolver() {
        return;
    }

    @Override
    public Integer numero() {
        return numero;
    }
}
