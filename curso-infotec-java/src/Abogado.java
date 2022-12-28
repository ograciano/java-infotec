public class Abogado extends Persona {
    public Abogado(String nombre){
        super(nombre);
    }
    @Override
    public Boolean trabajando() {
        return false;
    }
}
