/*
Por Antonio Gomez Pérez
 */
import java.util.Scanner;
public class Puebas {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int valor1;
        System.out.print("Introduce un valor: ");
        
        do{
            if(!teclado.hasNextInt() && (valor1 = teclado.nextInt()) >=10) {
                System.out.println("Error");
            }
             
        }while(teclado.hasNextInt() && (valor1 = teclado.nextInt()) >=0);
        
    }
    
}