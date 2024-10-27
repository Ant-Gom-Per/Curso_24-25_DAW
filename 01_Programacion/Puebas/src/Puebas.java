/*
Version de pruebas de AdivinaLaPalabraVer2
 */
import java.util.Scanner;
public class Puebas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String palabra, ayuda="";
        String palabraSecreta = "murcielago";
        boolean semaforo = true, resultado= false, victoria = false;
        int intentos=1, numeroIntentos =0, numeroPistas=0, puntuacion, continuar=0;
        
       while(semaforo == true){
            System.out.print("Introduce un numero de intentos: ");              
            while(semaforo == true){            
                if(teclado.hasNextInt() && (intentos = teclado.nextInt()) >0 && intentos <=6 || intentos == 0){
                    numeroIntentos = intentos;
                    teclado.nextLine();
                    semaforo = false;
                }else{           
                    System.out.println("Error");
                    System.out.print("Introduce un numero de intentos: ");
                    teclado.nextLine();                
                }
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
                            ayuda = "Su nombre tiene 5 letras.";
                            break;
                        case 3:
                            ayuda = "Es mamífero.";
                            break;
                        case 4:
                            ayuda = "Las letras de su nombre son diferentes.";
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
                System.out.println("¿Quieres volver a jugar? (0 = No, 1 = Si :");
            }
            if(continuar == 0){
                semaforo = false;

            }
            numeroPistas = 0;
       }       
        
        System.out.println("\n*********************");
        System.out.println("**  Fin del juego  **");
        System.out.println("*********************");
       
        teclado.close();
    }    
}
