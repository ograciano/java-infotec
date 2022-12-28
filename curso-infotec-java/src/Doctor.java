public class Doctor extends Persona {
    public Doctor(String nombre){
        super(nombre);
    }

    @Override
    public Boolean trabajando() {
        return true;
    }
}
