/*
 * Crea un programa en Java que pida al usuario ingresar 5 números positivos (pueden ser decimales) y 
   calcule la suma de esos números. El programa debe seguir pidiendo números hasta que se hayan 
   ingresado 5 números válidos. Si el usuario ingresa un valor que no es un número o un número negativo, 
   debe mostrar un mensaje de error y pedir nuevamente el número correspondiente.
   MODIFICADO por mi.
 */
package ra3_ejercicios;

import java.util.Scanner;

public class Ra3_ejer_04_mod {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double numTotal = 0, numIntro = 0;
        int cantNumeros = 0;
        boolean seguir = true;
        
        do{
            try{
                System.out.print("Introduce la cantidad de números a sumar: ");
                cantNumeros = Integer.parseInt(teclado.nextLine());
                 if(cantNumeros < 2){
                     System.out.println("Error, has de introducir mínimo 2 numeros.");
                 }else{
                     seguir = false;
                 }
            }catch(NumberFormatException e){
                System.out.println("Error, introduce un valor válido");
            }
        }while(seguir);                
        
        for (int i=0 ; i<cantNumeros ; i++){
            seguir = true;
            while(seguir){
                try{
                    System.out.print("Te queda por insertar "+ (cantNumeros-i) + "/" + cantNumeros + " numeros positivos: ");
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

