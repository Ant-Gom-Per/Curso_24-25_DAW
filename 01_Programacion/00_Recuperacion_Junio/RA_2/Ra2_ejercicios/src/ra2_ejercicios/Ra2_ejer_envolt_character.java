/*
Pedir una frase al usuario, recorrer cada carácter de la frase como un 
objeto Character, y contar cuántas vocales contiene.
 */
package ra2_ejercicios;

import java.util.Scanner;

public class Ra2_ejer_envolt_character {

    public static void main(String[] args) {
        Scanner teclado =  new Scanner(System.in);
        
        System.out.println("Ingresa una frase: ");
        String frase = teclado.nextLine();
        
        int contVocales = 0;
        
        for(int i=0; i<frase.length(); i++){
            Character letra = Character.valueOf(frase.charAt(i));
            if(Character.isLetter(letra)){
                char minuscula = Character.toLowerCase(letra);
                if(minuscula == 'a' ||
                   minuscula == 'e' ||
                   minuscula == 'i' ||
                   minuscula == 'o' ||
                   minuscula == 'u'   ){
                   contVocales++;
                }
            }
        }
        System.out.println("\nNúmero de vocales en la frase: " + contVocales);
    }
    
}
