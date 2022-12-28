package Ejercicios7y8.Ejercicio4;




import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;

public class Ejercicio4 {
    public static void main(String[] args) throws IOException, ParseException {
        JSONParser parser = new JSONParser();

        ArrayList<ArchivoJson> personas = leerJson(parser);
        ArrayList<ArchivoJson> personasModificadas = modificarNombrePersona(personas);

        guardarJson(personasModificadas, parser);

    }

    private static ArrayList<ArchivoJson> leerJson(JSONParser parser) throws IOException, ParseException {
        ArrayList<ArchivoJson> personas = new ArrayList<ArchivoJson>();
        Object obj = parser.parse(new FileReader("/home/ograciano/IdeaProjects/curso-infotec-java/src/Ejercicios7y8/Ejercicio4/info.json"));
        JSONObject jsonObject = (JSONObject) obj;
        JSONArray array = (JSONArray) jsonObject.get("infoJson");
        for (int i = 0; i < array.size(); i++) {
            JSONObject jsonObject1 = (JSONObject) array.get(i);
            String nombre = (String) jsonObject1.get("nombre");
            String tipo = (String) jsonObject1.get("tipo");
            String peso = (String) jsonObject1.get("peso");
            ArchivoJson persona = new ArchivoJson(nombre, tipo, peso);
            personas.add(persona);
        }
        return personas;
    }

    private static ArrayList<ArchivoJson> modificarNombrePersona(ArrayList<ArchivoJson> personas) {
        for (int i = 0; i < personas.size(); i++) {
            ArchivoJson persona = new ArchivoJson(personas.get(i).getNombre() + "-modificado", personas.get(i).getTipo(), personas.get(i).getPeso());
            personas.set(i, persona);
        }
        return personas;
    }

    private static void guardarJson(ArrayList<ArchivoJson> personas, JSONParser parser) throws IOException, ParseException {
        String url = "/home/ograciano/IdeaProjects/curso-infotec-java/src/Ejercicios7y8/Ejercicio4/";
        String nameOld = "info " + new Date().toString() + ".json";
        String name = "info.json";
        FileWriter fileOld = new FileWriter(url + nameOld);
        Object obj = parser.parse(new FileReader("/home/ograciano/IdeaProjects/curso-infotec-java/src/Ejercicios7y8/Ejercicio4/info.json"));
        JSONObject jsonObject = (JSONObject) obj;
        fileOld.write(jsonObject.toJSONString());
        fileOld.flush();
        fileOld.close();

        FileWriter file = new FileWriter(url + name);
        JSONArray personasArray = new JSONArray();
        JSONObject infoJson = new JSONObject();

        for (int i = 0; i < personas.size(); i++) {
            JSONObject persona = new JSONObject();
            persona.put("nombre", personas.get(i).getNombre());
            persona.put("tipo", personas.get(i).getTipo());
            persona.put("peso", personas.get(i).getPeso());
            personasArray.add(persona);
        }

        infoJson.put("infoJson", personasArray);

        file.write(infoJson.toJSONString());
        file.flush();
        file.close();
    }
}
