/*
Ejercicio3_3_ej5
 */
import java.util.Scanner;
public class Ejercicios3_3_ej5 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][] divisiones = new int[0][4];
        int[][] aux;
        int dividendo;
        
        System.out.println("Introduce las divisiones: ");
        do {
            aux = divisiones;          
            dividendo = teclado.nextInt();
            if(dividendo != -1){
                divisiones =new int[aux.length +1][4];
                for (int i = 0; i < aux.length; i++) {
                    for (int j = 0; j < aux[i].length; j++) {
                        divisiones[i] = aux[i];
                    }                    
                }
                divisiones[aux.length][0] = dividendo;
                divisiones[aux.length][1] = teclado.nextInt();
                divisiones[aux.length][2] = teclado.nextInt();
                divisiones[aux.length][3] = teclado.nextInt();
            } 
        } while (dividendo != -1);
        
        
        for (int i = 0; i < divisiones.length; i++) {
            System.out.println();
            
        }
        
        
        teclado.close();
    }
    
}
