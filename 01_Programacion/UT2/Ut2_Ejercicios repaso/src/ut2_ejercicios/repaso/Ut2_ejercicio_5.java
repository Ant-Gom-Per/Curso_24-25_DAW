/*
 * 5.- Programa en Java que lea un carácter por teclado y compruebe si es un dígito numérico (cifra entre 0 y 9).
 */
package ut2_ejercicios.repaso;

import java.util.Scanner;

public class Ut2_ejercicio_5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int numA;
        
        System.out.print("Introduce un número entre 0 y 9: ");
        if(teclado.hasNextInt()){ // El método .hasNextInt() devuelve un booleano
            numA = teclado.nextInt();
            teclado.nextLine();
            if(numA < 0 || numA > 9){
                System.out.println("El número no es correcto.");
            }else{
                System.out.println("El número " + numA + " es correcto.");
            }
        }else{
            System.out.println("No has introducido un valor numérico entero.");
        }
    }    
}
