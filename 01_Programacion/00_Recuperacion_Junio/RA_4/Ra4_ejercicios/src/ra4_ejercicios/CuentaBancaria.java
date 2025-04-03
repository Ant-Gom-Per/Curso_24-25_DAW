/*
 Una cuanta bancaria
 */
package ra4_ejercicios;

public class CuentaBancaria {
    
    //Atributo
    private String titular;
    private double saldo;
    
    //Constructor
    public CuentaBancaria(String titular, double saldoInicial){
        this.titular = titular;
        this.saldo = saldoInicial;
    }
    
    public CuentaBancaria(CuentaBancaria otraCuenta){
        this.titular = otraCuenta.titular;
        this.saldo = otraCuenta.saldo;
    }
    
    //Metodos
    public void depositar(double cantidad){
        this.saldo += cantidad;
        System.out.println("Operación realizada.\nNuevo saldo: " + saldo + " €");
    }
    
    public void retirar(double cantidad){
        if(cantidad <= saldo){
            saldo -= cantidad;
            System.out.println("Operación realizada.\nNuevo saldo: " + saldo + " €");
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
    
    public void verInfo(){
        System.out.println("El titular de la cuenta es: " + titular);
        System.out.println("Su saldo actual es: " + saldo + " €");
    }
}

/**
 * CuentaBancaria cuenta01 = new CuentaBancaria("Benito Camelas", 200);
        cuenta01.verSaldo();
        cuenta01.depositar(150);
        cuenta01.retirar(250);
        cuenta01.retirar(150);
 */
