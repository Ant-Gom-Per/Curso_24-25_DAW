/*
Autor: Antonio
Este programa nos resueve una ecuación de una incognita.
*/

import java.util.Scanner;

public class RepasoExamen2 {
    
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);

        double valor1, valor2, incognita;

        System.out.print("Introduce el valor que acompaña a la X: ");
        valor1 = teclado.nextDouble();
        teclado.nextLine();
        System.out.print("Introduce el valor que no acompaña a la X: ");
        valor2 = teclado.nextDouble();
        teclado.nextLine();
        System.out.println("\n-------------------------");
        System.out.println("-- Esta es la equación --");
        System.out.println("--   " + valor1 + "x + " + valor2 + " = 0    --");
        System.out.println("-------------------------\n");
        incognita = -valor2/valor1;
        System.out.printf("En este caso el valor de x es de %.1f\n",incognita);
        teclado.close();
    }
}
