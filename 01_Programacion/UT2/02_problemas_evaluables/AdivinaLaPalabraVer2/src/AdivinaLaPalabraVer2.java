/** *
 * @author Antonio Gómez Pérez
 * Este programa te pide que adivines una palabra.
 */
import java.util.Scanner;

public class AdivinaLaPalabraVer2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String palabra, ayuda="";
        String palabraSecreta = "murcielago";
        boolean semaforo = true, resultado= false, victoria = false;
        int intentos=1, numeroIntentos =0, numeroPistas=0, puntuacion=0, continuar=0;
        
         while(semaforo == true){
            System.out.println("\n**************************");
            System.out.println("** ADIVINA **   /)_/)   **");
            System.out.println("**   LA    **  (^.^ )   **");
            System.out.println("** PALABRA **  (U U )o  **");
            System.out.println("** SECRETA **  (\")(\")   **");         
            System.out.println("**************************");
            System.out.println("**     COMO JUGAR       **");
            System.out.println("****************************************************************************************");
            System.out.println("** 1.- Para empezar a jugar debes decidir el número de intentos. (máximo 6)           **");
            System.out.println("** 2.- Una vez gastados los intentos pierdes si no has adivinado la PALABRA SECRETA.  **");
            System.out.println("** 3.- Contra menos intentos elijas, mayor será tu puntuación.                        **");
            System.out.println("** 4.- Para salir del juego pulsa 0 en el número de intentos.                         **");
            System.out.println("****************************************************************************************");
        
       
            System.out.print("\nIntroduce un numero de intentos: ");              
            while(semaforo == true){               
                if(teclado.hasNextInt() && (intentos = teclado.nextInt()) >=0 && intentos <=6){
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

            while(semaforo == false){            
                System.out.print("Adivina la palabra secreta: ");
                palabra = teclado.nextLine();        
                resultado = palabra.equals(palabraSecreta);
                if(resultado == false){
                    System.out.println("Error, esa no es la palabra secreta.\n");
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
                            ayuda = "Es un animal.";
                            break;
                        case 2:
                            ayuda = "Las letras de su nombre son todas diferentes.";
                            break;
                        case 3:
                            ayuda = "Es mamífero.";
                            break;
                        case 4:
                            ayuda = "Su nombre tiene 5 letras.";
                            break;
                        default:
                            ayuda = "Puede volar.";                    
                    }                
                    System.out.println("Pista numero " + numeroPistas + ": " + ayuda);
                    }                
                }          
            }
            
            if(victoria == true){                 
                puntuacion = (12 - (intentos+numeroPistas))*100;        
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

            System.out.print("¿Quieres volver a jugar? (0 = No, 1 = Si) :");        
            while(!teclado.hasNextInt() || (continuar = teclado.nextInt()) < 0 || continuar > 1){
                teclado.nextLine();
                System.out.println("Error dato no válido.");
                System.out.println("¿Quieres volver a jugar? (No = 0, Si = 1 :");
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