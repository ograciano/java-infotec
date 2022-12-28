package TareaAbstact2;

public class Libro extends Publicacion implements PrestaLibro{
    private Boolean prestado = false;
    public Libro(Integer codigo, String titulo, String estado, Integer anioPublicacion) {
        super(codigo, titulo, estado, anioPublicacion);
    }

    @Override
    public String toString(){
        return "codigo: " + getCodigo() + ", titulo: " + getTitulo() + ", estado: " + getEstado() + ", año publicacion" + getAnioPublicacion() + ", Prestado: " + prestado;
    }

    public String anioCodigo() {
        return "Año de Publicacion: " + getAnioPublicacion() + ", Codigo: " + getCodigo();
    }

    @Override
    public void prestar() {
        prestado = true;

    }

    @Override
    public void devolver() {
        prestado = false;

    }

    @Override
    public boolean prestado() {
        return prestado;
    }
}
