/** *
 * @author Antonio Gómez Pérez
 * Este programa te pide que adivines una palabra.
 */
import java.util.Scanner;

public class AdivinaLaPalabraVer3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String palaIntrod, ayuda=" ";
        String[] palabrSecr = {"perro", "gaviota", "rana", "abeja", "serpiente", "atun", "cangrejo", "escolopendra", "almeja", "tarantula"};
        String[] resp3 = {"mamífero", "ave", "anfibio", "insecto", "reptil", "pez", "crustaceo", "miriápodo", "molusco", "aracnido"};
        String[] resp4 = {"cuatro", "dos", "cuatro", "seis", "cero", "cero", "ocho", "cuarenta y seis", "cero", "ocho"};
        
        
        boolean semaforo = true, resultado= false, victoria = false;
        int intentos=1, numeroIntentos =0, numeroPistas=0, puntuacion=0, continuar=0,partidas =0;;        
        int[] arrayPuntos = new int[10];
        
         while(semaforo == true){
            System.out.println("\n**************************");
            System.out.println("** ADIVINA **   /)_/)   **");
            System.out.println("**   EL    **  (^.^ )   **");
            System.out.println("** ANIMAL  **  (U U )o  **");
            System.out.println("** SECRETO **  (\")(\")   **");         
            System.out.println("**************************");
            System.out.println("**     COMO JUGAR       **");
            System.out.println("****************************************************************************************");
            System.out.println("** 1.- Para empezar a jugar debes decidir el número de intentos. (máximo 6)           **");
            System.out.println("** 2.- Una vez gastados los intentos pierdes si no has adivinado el ANIMAL SECRETO.   **");
            System.out.println("** 3.- Contra menos intentos elijas, mayor será tu puntuación.                        **");
            System.out.println("** 4.- Para salir del juego pulsa 0 en el número de intentos.                         **");
            System.out.println("****************************************************************************************");
        
       
            System.out.print("\nIntroduce un numero de intentos: ");              
            while(semaforo == true){               
                if(teclado.hasNextInt() && (intentos = teclado.nextInt()) >=0 && intentos <6){
                    teclado.nextLine();
                    numeroIntentos = intentos;                    
                    semaforo = false;
                }else{
                    teclado.nextLine();
                    System.out.println("Error, dato no válido.");
                    System.out.print("\nIntroduce un numero de intentos: ");                                    
                }
            }
            
            if(numeroIntentos == 0){
                semaforo = true;
            }
            int numAleat = (int)(Math.random()*10);
            while(semaforo == false){            
                
                int cantLetras = palabrSecr[numAleat].length();                 
                char[] letrasPalSecr = new char[cantLetras];                    
                for (int i = 0; i < palabrSecr[numAleat].length(); i++) {      
                     letrasPalSecr[i] += palabrSecr[numAleat].charAt(i);                  
                }                                                               
                System.out.println(" ");                                      
                                
                resultado=false;
                System.out.print("El animal secreto es: ");                
                for (int i = 0; i < cantLetras; i++) {
                    System.out.print("_ ");
                }
                
                System.out.print("\nIntroduce palabra: ");                     
                palaIntrod = teclado.next();                                    
                int cantLetras2 = palaIntrod.length();                         
                char[] letrasPalIntrod = new char[cantLetras2];                
                for (int i = 0; i < palaIntrod.length(); i++) {               
                     letrasPalIntrod[i] += palaIntrod.charAt(i);                       
                }                                                             
                System.out.println("");                                 


                if(!palabrSecr[numAleat].equals(palaIntrod)){
                    if(cantLetras == cantLetras2){                                                
                        System.out.print("Has acertado las letras: ");
                        for (int i = 0; i < palabrSecr[numAleat].length(); i++) {                 
                            if(letrasPalSecr[i] == (letrasPalIntrod[i])){                         
                                System.out.print(palabrSecr[numAleat].charAt(i) + " ");           
                            }else{                                                                 
                                System.out.print("_ ");                                         
                            }                                                                   
                        }
                    }else{
                        System.out.println("Lo siento, no tiene la misma cantidad letras");
                    }
                }else{            
                    resultado = true;
                }
                
                if(resultado == false){
                    System.out.println("\n\nError, ese no es el animal secreto.\n");
                }           
                if(resultado == true){
                    System.out.println("Acertaste!!");
                    semaforo = true;
                    victoria = true;
                }else{
                    if(numeroIntentos -1 == numeroPistas){
                        System.out.println("Lo siento no hay más intentos.");
                        semaforo = true;
                    }else{
                    numeroPistas++;
                    switch(numeroPistas){
                        case 1:
                            if(numAleat == 0 || numAleat == 2 || numAleat == 7 || numAleat == 9 || numAleat == 4){
                                ayuda = "de tipo terreste";
                            }else if(numAleat == 5 || numAleat == 6 || numAleat == 8){
                                ayuda = "de tipo marino";                                
                            }else{
                                ayuda = "de tipo volador";
                            }                            
                            break;
                        case 2:
                            if(numAleat == 8 || numAleat == 7 || numAleat == 6 || numAleat == 9 || numAleat == 3){
                                ayuda = "invertebrado";
                            }else{
                                ayuda = "vertebrado";                                
                            }                            
                            break;
                        case 3:
                            ayuda = "del tipo " + resp3[numAleat];
                            break;                        
                        default:
                            ayuda = "con "+  resp4[numAleat] + " patas";                 
                    }                
                    System.out.println("Pista numero " + numeroPistas + ": Es un animal " + ayuda);
                    }                
                }          
            }
            
            if(victoria == true){                 
                puntuacion = (12 - (intentos+numeroPistas))*(numAleat+1 * 100);       
                if(puntuacion > 1000){
                    System.out.println("\n******************");
                    System.out.println("**   PERFECTO   **");
                    System.out.println("******************");            
                }else{        
                    System.out.println("\n**********************");
                    System.out.println("**  Puntuacion " + puntuacion + "  **");
                    System.out.println("**********************");
                }
            }else{
                System.out.println("\n********************");
                System.out.println("**  Puntuacion 0  **");
                System.out.println("********************");
            }  
            arrayPuntos[partidas] = puntuacion;
            
             for (int i = 0; i <= partidas; i++) {
                 System.out.println("Puntuacion " + (i+1) + " :" + arrayPuntos[i]);
             }
            partidas++;
            if(partidas == 10){
                semaforo = false;
            }else{
             
                System.out.print("\n¿Quieres volver a jugar? te queda " + (10-partidas) + " partidas. (0 = No, 1 = Si) :");        
                while(!teclado.hasNextInt() || (continuar = teclado.nextInt()) < 0 || continuar > 1){
                    teclado.nextLine();
                    System.out.println("Error dato no válido.");
                    System.out.println("\n¿Quieres volver a jugar? (No = 0, Si = 1 :");
                }
            }
            
            if(continuar == 0){
                semaforo = false;            

            }            
            numeroPistas = 0;
            victoria = false;
            
       }       
        
        System.out.println("\n*********************");
        System.out.println("**  Fin del juego  **");
        System.out.println("*********************");
        
        
        
        
        teclado.close();
    }    
}
