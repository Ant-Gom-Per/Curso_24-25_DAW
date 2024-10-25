/*
Version de pruebas de AdivinaLaPalabraVer2
 */
import java.util.Scanner;
public class Puebas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int valor1=0;      
        while(valor1 >=0){
            System.out.print("di valor1 (negativo para salir) ");
            while(!teclado.hasNextInt() || (valor1 = teclado.nextInt()) ==0){
                teclado.nextLine();
                System.out.println("Error.");
                System.out.print("di valor2 (negativo para salir) ");                
            }
            teclado.nextLine();
        }        
        System.out.println("KAKAPÚ");        
        teclado.close();
    }    
}



// "hola".charAt()
