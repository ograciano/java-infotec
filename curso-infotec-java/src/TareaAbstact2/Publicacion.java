package TareaAbstact2;

public class Publicacion {
    private Integer codigo;
    private String titulo;
    private String estado;
    private Integer anioPublicacion;

    public Publicacion(Integer codigo, String titulo, String estado, Integer anioPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.estado = estado;
        this.anioPublicacion = anioPublicacion;
    }


    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(Integer anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
