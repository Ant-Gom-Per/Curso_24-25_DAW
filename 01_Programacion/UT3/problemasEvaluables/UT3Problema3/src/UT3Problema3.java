/*
Por: Antonio Gómez Pérez
 */

import java.util.Scanner; 
public class UT3Problema3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int tamanyo =0, sumaFilas=0;
        
        
        System.out.print("Introduce el tamaño de la matriz: ");
        while(!teclado.hasNextInt() || (tamanyo = teclado.nextInt()) < 1){
            teclado.nextLine();
            System.out.println("Error, dato no válido.");
            System.out.print("Introduce el tamaño de la matriz: ");
        }
        teclado.nextLine();
        
        int [][] matrizBinaria = new int [tamanyo][tamanyo];
        int [] sumaColumnas = new int [tamanyo];
        
        for (int i = 0; i < matrizBinaria.length; i++) {
            for (int j = 0; j < matrizBinaria[i].length; j++) {
                matrizBinaria [i][j] = (int)(Math.random()*2);
                System.out.print(matrizBinaria[i][j] + " ");                
            }
            System.out.println();
            
        }
        //Has aqui creo la matriz con 1 y 0 aleatorios
        for (int i = 0; i < tamanyo; i++) {           
            for (int j = 0; j <  tamanyo; j++) {
                sumaFilas += matrizBinaria[i][j];
                sumaColumnas[j] += matrizBinaria[i][j];
                
                System.out.print(matrizBinaria[i][j] + "\t");
            }
            System.out.println("| " + sumaFilas);
            sumaFilas =0;
        }
        System.out.println("--------------------------------------");
        for (int i = 0; i < sumaColumnas.length; i++) {
            System.out.print(sumaColumnas[i] + "\t");            
        }
        System.out.println(" \n");
        
        
       
        System.out.println("\nFin del programa"); 
        teclado.close();
    }
    
}
