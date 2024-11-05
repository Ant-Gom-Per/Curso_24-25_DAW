/*
Ejercicio 3.8 UT3_3
 */

import java.util.Scanner;
public class CreaBiArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int filas, columnas;
        
        System.out.print("introduce filas: ");
        filas=teclado.nextInt();
        System.out.print("introduce columnas: ");
        columnas=teclado.nextInt();
        
        int [][] arrayBi = new int [filas][columnas];
        
        for(int i=0 ;i<arrayBi.length;i++){
            for(int j=0; j < arrayBi[i].length; j++){
                arrayBi[i][j] =i+j;
            }            
        }
        for(int i=0 ;i<arrayBi.length;i++){
            for(int j=0; j < arrayBi[i].length; j++){
                System.out.print(arrayBi[i][j] + " ");
            }
            System.out.println("");
        }        
    }
    
}