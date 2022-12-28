public class PrimitivoCaracter {
    public static void main(String[] args) {
        char character = 'a';
        char decimal = 64;
        System.out.println("character = " + character);
        System.out.println("decimal = " + decimal);
        System.out.println("(decimal == character) = " + (decimal == character));

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("(simbolo == character) = " + (simbolo == character));

        System.out.println("char corresponde en byte a: " + Character.BYTES);
        System.out.println("char corresponde en bites a: " + Character.SIZE);
        System.out.println("Character.MAX_VALUE = " + Character.MAX_VALUE);
        System.out.println("Character.MIN_VALUE = " + Character.MIN_VALUE);
    }
}
