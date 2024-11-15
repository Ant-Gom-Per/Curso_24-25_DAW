/*
Por: Antonio Gómez Pérez
 */

public class E1Java {

    public static void main(String[] args) {
        int[][] matrizNum = {
            {8, 1, 0, 2},
            {9, 0, 5, 8},
            {1, 3, 2, 3},
            {3, 4, 0, 8}
        };
        
        int[][] matrizFinal = new int[4][4];
        
        for (int i = 0; i < matrizNum.length; i++) {
            for (int j = 0; j < matrizNum[i].length; j++) {
                matrizFinal[i][j] += matrizNum[i][matrizNum.length -1 -j];
                
            }
            
        }
        for (int i = 0; i < matrizFinal.length; i++) {
            for (int j = 0; j < matrizFinal[i].length; j++) {
                System.out.print(matrizFinal[i][j] + " ");
            }
            System.out.println("");
            
        }
        
    }
    
}
