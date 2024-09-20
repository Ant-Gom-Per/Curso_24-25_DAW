/*
plate
 */
import java.util.Scanner;
public class CifraUnidad {

     public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       
       int valor1, valor2;
         System.out.print("Introduce un número: ");
         valor1 = teclado.nextInt();
         teclado.nextLine();
         valor2 = valor1%10;         
         System.out.println("Las unidad de " +  valor1 + " es " + valor2);
         System.out.println(" ");
         System.out.println("Las unidad de " +  valor1 + " es " + (valor1%10));      // Manera alternativa
    }
    
}
