/*
 * Crea un programa en Java que pida al usuario ingresar números positivos (pueden ser decimales) y calcule 
   la suma de esos números. El programa debe seguir pidiendo números hasta que el usuario ingrese un valor negativo. 
   Si el usuario ingresa un valor que no es un número, debe mostrar un mensaje de error y seguir pidiendo el 
   número hasta que se ingrese uno válido.
 */
package ra3_ejercicios;

import java.util.Scanner;

public class Ra3_ejer_03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double numTotal = 0, numIntrod;
        boolean seguir = true;       
        
        while(seguir){
            try{
                System.out.print("Ingresa un numero positivo (negativo para salir): ");                
                numIntrod = Double.parseDouble(teclado.nextLine());
                
                if(numIntrod < 0){
                    seguir = false;
                    System.out.println("Numero negativo introducido, finalizando el programa...");                    
                }else{
                    numTotal += numIntrod;
                }
            }catch(NumberFormatException e){
                System.out.println("Error, el dato introducido no es válido");                
            }
        }
        
        System.out.println("----------------------------------------------------------");
        System.out.printf("La suma total de los valores introducidos es: %.2f\n",numTotal);        
        teclado.close();
    }    
}
