/*
 Clase principal
 */
package ra4_ejercicios;


public class Ra4_ejercicios {

    public static void main(String[] args) {
        CuentaBancaria cuenta01 = new CuentaBancaria("Benito Camelas", 200);
        cuenta01.verInfo();
        
        CuentaBancaria cuenta02 = new CuentaBancaria(cuenta01);
        cuenta02.verInfo();
        
        
        cuenta02.depositar(150);
        cuenta02.retirar(250);
        
        System.out.println("Despue de modificar la copia");
        cuenta01.verInfo();
        cuenta02.verInfo();
    }    
}
