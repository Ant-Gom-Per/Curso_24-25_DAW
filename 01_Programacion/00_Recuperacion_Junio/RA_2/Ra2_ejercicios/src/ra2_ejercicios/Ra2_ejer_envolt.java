/*
Leer 5 calificaciones numéricas (enteros del 0 al 100) de parte del usuario, 
almacenarlas como objetos Integer, calcular el promedio y mostrarlo usando Double.
 */
package ra2_ejercicios;

import java.util.Scanner;

public class Ra2_ejer_envolt {
   
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        Integer[] calificaciones = new Integer[5];
        
        System.out.println("Ingresa 5 calificaciones entre 0 y 100");
        for(int i=0; i<calificaciones.length; i++){
            System.out.println("Calificación " + (i+1) + ": ");
            int entrada = teclado.nextInt();
            
            calificaciones[i] = Integer.valueOf(entrada);
        }
        
        int suma = 0;
        for(Integer cal : calificaciones){
            suma += cal;
        }
        
        Double promedio = Double.valueOf(suma)/calificaciones.length;
        
        System.out.println("\nCalificaciones insertadas: ");
        for(Integer cal : calificaciones){
            System.out.println(cal);
        }
        System.out.println("\nPrmedio: " + promedio);
    }    
}
