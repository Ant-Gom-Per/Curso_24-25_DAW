/*
Version de pruebas de tension arterial
 */
import java.util.Scanner;
public class PuebaSuper {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int tamanyo =4, maxFilas=0, maxColum=0, contador=0, contDiagonal=0, contSubDiagonal=0;
        boolean semaforoCeros = true;
        
        int [][] matrizBinaria = {
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0}
        };
        
        
        int [] arrayFilas = new int [tamanyo];
        int [] arrayColum = new int [tamanyo];        
 
        
        for (int i = 0; i < tamanyo; i++) {           
            for (int j = 0; j <  tamanyo; j++) {
               arrayFilas[i] += matrizBinaria[i][j];
               arrayColum[j] += matrizBinaria[i][j];
            }            
        }        
        System.out.println(" ");
        //Hasta quí almaceno en dos array la cantidad de 1's por fila y columna 
        
        
        for (int i = 0; i < arrayFilas.length; i++) {
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
        
        
        
        for (int i = 0; i < arrayColum.length ; i++) {
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
        
        
        for (int i = tamanyo-1; i >= 0; i--) {
            contSubDiagonal += matrizBinaria[i][contador];            
            contador++;
        }
        if(contSubDiagonal == tamanyo){
            System.out.println("5. La subdiagonal con todo 1's");
        }else if(contSubDiagonal == 0){
            System.out.println("5. La subdiagonal con todo 0's");
        }else{
            System.out.println("5. La subdiagonal sin números iguales");
        }
        //Hasta aqui muestro la opcion 6
        
        
        
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
        System.out.println("semaforo: " + semaforoCeros);
        System.out.println("contSubDiagonal: " + contSubDiagonal);
        System.out.println("contSubDiagonal: " + contSubDiagonal);
        
        
        
        
        
    }
}
