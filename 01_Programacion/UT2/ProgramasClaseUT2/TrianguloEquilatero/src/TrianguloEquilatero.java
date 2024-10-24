/*
Ejercicio de examen UT2 año 2023
 */
import java.util.Scanner;
public class TrianguloEquilatero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int altura;
        final char ESPACIO = ' ';
        final char ASTERISCO = '*';
        
        System.out.print("Introduce la altura del triángulo: ");
        while (!teclado.hasNextInt() || (altura = teclado.nextInt()) < 1){
            System.out.println("ERROR, dato no válido.");
            System.out.print("Introduce la altura del triángulo: ");
            teclado.nextLine();
        }
        for(int i=0 ; i<altura ; i++){
            for(int j=altura-1 ; j>i ; j--){
                System.out.print(ESPACIO);
            }
            for(int k=0 ; k<=i ; k++){
                System.out.print(ASTERISCO);
            }
            for(int l=0 ; l<i ; l++){
                System.out.print(ASTERISCO);
            }
            System.out.println("");
        }
        
        System.out.println("KAKAPÚ");
    }
    
}
