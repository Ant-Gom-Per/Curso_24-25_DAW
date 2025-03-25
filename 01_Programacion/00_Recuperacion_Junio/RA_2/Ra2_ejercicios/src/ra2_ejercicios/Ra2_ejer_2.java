/*
Este programa calculará el factorial de un número, verificará si el resultado es 
par o impar y repetirá el proceso hasta que el usuario decida salir.
*/
package ra2_ejercicios;

import java.util.Scanner;

public class Ra2_ejer_2 {

    public static void main(String[] args) {
        
        Ra2_ejer_2 programa = new Ra2_ejer_2();
        
    }
    
    public void inicio(){
                        
    }
    
    public int calcFactorial(int numFact){
        int factorial = 1;
        for (int i = 0; i <= numFact; i++){
            factorial *= i;
        }
        return factorial;
    }
    
    public int leerEntero(){
        Scanner teclado = new Scanner(System.in);
        int numEnt = 0;
        do{
            System.out.println("Introduce un entero: ");
            numEnt = teclado.nextInt();
            if(!teclado.hasNextInt() || (numEnt = teclado.nextInt()) < 0){
                System.out.println("Error, valor no válido.");
            }
        }while(!teclado.hasNextInt() || (numEnt = teclado.nextInt()) < 0);
        
        /**
        System.out.println("Introduce un entero: ");
        while(!teclado.hasNextInt()){
            teclado.nextLine();
            System.out.print("Error, dato no válido.\nIntroduce un entero: ");
        }
        numEnt = teclado.nextInt();
        teclado.nextLine();**/
        return numEnt;        
    }
}
