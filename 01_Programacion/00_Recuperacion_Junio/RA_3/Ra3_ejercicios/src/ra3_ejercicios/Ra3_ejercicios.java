/*
 * Crea un programa en Java que pida al usuario que ingrese su edad y su salario. 
   Si la edad es menor de 18, el programa debe mostrar un mensaje indicando que es menor de edad. 
   Si la edad es mayor o igual a 18, el programa debe mostrar el salario que ha ingresado. 
   Asegúrate de controlar las excepciones en caso de que el usuario ingrese un valor no numérico para la edad o el salario.
 */
package ra3_ejercicios;

import java.util.Scanner;

public class Ra3_ejercicios {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int edad;
        double salario;
        
        try{
            System.out.print("Ingresa tu edad: ");
            edad = Integer.parseInt(teclado.nextLine());  // Integer.parseInt(convierte lo del parentesis en un int)
                                                            // Si no puede, lanza un NumberFormatException
            if(edad < 18 ){
                System.out.println("Eres menor de edad.");
            }else{
                System.out.print("Ingresa tu salario: ");
                salario = Double.parseDouble(teclado.nextLine());
                System.out.println("Tu salario es: " + salario + "€");
            }
        }catch(NumberFormatException e){
            System.out.println("Error, dato no válido.");
        }finally{
            teclado.close();
        }
    }    
}
