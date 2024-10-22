/** *
 * @author Antonio Gómez Pérez
 * Este programa te pide que adivines una palabra.
 */
import java.util.Scanner;

public class AdivinaLaPalabraVer2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String palabraSecreta = "conejo";
        int intentos;
        
        System.out.println("**************************");
        System.out.println("** ADIVINA **   /)_/)   **");
        System.out.println("**   LA    **  (^.^ )   **");
        System.out.println("** PALABRA **  (U U )o  **");
        System.out.println("** SECRETA **  (\")(\")   **");         
        System.out.println("**************************");
        System.out.println("**     COMO JUGAR       **");
        System.out.println("***************************************************************************************");
        System.out.println("** 1.- Para empezar a jugar has de decidir el número de intentos que vas a tener.    **");
        System.out.println("** 2.- Una vez gastados los intentos pierdes si no has adivinado la PALABRA SECRETA. **");
        System.out.println("** 3.- Contra menos intentos elijas, mayor será tu puntuación.                       **");
        System.out.println("** 4.- Para salir del juego pulsa 0 en el número de intentos.                        **");
        System.out.println("***************************************************************************************");
        
        
        System.out.print("Piensa en una palabra y escribela: ");
        String palabra = teclado.nextLine();
        
        System.out.println(palabra.equals(palabraSecreta));
        
    }
    
}