/*
 * Crea un programa en Java que pida al usuario ingresar 5 números positivos (pueden ser decimales) y 
   calcule la suma de esos números. El programa debe seguir pidiendo números hasta que se hayan 
   ingresado 5 números válidos. Si el usuario ingresa un valor que no es un número o un número negativo, 
   debe mostrar un mensaje de error y pedir nuevamente el número correspondiente.
 */
package ra3_ejercicios;

import java.util.Scanner;

public class Ra3_ejer_04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double numTotal = 0, numIntro = 0;
        int cantNumeros = 3;
        boolean seguir = true;
        
        for (int i=0 ; i<cantNumeros ; i++){
            seguir = true;
            while(seguir){
                try{
                    System.out.print("Inserta " + cantNumeros + " numeros positivos: ");
                    numIntro = Double.parseDouble(teclado.nextLine());
                    
                    if(numIntro < 0){
                        System.out.println("Error, el dato introducido no es positivo.");
                    }else{
                        numTotal += numIntro;
                        seguir = false;
                    }
                }catch(NumberFormatException e){
                    System.out.println("Error, el dato introducido no es válido.");
                }
            }
        }
        System.out.println("--------------------------------------------");
        System.out.printf("La suma total es de: %.2f\n", numTotal);
        teclado.close();
    }
    
}
