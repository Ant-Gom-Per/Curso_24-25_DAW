/**
 * 2.- Programa que lea dos números por teclado y muestre el resultado de la división del primer número por el segundo.
 * Hay que comprobar que el divisor no puede ser cero.
 **/
package ut2_ejercicios.repaso;

import java.util.Scanner;

public class Ut2_ejercicio_2 {
   
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int numA, numB, numResult = 0;
        
        System.out.print("Introduce un primer número: ");
        numA = teclado.nextInt();
        teclado.nextLine();
        
        System.out.print("Introduce un segundo número: ");
        numB = teclado.nextInt();
        teclado.nextLine();
        
        if(numB == 0){
            System.out.println("Error!!, el divisor no puede ser 0");        
        }else{
            numResult = numA/numB;
            System.out.println("El resultado es: " + numResult);
        }                
    }    
}
