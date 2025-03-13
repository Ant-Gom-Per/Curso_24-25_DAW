/*
 * 3.- Programa Java que lea un número entero por teclado y calcule si es par o impar.
 */
package ut2_ejercicios.repaso;

import java.util.Scanner;

public class Ut2_ejercicio_3 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int numA, numResult;
        
        System.out.print("Introduce un número: ");
        numA = teclado.nextInt();
        teclado.nextLine();
        
        numResult = numA % 2;
        
        System.out.println( (numResult == 0) ? "El número es par" : "El número es impar");
        
        System.out.println("---------------------");
        
        if(numResult != 0){
            System.out.println("El número es impar");
        }else{
            System.out.println("El número es par");
        }
    }    
}
