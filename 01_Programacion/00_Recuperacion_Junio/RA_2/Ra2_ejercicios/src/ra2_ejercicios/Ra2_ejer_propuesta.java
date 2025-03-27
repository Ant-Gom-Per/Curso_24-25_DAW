/*
 Alquiler peliculas en un videobank: En un video club se alquilan las peliculas empleando 
saldo de una tarjeta. 
 */
package ra2_ejercicios;

import java.util.Scanner;

public class Ra2_ejer_propuesta {

    public static void main(String[] args) {
        Ra2_ejer_propuesta programa = new Ra2_ejer_propuesta();
        programa.inicio();
    }
    
    public void inicio(){
        double saldoTarjeta = cargarTarjeta();   
        int numPelis = cantPelis();        
        saldoTarjeta = cobrarSaldo(saldoTarjeta, costPelis(numPelis));
        System.out.printf("Su saldo actual es: %.2f\n",saldoTarjeta);              
    }
    
    public double cargarTarjeta(){
        Scanner teclado = new Scanner(System.in);
        double cantRecar;
        System.out.print("Introduce la cantidad de saldo a recargar: ");
        while(!teclado.hasNextDouble() || (cantRecar = teclado.nextDouble()) < 0){
            teclado.nextLine();
            System.out.print("Error, introduce un valor válido\nIntroduce la cantidad de saldo a recargar: ");
        }
        teclado.nextLine();        
        return cantRecar;
    }
    
    public int cantPelis(){
        Scanner teclado = new Scanner(System.in);
        int cantpelis;
        System.out.print("Cuantas pelis quieres alquilar: ");
        while(!teclado.hasNextInt() || (cantpelis = teclado.nextInt()) < 0){
            teclado.nextLine();
            System.out.print("Error, introduce un valor válido\nCuantas pelis quieres alquilar: ");
        }
        teclado.nextLine();
        teclado.close();
        return cantpelis;
    }
    
    public double costPelis(int pelis){
        double costeAquiler = 2.99;
        double costeTotal = costeAquiler * pelis;
        return costeTotal;
    }
    
    public double cobrarSaldo(double saldo, double cobro){        
        if(saldo < cobro){
            System.out.println("Error, saldo insuficiente.");
        }else{
            saldo = saldo - cobro;
            System.out.println("Operación efectuada");
        }     
        return saldo;
    }
    
    
    
}
