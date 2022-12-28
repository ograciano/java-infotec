public abstract class Persona {
    private String nombre;

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public Persona(String nombre){
        super();
        this.nombre = nombre;
    }

    public abstract Boolean trabajando();

    public static void main(String[] args) {
        Persona i = new Doctor("Pedro");
        Persona d = new Abogado("Gema");

        System.out.println(i.trabajando());
        System.out.println(d.trabajando());
    }
}
