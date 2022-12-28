package GestionEmpleados;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Diseñadores extends Empleado {
    private String herramientaDiseno = "Photoshop";

    public Diseñadores(String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        ArrayList<String> actDia= new ArrayList<String>();
        actDia.add("Reuniones de avance");
        actDia.add("Elaboración de diseño para páginas webs");
        actDia.add("Presentación-ajustes del diseño");
        setActividadesDiarias(actDia);
        setCodigo(8000);
    }

    @Override
    public ArrayList<String> obtenerActividadesDiarias() {
        ArrayList<String> actDiarias = getActividadesDiarias();

        int edad = getEdad();
        if ((edad <= 25)) {
            actDiarias.add("Revision de desarrollador SR");
        } else {
            actDiarias.add("Apoyo a desarrollador JR");
        }
        Collections.sort(actDiarias);
        return actDiarias;
    }

    public String getHerramientaDiseno() {
        return herramientaDiseno;
    }

    public void setHerramientaDiseno(String herramientaDiseno) {
        this.herramientaDiseno = herramientaDiseno;
    }
}
