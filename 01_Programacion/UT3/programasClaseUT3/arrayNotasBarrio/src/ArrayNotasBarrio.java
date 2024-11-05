/*
Ejercico 3.9
 */

import java.util.Scanner;
public class ArrayNotasBarrio {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String[] nombres = {"Espinete", "Don Pimpon", "Gustavo", "Triki"};
        double media=0,maxima=0;
        double[][] medYMax = new double[4][2];
        double[][] arrayBarrio = {
            {6.0, 7.2, 2.3, 5.8, 3.4},
            {7.8, 1.6, 4.6, 9.4, 3.1},
            {3.6, 1.4, 8.9, 3.5, 6.5},
            {2.5, 3, 10, 2.4, 8.9}
        };
                
        
        for (int i = 0; i < arrayBarrio.length; i++) {
            for (int j = 0; j < arrayBarrio[i].length; j++) {
                media += arrayBarrio[i][j];
                if(arrayBarrio[i][j] >= maxima){
                    maxima=arrayBarrio[i][j];
                }
            }
            medYMax[i][0] = media / arrayBarrio[i].length;
            medYMax[i][1] = maxima;
            
        }
    }
    
}
