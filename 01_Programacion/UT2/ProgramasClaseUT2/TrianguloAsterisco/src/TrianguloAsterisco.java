/*
Ejercicio 8, 9 y 10 no evaluables UT 2.3
 */
import java.util.Scanner;
public class TrianguloAsterisco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int var1;
        final char ESPACIO = ' ';
        final char ASTERISCO = '*';      
        
        System.out.print("Introduce la altura del triangulo: ");
        while(!teclado.hasNextInt() || (var1 =teclado.nextInt()) <1 || var1>20){
            System.out.println("Error, dato no válido.");
            System.out.print("Introduce la altura del triangulo: ");
            teclado.nextLine();
        }
        
        //Triangulo rectángulo a la izquierda
        for(int i=0 ; i<var1 ;i++){
            for (int j=0 ; j<=i ; j++){
                System.out.print(ASTERISCO);
            }
            System.out.println("");
        } 
        System.out.println("");
        
        // Triangulo invertido
        for(int i=0 ; i<var1 ; i++){
            for(int j=var1; j>i; j--){
                System.out.print(ASTERISCO);
            }
            System.out.println("");
        }
        System.out.println("");
        
        //triangulo rectángulo a la derecha
        for(int i=0; i<var1 ;i++){
            for(int j=var1-1 ; j>i ; j--){
                System.out.print(ESPACIO);
            }
            for(int k=0 ; k<=i ; k++){
                System.out.print(ASTERISCO);                
            }
            System.out.println("");
        }       
    }
    
}
