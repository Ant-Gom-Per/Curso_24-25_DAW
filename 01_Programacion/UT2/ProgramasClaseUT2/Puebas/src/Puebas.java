/*
Version de pruebas de AdivinaLaPalabraVer2
 */
import java.util.Scanner;
public class Puebas {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        String palabraSecreta = "murcielago";
        int intentos =1;
        
        
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
        
        while (intentos > 0){
            System.out.print("¿Cuantos intentos quieres tener?: ");
            while(teclado.hasNextInt() && (intentos = teclado.nextInt()) > 0 && intentos <=10){
                teclado.nextLine();                
                System.out.println("numero intentos2 " + intentos);
                System.out.print("¿Cuantos intentos quieres tener3?: ");       
                teclado.nextLine();
            }         
        }
        
        
        
        
        
        
        
        
        
        System.out.print("Piensa en una palabra y escribela: ");
              
    }
    
}