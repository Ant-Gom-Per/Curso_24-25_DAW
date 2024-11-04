/*
Version de pruebas de tension arterial
 */
import java.util.Scanner;
public class PuebaSuper {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int opcion1=0, opcion2=0,numBusc=0, clave, j, valorMinimoActual, indiceValorMinimoActual, aux;
        boolean semaforo = true, encontrado;
        long tiempoInicial, tiempoFinal, tiempoEjecucion;

            System.out.print("Introduce la opcion deseada: ");
                while(!teclado.hasNextInt() || (opcion2 = teclado.nextInt()) <1 || opcion2 > 4){
                teclado.nextLine();
                System.out.println("Error, dato no válido.");
                System.out.print("Introduce la opcion deseada: ");
                }            
            switch(opcion2){
                case 1:
                    System.out.println("\n\nIntercambio directo");
                    System.out.println("---------------\n");
                    System.out.println("1.- Crear array de 100 elementos");
                    System.out.println("2.- Crear array de 1000 elementos");
                    System.out.println("3.- Crear array de 10000 elementos");
                    System.out.println("4.- Crear array de 100000 elementos\n");
                    
                    System.out.print("Introduce la opcion deseada: ");
                    while(!teclado.hasNextInt() || (opcion2 = teclado.nextInt()) <1 || opcion2 > 4){
                        teclado.nextLine();
                        System.out.println("Error, dato no válido.");
                        System.out.print("Introduce la opcion deseada: ");
                    }
                    teclado.nextLine();
                    switch(opcion2){
                        case 1:
                            
                            int [] tamanyoArray1 = new int[100];
                            for(int i=0 ; i < 100 ; i++){
                                int aleatorio = (int)(Math.random()*100);
                                tamanyoArray1[i] = aleatorio;
                            }
                            
                            tiempoInicial = System.currentTimeMillis(); //Inicio cuenta
                            
                            for(int i = 1 ; i < tamanyoArray1.length ; i++){
                                for(j = 0 ; j < tamanyoArray1.length -1 ; j++){
                                    if(tamanyoArray1[j] > tamanyoArray1[j+1]){
                                        aux = tamanyoArray1[j];
                                        tamanyoArray1[j] = tamanyoArray1[j+1];
                                        tamanyoArray1[j+1] = aux;
                                    }
                                }
                            }                    
                            
                            
                            tiempoFinal = System.currentTimeMillis(); //Fin cuenta
                            
                            tiempoEjecucion = tiempoFinal - tiempoInicial;
                            System.out.println("Tiempo de ejecucion: " + tiempoEjecucion + " ms");                            
                            break;
                            
                        case 2:
                            
                            int [] tamanyoArray2 = new int[1000];
                            for(int i=0 ; i < 1000 ; i++){
                                int aleatorio = (int)(Math.random()*1000);
                                tamanyoArray2[i] = aleatorio;
                            }
                            
                            tiempoInicial = System.currentTimeMillis();
                            
                            for(int i = 1 ; i < tamanyoArray2.length ; i++){
                                for(j = 0 ; j < tamanyoArray2.length -1 ; j++){
                                    if(tamanyoArray2[j] > tamanyoArray2[j+1]){
                                        aux = tamanyoArray2[j];
                                        tamanyoArray2[j] = tamanyoArray2[j+1];
                                        tamanyoArray2[j+1] = aux;
                                    }
                                }
                            }                           
                            tiempoFinal = System.currentTimeMillis();
                            
                            tiempoEjecucion = tiempoFinal - tiempoInicial;
                            System.out.println("Tiempo de ejecucion: " + tiempoEjecucion + " ms");                                         
                            break;
                            
                        case 3:
                            
                            int [] tamanyoArray3 = new int[10000];
                            for(int i=0 ; i < 10000 ; i++){
                                int aleatorio = (int)(Math.random()*10000);
                                tamanyoArray3[i] = aleatorio;
                            }
                            
                            tiempoInicial = System.currentTimeMillis();
                            
                            for(int i = 1 ; i < tamanyoArray3.length ; i++){
                                for(j = 0 ; j < tamanyoArray3.length -1 ; j++){
                                    if(tamanyoArray3[j] > tamanyoArray3[j+1]){
                                        aux = tamanyoArray3[j];
                                        tamanyoArray3[j] = tamanyoArray3[j+1];
                                        tamanyoArray3[j+1] = aux;
                                    }
                                }
                            }  
                            
                            tiempoFinal = System.currentTimeMillis();
                            
                            tiempoEjecucion = tiempoFinal - tiempoInicial;
                            System.out.println("Tiempo de ejecucion: " + tiempoEjecucion + " ms");                            
                            break;
                            
                        case 4:
                            
                            int [] tamanyoArray4 = new int[100000];
                            for(int i=0 ; i < 100000 ; i++){
                                int aleatorio = (int)(Math.random()*100000);
                                tamanyoArray4[i] = aleatorio;
                            }
                            
                            tiempoInicial = System.currentTimeMillis();
                            
                            for(int i = 1 ; i < tamanyoArray4.length ; i++){
                                for(j = 0 ; j < tamanyoArray4.length -1 ; j++){
                                    if(tamanyoArray4[j] > tamanyoArray4[j+1]){
                                        aux = tamanyoArray4[j];
                                        tamanyoArray4[j] = tamanyoArray4[j+1];
                                        tamanyoArray4[j+1] = aux;
                                    }
                                }
                            }  
                            
                            tiempoFinal = System.currentTimeMillis();
                            
                            tiempoEjecucion = tiempoFinal - tiempoInicial;
                            System.out.println("Tiempo de ejecucion: " + tiempoEjecucion + " ms");                                         
                            break;
                            
                    }                    
            }            
        
        System.out.println("\nFin del programa");
        
        
        
        teclado.close();
    }
}