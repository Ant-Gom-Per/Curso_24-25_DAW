/*
Ejercicios3_3 ejercicio nº 4 comprueba si una matriz es simetrica
 */
import java.util.Scanner;
public class Ejercicios3_3_4 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean simetrica = true;
        int longitud;
        System.out.print("Introduce la longitud de la matriz: ");
        while(!teclado.hasNextInt() || (longitud = teclado.nextInt()) < 1){
            teclado.nextLine();
            System.out.println("Error, dato no válido: ");
            System.out.print("Introduce los valores de la matríz: ");
        }
        teclado.nextLine();
        
        System.out.println("Introduce los valores de la matriz: ");
        int[][] matriz = new int [longitud][longitud];
        for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = teclado.nextInt();                
            }            
        }
        for (int i = 0; simetrica &&  i < matriz.length; i++) {
            for (int j = 0; simetrica && j < i; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                }                
            }            
        }
        System.out.println("simetrica: " + simetrica);
        
        
        System.out.println("---------------------------------------------");
        System.out.println("longitud: " + longitud);
        System.out.println("tamaño matriz: " + matriz.length);
        System.out.println("datos a introducir: " + (longitud * longitud));
        
        teclado.close();
    }
    
}
