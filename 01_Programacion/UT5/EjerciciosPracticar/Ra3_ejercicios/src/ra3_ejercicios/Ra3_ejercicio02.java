/*
 *  Crea un programa en Java que pida al usuario ingresar dos números enteros. 
    El programa debe verificar si el segundo número es distinto de cero antes de realizar una división. 
    Si el segundo número es cero, debe lanzar una excepción personalizada que indique que no se puede dividir entre cero. 
    Si el segundo número no es cero, se debe realizar la división y mostrar el resultado. 
    Controla las excepciones en caso de que el usuario ingrese valores no numéricos.
 */
package ra3_ejercicios;

import java.util.Scanner;

public class Ra3_ejercicio02 {
    
    //Excepción personalizada
    static class DivisionByCeroException extends Exception {
        public DivisionByCeroException(String message) {
            super(message);
        }
    }
   
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int numA, numB, numResul;
        
        try{
            System.out.print("Introduce el dividendo: ");
            numA = Integer.parseInt(teclado.nextLine());
            System.out.print("Introduce el divisor: ");
            numB = Integer.parseInt(teclado.nextLine());
            
            if(numB == 0){
                throw new DivisionByCeroException("Error, no se puede dividir por 0");
            }else{
                numResul = numA / numB;
                System.out.println("El resultado es: " + numResul);
            }
        }catch(NumberFormatException e){
            System.out.println("Error, valor numérico no válido.");
        }catch(DivisionByCeroException e ){
            System.out.println("Error, el dividendo no puede ser 0");
        }finally{
            teclado.close();
        }
    }    
}
