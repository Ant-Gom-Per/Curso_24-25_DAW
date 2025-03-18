/*
 * 4.- Programa en Java que pregunto al usuario “En qué año entró en circulación el euro?”. 
 * Si el usuario responde 2002 se mostrará por pantalla el mensaje “CORRECTO”. 
 * Si el usuario introduce un año anterior en 2002 se mostrará por pantalla “No, fue después”, y 
 * en caso de que introduzca un año posterior mostrará “No, fue antes”.
 */
package ut2_ejercicios.repaso;

import java.util.Scanner;

public class Ut2_ejercicio_4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        final int CIRC_EURO = 2002;
        int numResp;
        
        System.out.print("¿En que año entró en circulacion el euro? ");
        numResp = teclado.nextInt();
        teclado.nextLine();
        
        if(numResp == CIRC_EURO){
            System.out.println("Correcto!!");
        }else if(numResp > CIRC_EURO){
            System.out.println("No, fué antes");
        }else{
            System.out.println("No, fué después");
        }
    }    
}
