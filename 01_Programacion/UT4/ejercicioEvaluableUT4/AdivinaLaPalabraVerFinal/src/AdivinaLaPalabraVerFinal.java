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
        
        String palaIntrod, ayuda=" ";
        String[] palabrSecr = {"perro", "gaviota", "rana", "abeja", "serpiente", "atun", "cangrejo", "escolopendra", "almeja", "tarantula"};
        String[] resp3 = {"mamífero", "ave", "anfibio", "insecto", "reptil", "pez", "crustaceo", "miriápodo", "molusco", "aracnido"};
        String[] resp4 = {"cuatro", "dos", "cuatro", "seis", "cero", "cero", "ocho", "cuarenta y seis", "cero", "ocho"};
        boolean semaforo = true;
        while(semaforo == true){
            menInicio();
            int intentos = numIntentos();
            System.out.println("intentos: " + intentos);
            if(intentos == 0) semaforo = false;
            System.out.println("semaforo: " +semaforo);
            while(semaforo == false){
                
            }
            
        }        
    }
    /**
     * Menú principal. Este es el menú de presentación del juego, ofrece las opciones disponibles.
     */
    public void menInicio(){
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
    
    /**
     * Pide número de intentos. Con un máximo y un minimo. El 0 finaliza de la partida
     * @return 
     */
    public int numIntentos(){
        int intentos=1, numeroIntentos =0;
        boolean semaforo = true;
        System.out.print("\nIntroduce un numero de intentos1: ");              
            while(semaforo == true){               
                if(teclado.hasNextInt() && (intentos = teclado.nextInt()) >=0 && intentos <6){
                    teclado.nextLine();
                    numeroIntentos = intentos;                    
                    semaforo = false;
                    
                }else{
                    teclado.nextLine();
                    System.out.println("Error, dato no válido.");
                    System.out.print("\nIntroduce un numero de intentos2: ");                                    
                }
            }
        return numeroIntentos;
    }
    
    public char[] creaPalabra(){
        String[] palabrSecr = {"perro", "gaviota", "rana", "abeja", "serpiente", "atun", "cangrejo", "escolopendra", "almeja", "tarantula"};      
        int numAleat = (int)(Math.random()*10);                        
        int cantLetras = palabrSecr[numAleat].length();                          //
        char[] letrasPalSecr = new char[cantLetras];                             //Crea una array con las letras de la palabra
        for (int i = 0; i < palabrSecr[numAleat].length(); i++) {                //
            letrasPalSecr[i] += palabrSecr[numAleat].charAt(i);                          
        }                                                               
        System.out.println(" ");
        return letrasPalSecr[];
    }
}
