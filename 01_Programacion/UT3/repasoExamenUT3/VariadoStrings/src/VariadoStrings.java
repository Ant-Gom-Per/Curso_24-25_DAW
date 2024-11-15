/*
Variado de Strings
String cadena = new String("Cadena de Texto");
System.out.println(cadena.charAt(2));  // Devuelve la letra 'd'
 */

import java.util.Scanner;
public class VariadoStrings {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] secreta = {"murcielago", "patata", "coche"};
        String[] palabras = new String[4];
        char ascii = 65;
        char[][] matrizChar = new char[4][4];
        
        System.out.print("Elige una palabra: ");
        int posPalabra = teclado.nextInt();
        //Hasta aqui pide la palabra dentro de la array
        
        System.out.println("\nTamaño palabra: "  + secreta[posPalabra].length());
        System.out.print("Letra: ");
        int posLetra = teclado.nextInt();
        //Hasta aqui muestra la cantidad de letras y pide que indique la posicion del alletra a mostrar
        
        
        System.out.println("\nLa letra en la posicion " + posLetra + " es: " + secreta[posPalabra].charAt(posLetra -1));
        System.out.println("La palabra secreta es... " + secreta[posPalabra]);
        
        
        for (int i = 0; i < matrizChar.length; i++) {
            for (int j = 0; j < matrizChar[i].length; j++) {
                matrizChar[i][j] += ascii;
                ascii++;
            }
        }
        for (int i = 0; i < matrizChar.length; i++) {
            for (int j = 0; j < matrizChar[i].length; j++) {
                System.out.print(matrizChar[i][j] + " ");                
            }
            System.out.println("");
        }
        
        System.out.print("introduce palabra: ");
        for (int i = 0; i < palabras.length; i++) {
            palabras[i] = teclado.next();
            System.out.print("introduce palabra: ");
            
        }
        System.out.print("Las palabras son: ");
        for (int i = 0; i < palabras.length; i++) {
            System.out.print(palabras[i] + ", ");
            
        }
        System.out.println(" ");
    }
    
}
