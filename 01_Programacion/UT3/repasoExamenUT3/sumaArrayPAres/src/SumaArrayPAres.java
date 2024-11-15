/*
ejercicio repaso clase
 */

public class SumaArrayPAres {

    public static void main(String[] args) {
        int suma=0;
        int[][] matriz = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 0},
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 0}
        };
                
        /*
          for (int i = 0; i < matriz.length; i++) {
            for (int j = 1; j < matriz[i].length; j+=2) {
                suma += matriz[i][j];            
            }            
          }//Suma columnas impares
        */
        /*
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j+=2) {
                suma += matriz[i][j];            
            }            
        }//Suma columnas pares
        */
        /*
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(i%2 == 0){
                suma += matriz[i][j];
                }
            }            
          }//Suma columnas pares
        */
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(i%2 == 1){
                suma += matriz[i][j];
                }
            }            
          }//Suma columnas impares
        System.out.println("SUma " + suma);
        
    }    
}
