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
        System.out.print(palSecr); // Muestra la palabra
        System.out.println("\nEl animal secreto tiene " + palSecr.length() + " letras.");
        String palIntro = introPalabra();
        boolean victoria = palSecr.equals(palIntro); //compara palabras
        boolean palaIgual = tamPalabra(palSecr,palIntro); // compara cantidad de letras
        if(victoria == true){
            System.out.println("Has acertado!!");
        }
        else{
            comPalabra(palSecr, palIntro);
        }
        System.out.println("\nvictoria: " + victoria);
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
        int intentos=1;        
        System.out.print("\nIntroduce un numero de intentos1: ");              
            while(!teclado.hasNextInt() || (intentos = teclado.nextInt()) < 0 || intentos > 5){                              
                    teclado.nextLine();                                                       
                    System.out.println("Error, dato no válido.");
                    System.out.print("\nIntroduce un numero de intentos2: ");                                                                   
            }
            teclado.nextLine();            
        return intentos;
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
    
    /**
     * Compara letra a letra. Muestra las letras que coinciden y las que no escribe una barra baja
     * @param palSecr Palabra elegida aleatoriamente de String[] palabrSecr.
     * @param palIntro Palabra introducida por el usuario.
     */
    public void comPalabra(String palSecr, String palIntro){
        if(palSecr.length() == palIntro.length()){
            for (int i = 0; i < palSecr.length(); i++) {
                if(palSecr.charAt(i) == (palIntro.charAt(i))){
                    System.out.print(palSecr.charAt(i) + " ");
                }
                else{
                    System.out.print("_ ");
                }            
            }  
        }
        else if(palSecr.length() > palIntro.length()){
            int difer = palSecr.length() - palIntro.length();
            if(difer == 1){
                System.out.println("Error!!, La palabra secreta ha de tener " + difer + " caracter más.");
            }
            else{
                System.out.println("Error!!, La palabra secreta ha de tener " + difer + " caracteres más.");
            }            
        }
        else{
            int difer = palIntro.length() - palSecr.length();
            if(difer == 1){
                System.out.println("Error!!, La palabra secreta ha de tener " + difer + " caracter menos.");
            }
            else{
                System.out.println("Error!!, La palabra secreta ha de tener " + difer + " caracteres menos.");
            }                        
        }
    }            

    
    
}
