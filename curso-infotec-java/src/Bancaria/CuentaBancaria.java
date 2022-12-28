package Bancaria;

public class CuentaBancaria {
    private double saldo;
    public static int totalCuentas=0;

    //metodos
    /*public CuentaBancaria(){
        this(ingreso = 0.0);
    }*/

    public CuentaBancaria(double ingreso){
        saldo = ingreso;
        incCuentas();
    }

    public double saldo(){
        return saldo;
    }

    public static void incCuentas(){
        totalCuentas++;
    }

    public void transferencias(CuentaBancaria origen){
        saldo+= origen.saldo;
        origen.saldo=0;
    }
}
