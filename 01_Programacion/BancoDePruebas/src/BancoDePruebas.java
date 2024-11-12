/*
Banco de pruebas para desarrollar programas
 */

import java.util.Scanner;
public class BancoDePruebas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][] cantDivis = new int [0][4];
        int[][] aux;
        int dividendo=0;
        
        System.out.print("Introduce las divisiones (-1 para terminar): ");
        while(dividendo != -1){
           aux = cantDivis;
           dividendo = teclado.nextInt();
           
                       
        }
       
        
        
        System.out.println("--------------------------------------------------");
        System.out.println("dividendo: " + dividendo);
        teclado.close();
    }
    
}
