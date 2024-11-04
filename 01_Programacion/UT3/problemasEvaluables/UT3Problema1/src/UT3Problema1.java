/*
Por: Antonio Gómez Pérez
 */

import java.util.Scanner;
public class UT3Problema1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double [] arraySistolica = new double[10];
        double [] arrayDiastolica = new double[10];
        double datoTension=0, auxSistolica=0,auxDiastolica=0, sisMaxima=0, sisMinima = 23;
        int contMedidas=0, opcion;
        boolean semaforo = true, error = false;
        
        
        System.out.println("TENSIÓN ARTERIAL");
        System.out.println("----------------\n");
        
        System.out.print("Introduce las medidas de tension: ");
        while(semaforo == true){
            if(!teclado.hasNextDouble()){
                error = true;
                teclado.next();                
            }
            if((auxSistolica = teclado.nextDouble()) == 0 && contMedidas >= 1){
                semaforo = false;
                error = true;
            }
            if(datoTension <3 || datoTension >22){
                error = true;
            }                        
            if(!teclado.hasNextDouble()){
                error = true;
                teclado.next();
            }
            if((auxDiastolica = teclado.nextDouble()) == 0 && contMedidas >= 1){
                semaforo = false;
                error = true;
            }
            if(datoTension <3 || datoTension >22 || auxSistolica < auxDiastolica){
                error = true;
            }
         
            System.out.println("*********auxSIS " + auxSistolica);
            System.out.println("*********auxDIA " + auxDiastolica);
            
            if(error == true){
                
                arraySistolica[contMedidas] = auxSistolica;
                arrayDiastolica[contMedidas] = auxDiastolica;
           
                System.out.println("*********contador" + contMedidas);
            
            
            
               System.out.print("VAloresSIS: ");
                for(int j=0 ; j <=  contMedidas; j++){
                    System.out.print( arraySistolica[j] + " ");        
                }
                System.out.println("");
                
                System.out.print("VAloresDIA: ");
                for(int j=0 ; j <=  contMedidas; j++){
                    System.out.print( arrayDiastolica[j] + " ");        
                }
                System.out.println("");
            }
            contMedidas++;
            if(contMedidas == 2){
                semaforo = false;
            }            
        }
        
        
        
        
            
            
            
            //HASTA AQUÍ LA TOMA DE DATOS   
            
        System.out.println("\n1.- Sistólica máxima");
        System.out.println("2.- Diastólica mínima");
        System.out.println("3.- Más compensada");
        System.out.println("4.- Tensión Media");
        System.out.println("5.- Salir");
            
        semaforo = true;
        while(semaforo == true){
            System.out.print("\nIntroduce la opcion deseada: ");
            while(!teclado.hasNextInt() || (opcion = teclado.nextInt()) <1 || opcion > 5){
                teclado.nextLine();
                System.out.println("Error, dato no válido.");
                System.out.print("Introduce la opcion deseada: ");
            }
            teclado.nextLine();            
            
            switch(opcion){
                case 1:
                    for(int i=0 ; i < contMedidas ; i++){
                        if(sisMaxima < arraySistolica[i]){ 
                        sisMaxima = arraySistolica[i];            
                        }
                    }
                    if(sisMaxima < 12){
                        System.out.printf("%.1f Óptima\n", sisMaxima);
                    }else if(sisMaxima >= 12 && sisMaxima <12.9){
                        System.out.printf("%.1f Normal\n", sisMaxima);
                    }else if(sisMaxima >= 13 && sisMaxima <13.9){
                        System.out.printf("%.1f Normal-Alta\n", sisMaxima);
                    }else if(sisMaxima >= 14 && sisMaxima <15.9){
                        System.out.printf("%.1f Grado 1\n", sisMaxima);
                    }else if(sisMaxima >= 16 && sisMaxima <17.9){
                        System.out.printf("%.1f Grado 2\n", sisMaxima);
                    }else{
                        System.out.printf("%.1f Grado 3\n", sisMaxima);
                    }                        
                    break;
                case 2:
                    for(int i=0 ; i < contMedidas ; i++){
                        if(sisMinima > arrayDiastolica[i]){ 
                        sisMinima = arrayDiastolica[i];            
                        }
                    }
                    if(sisMinima < 8){
                        System.out.printf("%.1f Óptima\n", sisMinima);
                    }else if(sisMinima >= 8 && sisMinima <8.4){
                        System.out.printf("%.1f Normal\n", sisMinima);
                    }else if(sisMinima >= 8.5 && sisMinima <8.9){
                        System.out.printf("%.1f Normal-Alta\n", sisMinima);
                    }else if(sisMinima >= 9 && sisMinima <9.9){
                        System.out.printf("%.1f Grado 1\n", sisMinima);
                    }else if(sisMinima >= 10 && sisMinima <10.9){
                        System.out.printf("%.1f Grado 2\n", sisMinima);
                    }else{
                        System.out.printf("%.1f Grado 3\n", sisMinima);
                    }
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