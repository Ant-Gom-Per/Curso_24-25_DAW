/*
Por: Antonio Gómez Pérez
 */

import java.util.Scanner;
public class UT3Problema1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double [] arraySist = new double[10];
        double [] arrayDiast = new double[10];
        double datoSist=0,datoDiast=0, sisMaxima=0, diasMinima = 23, auxCompens=23, totSist=0, totDiast=0, promedioSist=0, promedioDiast=0;
        int contMed=0, opcion=0, indArray=0;
        boolean error = false;
        String claseTension = " ";
        
        
        System.out.println("TENSIÓN ARTERIAL");
        System.out.println("----------------\n");
        
        System.out.print("Introduce las medidas de tension: ");
        while(contMed < 10){
            if(!teclado.hasNextDouble()){
                error = true;
                teclado.next();                
            }           
            if((datoSist = teclado.nextDouble()) <3 || datoSist >22){
                if(datoSist == 0 && contMed >=2){
                    break;
                }
                error = true;
            }                        
            if(!teclado.hasNextDouble()){
                error = true;
                teclado.next();
            }                        
            if(!teclado.hasNextDouble()){
                error = true;
                teclado.next();                
            }
            if((datoDiast = teclado.nextDouble()) <3 || datoDiast >22){
                  if(datoSist == 0 && contMed >=2){
                      break;
                  }
                  error = true;
              }
            if(datoSist < datoDiast){
                error = true;
            }             
            if(error == false){                
                arraySist[contMed] = datoSist;
                arrayDiast[contMed] = datoDiast;
                contMed++;
            }         
        }            
                    
        System.out.println("\n1.- Sistólica máxima");
        System.out.println("2.- Diastólica mínima");
        System.out.println("3.- Más compensada");
        System.out.println("4.- Tensión Media");
        System.out.println("5.- Salir");
            
     
        while(opcion != 5){
            System.out.print("\nIntroduce la opcion deseada: ");
            while(!teclado.hasNextInt() || (opcion = teclado.nextInt()) <1 || opcion > 5){
                teclado.nextLine();
                System.out.println("Error, dato no válido.");
                System.out.print("Introduce la opcion deseada: ");
            }
            teclado.nextLine(); 
            
            switch(opcion){
                case 1:
                    for(int i=0 ; i < contMed ; i++){
                        if(arraySist[i] > sisMaxima){ 
                            sisMaxima = arraySist[i];
                            indArray = i;
                        }
                    }
                    System.out.print(sisMaxima + " " + arrayDiast[indArray]);   
                    break;
                    
                case 2:
                    for(int i=0 ; i < contMed ; i++){
                        if(arrayDiast[i] < diasMinima){ 
                            diasMinima = arrayDiast[i];
                            indArray = i;
                        }
                    }
                    System.out.print(arraySist[indArray] + " " + diasMinima);
                    break;
                    
                case 3:
                    for(int i =0; i < contMed ; i++){
                        if(Math.abs(arraySist[i] - (arrayDiast[i] *2)) < auxCompens){
                            auxCompens = Math.abs(arraySist[i] - (arrayDiast[i] *2));
                            indArray = i;
                        }
                    }
                    System.out.print(arraySist[indArray] + " " + arrayDiast[indArray]);
                    break;
                    
                case 4:
                    for(int i=0 ; i<contMed ; i++){
                        totSist += arraySist[i];
                    }
                    for(int i=0 ; i<contMed ; i++){
                        totDiast += arrayDiast[i];
                    }
                    promedioSist = totSist/contMed;
                    promedioDiast = totDiast/contMed;
                    System.out.printf("Dato de tension promedio: %.1f %.1f\n",promedioSist, promedioDiast);                    
                    break;
                    
                default:
                    System.out.println("Saliendo del programa...");                   
                    break;
            }
            
            if(opcion == 1 || opcion == 2 || opcion == 3){
                if (arraySist[indArray] < 12 && arrayDiast[indArray] < 8) {
                        claseTension = " Óptima";
                    } else if (arraySist[indArray] >= 12 && arraySist[indArray] < 13 && arrayDiast[indArray] >= 8 && arrayDiast[indArray] < 8.5) {
                        claseTension = " Normal";
                    } else if (arraySist[indArray] >= 13 && arraySist[indArray] < 14 && arrayDiast[indArray] >= 8.5 && arrayDiast[indArray] < 9) {
                        claseTension = " Normal - Alta";
                    } else if (arraySist[indArray] >= 14 && arraySist[indArray] < 16 && arrayDiast[indArray] >= 9 && arrayDiast[indArray] < 10) {
                        claseTension = " Grado 1";
                    } else if (arraySist[indArray] >= 16 && arraySist[indArray] < 18 && arrayDiast[indArray] >= 10 && arrayDiast[indArray] < 11) {
                        claseTension = " Grado 2";
                    } else if (arraySist[indArray] >= 18 && arrayDiast[indArray] >= 11) {
                        claseTension = " Grado 3";
                    } else if (arraySist[indArray] >= 14 && arrayDiast[indArray] < 9) {
                        claseTension = " Sistólica Aislada";
                    } else {
                        claseTension = " No contemplada";
                    }
                System.out.println(" " + claseTension);
            }              
        }        
        System.out.println("Fin del programa");
        teclado.close();
    }    
}