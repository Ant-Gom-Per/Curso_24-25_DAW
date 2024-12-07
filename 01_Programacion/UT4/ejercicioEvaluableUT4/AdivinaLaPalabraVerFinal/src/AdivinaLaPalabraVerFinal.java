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
        
        String ayuda=" ";        
        String[] resp3 = {"mamífero", "ave", "anfibio", "insecto", "reptil", "pez", "crustaceo", "miriápodo", "molusco", "aracnido"};
        String[] resp4 = {"cuatro", "dos", "cuatro", "seis", "cero", "cero", "ocho", "cuarenta y seis", "cero", "ocho"};
        boolean semaforo = true;
        menInicio();                                                 
        numIntentos();
        String palSecr = eligePalabra();
        System.out.print(palSecr);
        String palIntro = introPalabra();
        boolean victoria = palSecr.equals(palIntro); //compara palabras
        boolean palaIgual = tamPalabra(palSecr,palIntro); // compara cantidad de letras
        System.out.println("victoria: " + victoria);
        System.out.println("palaIgual: " + palaIgual);
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
     * @return Cantidad de intentos.
     */
    public int numIntentos(){
        int intentos=1, numeroIntentos =0;
        boolean semaforo = true;
        System.out.print("\nIntroduce un numero de intentos1: ");              
            while(semaforo == true){               
                if(teclado.hasNextInt() && (intentos = teclado.nextInt()) >0 && intentos <6){
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
    
    
    /**
     * Elige una palabra. Este metodo selecciona aleatoriamente una palabra de la array.
     * @return Devuelve una palabra aleatoria.
     */
    public String eligePalabra(){
        String[] palabrSecr = {"perro", "gaviota", "rana", "abeja", "serpiente", "atun", "cangrejo", "escolopendra", "almeja", "tarantula"};      
        int numAleat = (int)(Math.random()*10);
        String palSecr = palabrSecr[numAleat];                                               
        return palSecr;        
    }
    
    
    /**
     * Pide una palabra por teclado. Este método almacena una palabra introducida por teclado en una variable.
     * @return Palabra introducida por teclado en formato String.
     */
    public String introPalabra(){
        String palaIntrod=" ";
        System.out.print("\nIntroduce palabra: ");                     
        palaIntrod = teclado.next();                                             
        return palaIntrod;        
    }
    
    /**
     * Compara el tamaño de dos palabras. Indica si las dos palabras introducidas tienen la misma cantidad de letras.
     * @param cadena1
     * @param cadena2
     * @return True o false
     */
    public boolean tamPalabra(String cadena1, String cadena2){
        int tamanyo1 = cadena1.length();
        int tamanyo2 = cadena2.length();
        return tamanyo1 == tamanyo2;
    }
    
    
    
    
    
}
