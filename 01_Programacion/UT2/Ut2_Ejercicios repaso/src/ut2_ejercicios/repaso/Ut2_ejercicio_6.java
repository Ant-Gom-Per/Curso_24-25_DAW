/*
 * 6.- Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien…
 */
package ut2_ejercicios.repaso;

import java.util.Scanner;

public class Ut2_ejercicio_6 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int numNota = 0;
        String valCalific;
        
        System.out.print("Introduce una nota: ");
        if(!teclado.hasNextInt()){
            System.out.println("Error, dato no válido.");
        }else{
            numNota = teclado.nextInt();
            teclado.nextLine();
            if(numNota < 0 || numNota > 10){
                System.out.println("Error, valor no válido.");
            }else{
                switch (numNota){
                    case 1: case 2: case 3: case 4:
                        valCalific = "Insuficiente";
                        break;
                    case 5:
                        valCalific = "Suficiente";
                        break;
                    case 6:
                        valCalific = "Bien";
                        break;
                    case 7: case 8:
                        valCalific = "Notable";
                        break;
                    case 9:
                        valCalific = "Sobresaliente";
                        break;
                    default:
                        valCalific = "Matricula";
                }
                System.out.println("La nota obtenida es: " + valCalific);
            }
        }                
    }    
}
