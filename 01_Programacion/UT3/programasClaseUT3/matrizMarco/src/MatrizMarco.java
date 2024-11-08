/*
EjerciciosClase 3_3 ejercicio2
 */

public class MatrizMarco {

    public static void main(String[] args) {
        final int COLUMNAS = 8, FILAS = 6;      
        
        int matriz [][] = new int[COLUMNAS][FILAS];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == 0 || j == 0 || i == matriz.length-1 || j == matriz[i].length-1) {
                    matriz[i][j] =1;    
                }
                
            }
            
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
                               
            }
            System.out.println("");
        }
    }
    
}
