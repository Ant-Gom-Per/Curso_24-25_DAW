/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentacorrienteut5;

/**
 *
 * @author ciclost
 */
public class CuentaCorrienteUt5 {
    private int dni;
    private String titular;
    private double saldo;
    
    public CuentaCorrienteUt5(int numDni, String nomTitular){
        dni = numDni;
        titular = nomTitular;
        saldo = 0.0;
    }
    
    public void ingresarDinero(double numIngreso){
        if(saldo > 0) saldo += numIngreso;
    }
    
    public void sacarDinero(double numSacar){
        if(saldo - numSacar < 0){ System.out.println("Error!!, no hay saldo suficiente");
        }
        else{
            System.out.print("Tu saldo es: ");
            saldo -= numSacar;
        }
    }
        
}


