package Bancaria;

public class PruebaCuentaBancaria {
    public static void main(String[] args) {
        System.out.println("Total cuentas" + CuentaBancaria.totalCuentas);
        CuentaBancaria c1;
        c1 = new CuentaBancaria(17.50);
        System.out.println("Nueva CUenta con: " + c1.saldo() + " euros");
        System.out.println("Total cuentas" + CuentaBancaria.totalCuentas);
        CuentaBancaria c2;
        c2 = new CuentaBancaria(20.0);
        System.out.println("Nueva CUenta con: " + c2.saldo() + " euros");
        System.out.println("Total cuentas" + CuentaBancaria.totalCuentas);

        System.out.println("Transferencia de cuenta 2 a cuenta 1");
        c1.transferencias(c2);
        System.out.println("Cuenta 1 con: " + c1.saldo() + " euros");
        System.out.println("Cuenta 217 con: " + c2.saldo() + " euros");

    }
}
