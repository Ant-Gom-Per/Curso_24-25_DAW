/**
 * 1.- Escribe un programa que diga cuál es la última cifra de un número entero introducido por teclado.
 **/
package ut2_ejercicios.repaso;

import java.util.Scanner;

public class Ut2_EjerciciosRepaso {        

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int numEntero, numResult;
        
        System.out.println("Introduce un número: ");
        numEntero = teclado.nextInt();
        teclado.nextLine();
        
        numResult = numEntero % 10;
        
        System.out.println("La útima cifra es: " + numResult);
        
        
    }
    
}
