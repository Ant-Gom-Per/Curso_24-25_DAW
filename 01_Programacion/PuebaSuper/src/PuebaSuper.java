/*
Version de pruebas de tension arterial
 */
import java.util.Scanner;
public class PuebaSuper {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double [] arraySistolica = new double[10];
        double [] arrayDiastolica = new double[10];
        double datoTension=0, auxSistolica=0,auxDiastolica=0;
        int i=0,contMedidas=0, opcion;
        boolean semaforo = true, error = false;
        
        
        System.out.println("TENSIÓN ARTERIAL");
        System.out.println("----------------\n");
        
        System.out.print("Introduce las medidas de tension: ");
        while(contMedidas <= 10){
            if(!teclado.hasNextDouble()){
                error = true;
                teclado.next();                
            }
            if((datoTension = teclado.nextDouble()) == 0 && contMedidas >= 2){
                semaforo = false;                
            }
            if(datoTension <3 || datoTension >22){
                error = true;
            }
            auxSistolica = datoTension;
            System.out.println("**********auxSIS " + auxSistolica);
            
            if(!teclado.hasNextDouble()){
                teclado.next();
            }
            if((datoTension = teclado.nextDouble()) == 0 && contMedidas >= 2){
                semaforo = false;
            }
            if(datoTension <3 || datoTension >22 || auxSistolica < datoTension){
                error = true;
            }
            auxDiastolica = datoTension;
            System.out.println("*********auxDIA " + auxDiastolica);
            
            if(!error == true){
            arraySistolica[contMedidas] = auxSistolica;
            arrayDiastolica[contMedidas] = auxDiastolica;
            contMedidas++;
            System.out.println("*********contador" + contMedidas);
            }
            
            
               System.out.print("VAloresSIS: ");
                for(int j=0 ; j <  contMedidas; j++){
                    System.out.print( arraySistolica[j] + " ");        
                }
                System.out.println("");
                
                System.out.print("VAloresDIA: ");
                for(int j=0 ; j <  contMedidas; j++){
                    System.out.print( arrayDiastolica[j] + " ");        
                }
                System.out.println("");
            
        }
        ;
        
        
            
            
            
            //HASTA AQUÍ LA TOMA DE DATOS   
            
            System.out.println("1.- Sistólica máxima");
            System.out.println("2.- Diastólica mínima");
            System.out.println("3.- Más compensada");
            System.out.println("4.- Tensión Media");
            System.out.println("5.- Salir");
            
            semaforo = true;
            while(semaforo == true){
                System.out.print("Introduce la opcion deseada: ");
                while(!teclado.hasNextInt() || (opcion = teclado.nextInt()) <1 || opcion > 5){
                    teclado.nextLine();
                    System.out.println("Error, dato no válido.");
                    System.out.print("Introduce la opcion deseada: ");
                }
                teclado.nextLine();            
            
                switch(opcion){
                    case 1:
                        System.out.println("opcion1");
                        break;
                    case 2:
                        System.out.println("opcion2");
                        break;
                    case 3:
                        System.out.println("opcion3");
                        break;
                    case 4:
                        System.out.println("opcion4");
                        break;
                    default:
                        System.out.println("salir");
                        semaforo = false;
                        break;
                }

                //  HASTA AQUÍ LAS POSIBLES OPCIONES              
            }
            
        
        
        System.out.println("Fin del programa");
        teclado.close();
    }    
}
