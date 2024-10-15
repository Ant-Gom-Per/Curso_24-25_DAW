/*
En este programa usamos un semáforo
 */
import java.util.Scanner;

public class PoneNotaVer2 {

      public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);       
         
        System.out.print("Introduce tu nota (del 1 al 10):");
        int nota=0;
        boolean leido =false;
            
        if(teclado.hasNextInt()){
            nota = teclado.nextInt();          
            teclado.nextLine();
            leido = true;
        }
        if(leido && nota >= 0 && nota <= 10) {
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecta");
        }
    }
}