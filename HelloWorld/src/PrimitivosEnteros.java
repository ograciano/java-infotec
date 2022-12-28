public class PrimitivosEnteros {
    public static void main(String[] args) {
        byte numeroByte = 7;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo byte correcponde en byte a: " + Byte.BYTES);
        System.out.println("Tipo byte correcponde en bites a: " + Byte.SIZE);
        System.out.println("Valor maximo de un byte es: " + Byte.MAX_VALUE);
        System.out.println("TValor minimo de un byte es: " + Byte.MIN_VALUE);

        short numeroShort = 30000;
        System.out.println("\nnumeroByte = " + numeroShort);
        System.out.println("Tipo short correcponde en byte a: " + Short.BYTES);
        System.out.println("Tipo short correcponde en bites a: " + Short.SIZE);
        System.out.println("Valor maximo de un short es: " + Short.MAX_VALUE);
        System.out.println("TValor minimo de un short es: " + Short.MIN_VALUE);

        int numeroInt = 32768;
        System.out.println("\nnumeroInt = " + numeroInt);
        System.out.println("Tipo int correcponde en byte a: " + Integer.BYTES);
        System.out.println("Tipo int correcponde en bites a: " + Integer.SIZE);
        System.out.println("Valor maximo de un int es: " + Integer.MAX_VALUE);
        System.out.println("TValor minimo de un int es: " + Integer.MIN_VALUE);

        long numeroLong = 2147483648999L;
        System.out.println("\nnumeroLong = " + numeroLong);
        System.out.println("Tipo long correcponde en byte a: " + Long.BYTES);
        System.out.println("Tipo long correcponde en bites a: " + Long.SIZE);
        System.out.println("Valor maximo de un long es: " + Long.MAX_VALUE);
        System.out.println("TValor minimo de un long es: " + Long.MIN_VALUE);
    }
}
