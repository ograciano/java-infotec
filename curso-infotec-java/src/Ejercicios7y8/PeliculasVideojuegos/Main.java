package Ejercicios7y8.PeliculasVideojuegos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
        ArrayList<Videojuego> videojuegos = new ArrayList<Videojuego>();

        peliculas.add(new Pelicula("nope",130,"terror", "Jordan Peele"));
        peliculas.add(new Pelicula("La Abuela",100,"terror", "Paco Plaza"));
        peliculas.add(new Pelicula("El exorcismo de Dios",98,"terror", "Alejandro Hidalgo"));
        peliculas.add(new Pelicula("Top Gun: Maverick",131,"accion", "Joseph Kosinski"));
        peliculas.add(new Pelicula("The Batman",176,"accion", "Matt Reeves"));

        videojuegos.add(new Videojuego("Elden Ring", 3600, "Rol de accion", "FromSoftware"));
        videojuegos.add(new Videojuego("God of War: Ragnarök", 1200, "accion", "SIE Santa Monica Studio"));
        videojuegos.add(new Videojuego("Gran Turismo 7", 1800, "carreras", "Polyphony Digital"));
        videojuegos.add(new Videojuego("The Last of Us Part II", 2400, "survival horror", "Naughty Dog"));
        videojuegos.add(new Videojuego("Resident Evil Village", 4000, "survival horror", "CAPCOM"));

        peliculas.get(1).activar();
        peliculas.get(3).activar();
        peliculas.get(4).activar();

        videojuegos.get(0).activar();
        videojuegos.get(2).activar();
        videojuegos.get(4).activar();

        System.out.println(contarActivosPeliculas(peliculas));
        System.out.println(contarActivosVideojuegos(videojuegos));
        System.out.println("La pelicula de terror con mayor duracion es: " + peliculaTerrorDuracion(peliculas));
        System.out.println("El videojuego de mayor duracion es: " + videojuegoDuracion(videojuegos));

    }

    private static String contarActivosPeliculas(ArrayList<Pelicula> peliculas) {
        int numActivos = 0;
        String inactivos = "";
        for (int i = 0; i < peliculas.size(); i++) {
            if(peliculas.get(i).isActive()) numActivos++;
            if(!peliculas.get(i).isActive()) inactivos += peliculas.get(i).toString() + "\n";
        }
        return "las Peliculas activas son: " + numActivos + " y las peliculas inactivas son: \n" + inactivos;
    }

    private static String contarActivosVideojuegos(ArrayList<Videojuego> videojuegos) {
        int numActivos = 0;
        String inactivos = "";
        for (int i = 0; i < videojuegos.size(); i++) {
            if(videojuegos.get(i).isActive()) numActivos++;
            if(!videojuegos.get(i).isActive()) inactivos += videojuegos.get(i).toString() + "\n";
        }
        return "los Videojuegos activos son: " + numActivos + " y los videojuegos inactivos son: \n" + inactivos;
    }

    private static String peliculaTerrorDuracion(ArrayList<Pelicula> peliculas) {
        Pelicula pelicula = new Pelicula();
        for (int i = 0; i < peliculas.size(); i++) {
            if (peliculas.get(i).getGenero() == "terror")
                if (peliculas.get(i).compareTo(pelicula.getDuracion())) pelicula = peliculas.get(i);
        }
        return pelicula.toString();
    }

    private static String videojuegoDuracion(ArrayList<Videojuego> videojuegos) {
        Videojuego videojuego = new Videojuego();
        for (int i = 0; i < videojuegos.size(); i++) if (videojuegos.get(i).compareTo(videojuego.getDuracion())) videojuego = videojuegos.get(i);
        return videojuego.toString();
    }
}
