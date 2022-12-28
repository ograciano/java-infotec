package TareaAbstact2;

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro(23245,"LOTR", "bueno", 1952);
        Revista revista = new Revista(5465, "Healt Men", "Bueno", 2022, 100);

        System.out.println(libro.toString());
        System.out.println(libro.anioCodigo());
        System.out.println(revista.toString());
        System.out.println(revista.anioCodigo());
    }
}
