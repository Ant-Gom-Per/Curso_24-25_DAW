/*
Ejemplo recorrer matrices y sumarlas
 */

public class SumaMatrizManeras {

    public static void main(String[] args) {
        int[][] matriz1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}                
        };
         int[][] matriz2 = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}                
        };
        System.out.println("Matriz 1: ");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(matriz1[i][j] + " ");                
            }
            System.out.println(" ");
        }
        System.out.println("\nMatriz 2: ");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j] + " ");                
            }
            System.out.println(" ");
        }// hasta aqui imprimo las dos matrices por pantalla
        
        /*
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz1[i][j] += matriz2[matriz2.length -1 -i][matriz2.length -1 -j];                
            }            
        }// Este bucle suma dato a dato desde la ultima posicion de la ultima columna de matriz2 hasta la primera posicion de la primera fila. Forma de Z desde abajo
        
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz1[i][j] += matriz2[matriz2.length -1 -j][matriz2.length -1 -i];                
            }            
        }Este bucle suma dato a dato desde la ultima posicion de la ultima columna de matriz2 hasta la primera posicion de la primera fila. Forma de N invertida
        
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz1[i][j] += matriz2[i][matriz2.length -1 -j];                
            }            
        }// Este bucle suma desde la ultima posicion de la primera fila en matriz2 los datos en la primera posicion de la primera fila de matriz1.Forma de Z invertida
        
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz1[i][j] += matriz2[matriz2.length -1 -i][j];                
            }            
        }// Este bucle suma desde la ultima posicion de la primera columna en matriz2 los datos en la primera posicion de la primera columna de matriz1.Forma de NN
        */
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz1[i][j] += matriz2[matriz2.length -1 -i][matriz2.length -1 -j];                
            }            
        }
        System.out.println("\nSumatorio:");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(matriz1[i][j] + " ");                
            }
            System.out.println(" ");
        }// Este bucle imprime la matriz
    }
    
}
