/*
Por: Antonio Gómez Pérez
 */

import java.util.Scanner; 
public class UT3Problema3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int tamanyo =0, maxFilas=0, maxColum=0, contador=0, contDiagonal=0;
        boolean semaforoCeros = true;
        
        System.out.print("Introduce el tamaño de la matriz: ");
        while(!teclado.hasNextInt() || (tamanyo = teclado.nextInt()) < 1){
            teclado.nextLine();
            System.out.println("Error, dato no válido.");
            System.out.print("Introduce el tamaño de la matriz: ");
        }
        teclado.nextLine();
        
        int [][] matrizBinaria = new int [tamanyo][tamanyo];
        int [] arrayFilas = new int [tamanyo];
        int [] arrayColum = new int [tamanyo];        
        
        for (int i = 0; i < matrizBinaria.length; i++) {
            for (int j = 0; j < matrizBinaria[i].length; j++) {
                matrizBinaria [i][j] = (int)(Math.random()*2);
                System.out.print(matrizBinaria[i][j] + " ");                
            }
            System.out.println();            
        }
        System.out.println(" ");
        //Hasta aqui creo la matriz con 1 y 0 aleatorios
        
        for (int i = 0; i < tamanyo; i++) {           
            for (int j = 0; j <  tamanyo; j++) {
               arrayFilas[i] += matrizBinaria[i][j];
               arrayColum[j] += matrizBinaria[i][j];
            }            
        }//Hasta quí almaceno en dos array la cantidad de 1's por fila y columna  
        
        for (int i = 0; i < tamanyo && semaforoCeros; i++) {
            for (int j = 0; j < tamanyo; j++) {
                if(matrizBinaria[i][j] == 1){
                    semaforoCeros = false;
                }                
            }            
        }
        if(semaforoCeros == true) System.out.println("1. La matriz solo tiene Ceros");        
        for (int i = 0; i < tamanyo && !semaforoCeros; i++) {
            if(arrayFilas[i] > maxFilas){                
                maxFilas = arrayFilas[i];                              
            }            
        }
        for (int i = 0; i < tamanyo && !semaforoCeros; i++) {
            if(maxFilas == arrayFilas[i]){
                System.out.println("1. La fila " + i + " con el mayor número de 1's");
            }            
        }
        //Hasta aqui muestro la opcion 1
        
     
        if(semaforoCeros == true) System.out.println("2. La matriz solo tiene Ceros");        
        for (int i = 0; i < tamanyo && !semaforoCeros; i++) {
            if(arrayColum[i] > maxColum){                
                maxColum = arrayColum[i];                             
            }            
        }
        for (int i = 0; i < tamanyo && !semaforoCeros; i++) {
            if(maxColum == arrayColum[i]){
                System.out.println("2. La columna " + i + " con el mayor número de 1's");
            }            
        }
        //Hasta aqui muestro la opcion 2
        
        if(semaforoCeros == true) System.out.println("3. La matriz solo tiene Ceros");
        for (int i = 0; i < arrayFilas.length && !semaforoCeros; i++) {
            if(arrayFilas[i] == tamanyo || arrayFilas[i] == 0){
                if(arrayFilas[i] == tamanyo){
                    System.out.println("3. La fila " + i + " con todo 1's");
                }
                else if(arrayFilas[i] == 0){
                    System.out.println("3. La fila " + i + " con todo 0's");
                }
            }else{
                contador++;
            }            
        }
        if(contador == tamanyo) System.out.println("3. No hay filas con el mismo número");
        contador=0;
        //Hasta aqui muestro la opcion 3
                
        
        if(semaforoCeros == true) System.out.println("4. La matriz solo tiene Ceros");
        for (int i = 0; i < arrayColum.length && !semaforoCeros; i++) {
            if(arrayColum[i] == tamanyo || arrayColum[i] == 0){
                if(arrayColum[i] == tamanyo){
                    System.out.println("4. La columna " + i + " con todo 1's");
                }
                else if(arrayColum[i] == 0){
                    System.out.println("4. La columna " + i + " con todo 0's");
                }
            }else{
                contador++;
            }
        }
        if(contador == tamanyo) System.out.println("4. No hay columnas con el mismo número");
        //Hasta aqui muestro la opcion 4
        
        for (int i = 0; i < tamanyo; i++) {
            contDiagonal += matrizBinaria[i][i];
        }
        if(contDiagonal == tamanyo){
            System.out.println("5. La diagonal mayor con todo 1's");
        }else if(contDiagonal == 0){
            System.out.println("5. La diagonal mayor con todo 0's");
        }else{
            System.out.println("5. La diagonal mayor sin números iguales");
        }
        //Hasta aqui muestro la opcion 5
        
        
        
        
        
        System.out.println("\n----------------------------------");
        System.out.print("arrayFilas: ");
         for (int i = 0; i < arrayFilas.length; i++) {
            System.out.print(arrayFilas[i] + " ");            
        }
        System.out.print(" \narrayColumnas ");
        for (int i = 0; i < arrayColum.length; i++) {
            System.out.print(arrayColum[i] + " ");            
        }
        System.out.println(" \n");
        System.out.println("maxFilas: " + maxFilas);
        System.out.println("maxColum: " + maxColum);
        teclado.close();
    }
    
}
