/*
Banco de pruebas para desarrollar programas
 */

import java.util.Scanner;
public class BancoDePruebas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        
        int valor1 = 0, valor2 =0;
        valor1 =(int)( Math.random() * 1 +3);
        int[][] matrizReales = new int[valor1][valor1];
        int[][] matrizReales2 = new int[valor1][valor1];
        int[][] matrizReales3 = new int[valor1][valor1];
        
        
        for (int i = 0; i < matrizReales.length; i++) {
            for (int j = 0; j < matrizReales[i].length; j++) {                
                matrizReales[i][j] += valor2 =(int)( Math.random() * 10);
                System.out.print(matrizReales[i][j] + "\t"); 
            }
            System.out.println(" ");
        }
        
        System.out.println("\n");
        for (int i = 0; i < matrizReales2.length; i++) {
            for (int j = 0; j < matrizReales2[i].length; j++) {                
                matrizReales2[i][j] += valor2 =(int)( Math.random() * 10);
                System.out.print(matrizReales2[i][j] + "\t"); 
            }
            System.out.println(" ");
        }
        
        System.out.println("\n");
        for (int i = 0; i < matrizReales3.length; i++) {
            for (int j = 0; j < matrizReales3[i].length; j++) {            
                matrizReales3[i][j] += (matrizReales[i][j] + matrizReales2[i][j]);
                System.out.print(matrizReales3[i][j] + "\t"); 
            }
            System.out.println(" ");
        }
        
        System.out.println("--------------------------------------------------");
        System.out.println("valor1:" + valor1);
        teclado.close();
    }
    
}
