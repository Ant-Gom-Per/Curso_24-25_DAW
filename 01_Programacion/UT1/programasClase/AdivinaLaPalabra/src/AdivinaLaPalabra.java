/** *
 * @author Antonio Gómez Pérez
 * Este programa te pide que adivines una palabra.
 */
import java.util.Scanner;

public class AdivinaLaPalabra {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String palabraSecreta = "murcielago";
        
        System.out.print("Adivina la palabra secreta: ");
        String palabra = teclado.nextLine();
        
        System.out.println(palabra.equals(palabraSecreta));
        
    }
    
}
