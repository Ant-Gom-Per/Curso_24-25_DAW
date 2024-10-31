/*
Por: Antonio Gómez Pérez
 */

import java.util.Scanner;
public class UT3Problema1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double [] arrayDatosTension = new double[20];
        double datoTension=0;
        int i=0, opcion;
        boolean semaforo = true;
        
        System.out.println("TENSIÓN ARTERIAL");
        System.out.println("----------------");

        
        System.out.print("Introduce los datos obtenidos: ");
            while((datoTension=teclado.nextDouble()) !=0){
                while(i < arrayDatosTension.length-1){
                    if(!teclado.hasNextDouble()){
                        teclado.next();
                    }else if(datoTension >=3 && datoTension <=22){
                        arrayDatosTension [i] += datoTension;
                        i++;
                    }
                }
                teclado.nextLine();
            }
            teclado.nextLine();
            
            
             System.out.print("VAlores: ");
                for(int j=0 ; j < arrayDatosTension.length ; j++){
                    System.out.print(arrayDatosTension[j] + " ");        
                }
                System.out.println("");
            
            
            
            //HASTA AQUÍ LA TOMA DE DATOS   
            
            System.out.println("1.- Sistólica máxima");
            System.out.println("2.- Diastólica mínima");
            System.out.println("3.- Más compensada");
            System.out.println("4.- Tensión Media");
            System.out.println("5.- Salir");
            
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