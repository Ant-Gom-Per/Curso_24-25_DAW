/*
Por: Antonio Gómez Pérez
 */

import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int altura;
        final char ESPACIO = ' ';      
        char ascii = 65;
        
        System.out.print("Introduce la altura de la figura: ");
        while(!teclado.hasNextInt() || (altura =teclado.nextInt()) <=0){
            teclado.nextLine();           
            System.out.print("Introduce la altura de la figura ");            
        }
        
        for(int i=0 ; i<altura ; i++){
            for(int j=altura-1 ; j>i ; j--){
                System.out.print(ESPACIO);
            }
            for(int j=0 ; j<=i ; j++ ){
                System.out.print(ascii);
                ascii++;
            }
            for(int j=0 ; j<=i-1 ; j++){
                System.out.print(ascii);
                ascii++;
            }
            ascii =65;
            System.out.println("");
        }    
    }
    
}
