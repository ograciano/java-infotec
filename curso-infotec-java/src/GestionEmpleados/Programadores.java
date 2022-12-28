package GestionEmpleados;

import java.util.ArrayList;
import java.util.Collections;

public class Programadores extends Empleado {
    private String herramientaDesarrollo = "Eclipse";
    public Programadores(String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        setCodigo(9000);
        ArrayList<String> actDiarias = new ArrayList<String>();
        actDiarias.add("Analisis de requerimientos");
        actDiarias.add("Desarrollo de requerimientos");
        actDiarias.add("Presentacion Pruebas unitarias");
        setActividadesDiarias(actDiarias);
    }

    @Override
    public ArrayList<String> obtenerActividadesDiarias() {
        ArrayList<String> act = getActividadesDiarias();
        ArrayList<String> actNew = new ArrayList<String>();
        for (int i = 0; i < act.toArray().length; i++) {
            String palabra = act.get(i);
            actNew.add(act.get(i).substring(1, palabra.length() -1));
        }
        Collections.sort(actNew);
        Collections.reverse(actNew);
        return actNew;
    }

    public String getHerramientaDesarrollo() {
        return herramientaDesarrollo;
    }

    public void setHerramientaDesarrollo(String herramientaDesarrollo) {
        this.herramientaDesarrollo = herramientaDesarrollo;
    }
}
