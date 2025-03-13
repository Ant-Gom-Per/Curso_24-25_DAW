/*
3.- Programa Java que lea un número entero por teclado y calculo si es parejo o impar.

Por: Antonio Gómez Pérez
Este programa nos dice si un número es par o impar, para ello emplea una estructura ternaria
 */
import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int valor1;
        
        System.out.print("Dime un número: ");
        valor1 = teclado.nextInt();
        teclado.nextLine();
        
        System.out.println((valor1%2 == 0) ? "Es par" : "Es impar");
    }
    
}
