/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;
public class Ut3Ejercicio3_2 {

   
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       int numeroNotas;
       
        System.out.print("Introduce el numero de notas: ");
        while(!teclado.hasNextInt() || (numeroNotas = teclado.nextInt()) < 0){
           teclado.nextLine();
           System.out.println("ERROR, dato no válido.");
           System.out.print("Introduce el numero de notas: ");
        }
       teclado.nextLine();
       
       double [] primeraArray = new double[numeroNotas];
       double valorNota;
       
       for(int i = 0; i < numeroNotas ; i++){
           System.out.print("Introduce el valor de una nota: ");
           valorNota = teclado.nextDouble();
           primeraArray[i] = valorNota;
       }
       for(int i = 0; i < primeraArray.length ; i++)
        System.out.println("posicion " + primeraArray[i]);
    }
    
}
