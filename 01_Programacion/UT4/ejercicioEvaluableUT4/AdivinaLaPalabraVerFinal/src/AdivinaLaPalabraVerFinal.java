/**
 * Adivina la Palabra. Este programa es una version del juego del ahorcado, el cual incluye una serie
 * de pistas que nos hace más sencillo el encontrar la palabla que el programa
 * selecciona aleatoriamente.
 *
 * @autor   Antonio Gómez Pérez
 * @curso   1ºDAW
 * @versión V4_final
 */
import java.util.Scanner;
public class AdivinaLaPalabraVerFinal {

    /**     
     * @param args Los argumentos de linea de comandos no son empleados.
     */
    Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        AdivinaLaPalabraVerFinal programa = new AdivinaLaPalabraVerFinal();
        programa.inicio();
    }
    
    /**
     * Metodo principal de ejecicion del juego. En este clase se colocan los métodos que vamos creando para que se ejecuten
     * en el orden que tengamos establecido.
     */
    public void inicio(){
        menuPrinc();
    }
    /**
     * Menú principal. Este es el menú de presentación del juego, ofrece las opciones disponibles.
     */
    public void menuPrinc(){      
            System.out.println("\n**************************");
            System.out.println("** ADIVINA **   /)_/)   **");
            System.out.println("**   EL    **  (^.^ )   **");
            System.out.println("** ANIMAL  **  (U U )o  **");
            System.out.println("** SECRETO **  (\")(\")   **");         
            System.out.println("**************************");
            System.out.println("**     COMO JUGAR       **");
            System.out.println("****************************************************************************************");
            System.out.println("** 1.- Para empezar a jugar debes decidir el número de intentos. (máximo 5)           **");
            System.out.println("** 2.- Una vez gastados los intentos pierdes si no has adivinado el ANIMAL SECRETO.   **");
            System.out.println("** 3.- Contra menos intentos elijas, mayor será tu puntuación.                        **");
            System.out.println("** 4.- Para salir del juego pulsa 0 en el número de intentos.                         **");
            System.out.println("****************************************************************************************"); 
    }
    
}
