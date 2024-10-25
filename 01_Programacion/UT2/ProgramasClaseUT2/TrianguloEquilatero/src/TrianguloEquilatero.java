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
        teclado.close();
        for(int i=0 ; i<altura ; i++){          //Este for hace las filas
            for(int j=altura-1 ; j>i ; j--){    //Este crea los espacios de la izquierda
                System.out.print(ESPACIO);
            }
            for(int k=0 ; k<=i ; k++){          //Este imprime los asteriscos a la izquierda
                System.out.print(ASTERISCO);
            }
            for(int l=0 ; l<i ; l++){           //Este añade un asterisco menos de los añadidos a la derecha
                System.out.print(ASTERISCO);
            }
            System.out.println("");           //Aqui producimos un salto de línea para que aparezca la figura
        }        
        System.out.println("");
    }
    
}
