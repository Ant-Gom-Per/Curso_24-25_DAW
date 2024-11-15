/*
Por: Antonio Gómez Pérez
 */

public class Ej2 {

    public static void main(String[] args) {
        char[][] matrizLetras ={
            {'A', 'B', 'C', 'D', 'E'},
            {'F', 'G', 'H', 'I', 'J'},
            {'K', 'L', 'M', 'N', 'Ñ'},
            {'O', 'P', 'Q', 'R', 'S'},
            {'T', 'V', 'W', 'X', 'Y'}
                
        };
        char[] arrayLetras = new char [5];
        for (int i = 0; i < matrizLetras.length; i++) {
            for (int j = 0; j < matrizLetras[i].length; j++) {
                System.out.print(matrizLetras[i][j] + " ");                
            }
            System.out.println("");
        }
        System.out.println("");
         for (int i = 0; i < matrizLetras.length; i++) {
            for (int j = 0; j < matrizLetras[i].length; j++) {
                arrayLetras[i] += matrizLetras[matrizLetras.length -1 -i][matrizLetras.length -1 -j];                 
            }
            
        }
         for (int i = 0; i < arrayLetras.length; i++) {
             System.out.print(arrayLetras[i] + " ");
            
        }
        System.out.println("\n ");
        
        
    }
    
}
