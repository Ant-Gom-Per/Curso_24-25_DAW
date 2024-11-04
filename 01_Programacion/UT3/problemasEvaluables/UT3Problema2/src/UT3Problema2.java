/*
Por: Antonio Gómez Pérez
 */
import java.util.Scanner;
public class UT3Problema2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int opcion1=0, opcion2=0,numBusc=0,menor=0, central=0,mayor=0, clave=0, j=0, valorMinimoActual, indiceValorMinimoActual, aux;
        boolean encontrado;
        long tiempoInicial, tiempoFinal, tiempoEjecucion;
            
            
            System.out.println("\n\nPuebas disponibles");
            System.out.println("------------------\n");
            System.out.println("1.- Busqueda lineal");
            System.out.println("2.- Búsqueda binaria");
            System.out.println("3.- Inserción directa");
            System.out.println("4.- Inserción indirecta");
            System.out.println("5.- Intercambio binario");
            System.out.println("6.- Salir del programa\n");
            
            System.out.print("Introduce la opcion deseada: ");
            while(!teclado.hasNextInt() || (opcion1 = teclado.nextInt()) <1 || opcion1 > 6){
                teclado.nextLine();
                System.out.println("Error, dato no válido.");
                System.out.print("Introduce la opcion deseada: ");
            }
            teclado.nextLine(); 
            
            switch(opcion1){
                case 1:
                    System.out.println("\n\nBusqueda lineal");
                    System.out.println("---------------\n");
                    System.out.println("1.- Crear array de 1000 elementos");
                    System.out.println("2.- Crear array de 10000 elementos");
                    System.out.println("3.- Crear array de 100000 elementos");
                    System.out.println("4.- Crear array de 1000000 elementos\n");
                    
                    System.out.print("Introduce la opcion deseada: ");
                    while(!teclado.hasNextInt() || (opcion2 = teclado.nextInt()) <1 || opcion2 > 4){
                        teclado.nextLine();
                        System.out.println("Error, dato no válido.");
                        System.out.print("Introduce la opcion deseada: ");
                    }
                    teclado.nextLine();
                    switch(opcion2){
                        case 1:
                            int [] tamanyoArray1 = new int[1000];
                            for(int i=0 ; i < 1000 ; i++){
                                tamanyoArray1[i] = i;
                            }
                            System.out.print("¿Que número deseas buscar? ");
                            while(!teclado.hasNextInt() || (numBusc = teclado.nextInt()) <1 || numBusc > 1000){
                                teclado.nextLine();
                                System.out.println("Error, dato no válido.");
                                System.out.print("¿Que número deseas buscar? ");
                            }
                            
                            tiempoInicial = System.currentTimeMillis();
                            encontrado = false;
                            for(int i = 0; i < tamanyoArray1.length && !encontrado; i++){
                                if(numBusc == tamanyoArray1[i]){
                                    System.out.println("Numero buscado: " + i);
                                    encontrado = true;
                                }                            
                            }
                            if(!encontrado){
                                System.out.println(-1);
                            }
                            tiempoFinal = System.currentTimeMillis();
                            tiempoEjecucion = tiempoFinal - tiempoInicial;
                            System.out.println("Tiempo de ejecucion: " + tiempoEjecucion + " ms");
                            break;
                            
                        case 2:
                            int [] tamanyoArray2 = new int[10000];
                            for(int i=0 ; i < 10000 ; i++){
                                tamanyoArray2[i] = i;
                            }
                            System.out.print("¿Que número deseas buscar? ");
                            while(!teclado.hasNextInt() || (numBusc = teclado.nextInt()) <1 || numBusc > 10000){
                                teclado.nextLine();
                                System.out.println("Error, dato no válido.");
                                System.out.print("¿Que número deseas buscar? ");
                            }
                            
                            tiempoInicial = System.currentTimeMillis();
                            encontrado = false;
                            for(int i = 0; i < tamanyoArray2.length && !encontrado; i++){
                                if(numBusc == tamanyoArray2[i]){
                                    System.out.println("Numero buscado: " + i);
                                    encontrado = true;
                                }                            
                            }
                            if(!encontrado){
                                System.out.println(-1);
                            }
                            tiempoFinal = System.currentTimeMillis();
                            
                            tiempoEjecucion = tiempoFinal - tiempoInicial;
                            System.out.println("Tiempo de ejecucion: " + tiempoEjecucion + " ms");
                            break;
                            
                        case 3:
                            int [] tamanyoArray3 = new int[100000];
                            for(int i=0 ; i < 100000 ; i++){
                                tamanyoArray3[i] = i;
                            }
                            System.out.print("¿Que número deseas buscar? ");
                            while(!teclado.hasNextInt() || (numBusc = teclado.nextInt()) <1 || numBusc > 100000){
                                teclado.nextLine();
                                System.out.println("Error, dato no válido.");
                                System.out.print("¿Que número deseas buscar? ");
                            }
                            
                            tiempoInicial = System.currentTimeMillis();
                            encontrado = false;
                            for(int i = 0; i < tamanyoArray3.length && !encontrado; i++){
                                if(numBusc == tamanyoArray3[i]){
                                    System.out.println("Numero buscado: " + i);
                                    encontrado = true;
                                }                            
                            }
                            if(!encontrado){
                                System.out.println(-1);
                            }
                            tiempoFinal = System.currentTimeMillis();
                            
                            tiempoEjecucion = tiempoFinal - tiempoInicial;
                            System.out.println("Tiempo de ejecucion: " + tiempoEjecucion + " ms");
                            break;
                            
                        case 4:
                            int [] tamanyoArray4 = new int[1000000];
                            for(int i=0 ; i < 1000000 ; i++){
                                tamanyoArray4[i] = i;
                            }
                            System.out.print("¿Que número deseas buscar? ");
                            while(!teclado.hasNextInt() || (numBusc = teclado.nextInt()) <1 || numBusc > 1000000){
                                teclado.nextLine();
                                System.out.println("Error, dato no válido.");
                                System.out.print("¿Que número deseas buscar? ");
                            }
                            
                            tiempoInicial = System.currentTimeMillis();
                            encontrado = false;
                            for(int i = 0; i < tamanyoArray4.length && !encontrado; i++){
                                if(numBusc == tamanyoArray4[i]){
                                    System.out.println("Numero buscado: " + i);
                                    encontrado = true;
                                }                            
                            }
                            if(!encontrado){
                                System.out.println(-1);
                            }
                            tiempoFinal = System.currentTimeMillis();
                            
                            tiempoEjecucion = tiempoFinal - tiempoInicial;
                            System.out.println("Tiempo de ejecucion: " + tiempoEjecucion + " ms");
                            break;
                    }                   
                    break;
                case 2:
                    System.out.println("\n\nBusqueda binaria");
                    System.out.println("---------------\n");
                    System.out.println("1.- Crear array de 1000 elementos");
                    System.out.println("2.- Crear array de 10000 elementos");
                    System.out.println("3.- Crear array de 100000 elementos");
                    System.out.println("4.- Crear array de 1000000 elementos\n");
                    
                    System.out.print("Introduce la opcion deseada: ");
                    while(!teclado.hasNextInt() || (opcion2 = teclado.nextInt()) <1 || opcion2 > 4){
                        teclado.nextLine();
                        System.out.println("Error, dato no válido.");
                        System.out.print("Introduce la opcion deseada: ");
                    }
                    teclado.nextLine();
                    switch(opcion2){
                        case 1:
                            int [] tamanyoArray1 = new int[1000];
                            for(int i=0 ; i < 1000 ; i++){
                                tamanyoArray1[i] = i;
                            }
                            System.out.print("¿Que número deseas buscar? ");
                            while(!teclado.hasNextInt() || (numBusc = teclado.nextInt()) <1 || numBusc > 1000){
                                teclado.nextLine();
                                System.out.println("Error, dato no válido.");
                                System.out.print("¿Que número deseas buscar? ");
                            }
                            
                            tiempoInicial = System.currentTimeMillis();
                            encontrado = false;
                            mayor = tamanyoArray1.length-1;
                            while(mayor >= menor && !encontrado){
                                central = (menor + mayor) / 2;
                                if(numBusc < tamanyoArray1[central]){
                                    mayor = central -1;
                                }
                                else if(numBusc == tamanyoArray1[central]){
                                    System.out.println("Numero buscado: " + central);
                                    encontrado = true;
                                }
                                else{
                                    menor = central +1;
                                }
                            }
                            if(!encontrado){
                                System.out.println(-1);
                            }                            
                            tiempoFinal = System.currentTimeMillis();
                            
                            tiempoEjecucion = tiempoFinal - tiempoInicial;
                            System.out.println("Tiempo de ejecucion: " + tiempoEjecucion + " ms");
                            break;
                            
                        case 2:
                            int [] tamanyoArray2 = new int[10000];
                            for(int i=0 ; i < 10000 ; i++){
                                tamanyoArray2[i] = i;
                            }
                            System.out.print("¿Que número deseas buscar? ");
                            while(!teclado.hasNextInt() || (numBusc = teclado.nextInt()) <1 || numBusc > 10000){
                                teclado.nextLine();
                                System.out.println("Error, dato no válido.");
                                System.out.print("¿Que número deseas buscar? ");
                            }
                            
                            tiempoInicial = System.currentTimeMillis();
                            encontrado = false;
                            mayor = tamanyoArray2.length-1;
                            while(mayor >= menor && !encontrado){
                                central = (menor + mayor) / 2;
                                if(numBusc < tamanyoArray2[central]){
                                    mayor = central -1;
                                }
                                else if(numBusc == tamanyoArray2[central]){
                                    System.out.println("Numero buscado: " + central);
                                    encontrado = true;
                                }
                                else{
                                    menor = central +1;
                                }
                            }
                            if(!encontrado){
                                System.out.println(-1);
                            }
                            tiempoFinal = System.currentTimeMillis();
                            
                            tiempoEjecucion = tiempoFinal - tiempoInicial;
                            System.out.println("Tiempo de ejecucion: " + tiempoEjecucion + " ms");
                            break;
                            
                        case 3:
                            int [] tamanyoArray3 = new int[100000];
                            for(int i=0 ; i < 100000 ; i++){
                                tamanyoArray3[i] = i;
                            }
                            System.out.print("¿Que número deseas buscar? ");
                            while(!teclado.hasNextInt() || (numBusc = teclado.nextInt()) <1 || numBusc > 100000){
                                teclado.nextLine();
                                System.out.println("Error, dato no válido.");
                                System.out.print("¿Que número deseas buscar? ");
                            }
                            
                            tiempoInicial = System.currentTimeMillis();
                            encontrado = false;
                            mayor = tamanyoArray3.length-1;
                            while(mayor >= menor && !encontrado){
                                central = (menor + mayor) / 2;
                                if(numBusc < tamanyoArray3[central]){
                                    mayor = central -1;
                                }
                                else if(numBusc == tamanyoArray3[central]){
                                    System.out.println("Numero buscado: " + central);
                                    encontrado = true;
                                }
                                else{
                                    menor = central +1;
                                }
                            }
                            if(!encontrado){
                                System.out.println(-1);
                            }
                            tiempoFinal = System.currentTimeMillis();
                            
                            tiempoEjecucion = tiempoFinal - tiempoInicial;
                            System.out.println("Tiempo de ejecucion: " + tiempoEjecucion + " ms");
                            break;
                            
                        case 4:
                            int [] tamanyoArray4 = new int[1000000];
                            for(int i=0 ; i < 1000000 ; i++){
                                tamanyoArray4[i] = i;
                            }
                            System.out.print("¿Que número deseas buscar? ");
                            while(!teclado.hasNextInt() || (numBusc = teclado.nextInt()) <1 || numBusc > 1000000){
                                teclado.nextLine();
                                System.out.println("Error, dato no válido.");
                                System.out.print("¿Que número deseas buscar? ");
                            }
                            
                            tiempoInicial = System.currentTimeMillis();
                            encontrado = false;
                            mayor = tamanyoArray4.length-1;
                            while(mayor >= menor && !encontrado){
                                central = (menor + mayor) / 2;
                                if(numBusc < tamanyoArray4[central]){
                                    mayor = central -1;
                                }
                                else if(numBusc == tamanyoArray4[central]){
                                    System.out.println("Numero buscado: " + central);
                                    encontrado = true;
                                }
                                else{
                                    menor = central +1;
                                }
                            }
                            if(!encontrado){
                                System.out.println(-1);
                            }
                            tiempoFinal = System.currentTimeMillis();
                            
                            tiempoEjecucion = tiempoFinal - tiempoInicial;
                            System.out.println("Tiempo de ejecucion: " + tiempoEjecucion + " ms");
                            break;
                    }                    
                    break;
                case 3:
                    System.out.println("\n\nInserción Directa");
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

                                tiempoInicial = System.currentTimeMillis();


                                for(int i=1 ; i<tamanyoArray1.length ; i++){
                                    clave = tamanyoArray1[i];
                                    j = i-1;
                                    while( j>=0 && tamanyoArray1[j] > clave){
                                        tamanyoArray1[j+1] = tamanyoArray1[j];
                                        j = j-1;
                                    }
                                    tamanyoArray1[j+1] = clave;
                                }                           
                                tiempoFinal = System.currentTimeMillis();

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

                                for(int i=1 ; i<tamanyoArray2.length ; i++){
                                    clave = tamanyoArray2[i];
                                    j = i-1;
                                    while( j>=0 && tamanyoArray2[j] > clave){
                                        tamanyoArray2[j+1] = tamanyoArray2[j];
                                        j = j-1;
                                    }
                                    tamanyoArray2[j+1] = clave;
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


                                for(int i=1 ; i<tamanyoArray3.length ; i++){
                                    clave = tamanyoArray3[i];
                                    j = i-1;
                                    while( j>=0 && tamanyoArray3[j] > clave){
                                        tamanyoArray3[j+1] = tamanyoArray3[j];
                                        j = j-1;
                                    }
                                    tamanyoArray3[j+1] = clave;
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

                                for(int i=1 ; i<tamanyoArray4.length ; i++){
                                    clave = tamanyoArray4[i];
                                    j = i-1;
                                    while( j>=0 && tamanyoArray4[j] > clave){
                                        tamanyoArray4[j+1] = tamanyoArray4[j];
                                        j = j-1;
                                    }
                                    tamanyoArray4[j+1] = clave;
                                }                           
                                tiempoFinal = System.currentTimeMillis();

                                tiempoEjecucion = tiempoFinal - tiempoInicial;
                                System.out.println("Tiempo de ejecucion: " + tiempoEjecucion + " ms");                                         
                                break;
                        }        
                    break;
                case 4:                
                    System.out.println("\n\nInserción Indirecta");
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

                            for(int i =0 ; i<tamanyoArray1.length-1 ; i++){
                                valorMinimoActual = tamanyoArray1[i];
                                indiceValorMinimoActual = i;
                                for( j=i+1 ; j<tamanyoArray1.length ; j++){
                                    if(valorMinimoActual > tamanyoArray1[j]){
                                        valorMinimoActual = tamanyoArray1[j];
                                        indiceValorMinimoActual = j;
                                    }
                                }
                                if(indiceValorMinimoActual != i){
                                    tamanyoArray1[indiceValorMinimoActual] = tamanyoArray1[i];
                                    tamanyoArray1[i] = valorMinimoActual;
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

                            for(int i =0 ; i<tamanyoArray2.length-1 ; i++){
                                valorMinimoActual = tamanyoArray2[i];
                                indiceValorMinimoActual = i;
                                for( j=i+1 ; j<tamanyoArray2.length ; j++){
                                    if(valorMinimoActual > tamanyoArray2[j]){
                                        valorMinimoActual = tamanyoArray2[j];
                                        indiceValorMinimoActual = j;
                                    }
                                }
                                if(indiceValorMinimoActual != i){
                                    tamanyoArray2[indiceValorMinimoActual] = tamanyoArray2[i];
                                    tamanyoArray2[i] = valorMinimoActual;
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

                            for(int i =0 ; i<tamanyoArray3.length-1 ; i++){
                                valorMinimoActual = tamanyoArray3[i];
                                indiceValorMinimoActual = i;
                                for( j=i+1 ; j<tamanyoArray3.length ; j++){
                                    if(valorMinimoActual > tamanyoArray3[j]){
                                        valorMinimoActual = tamanyoArray3[j];
                                        indiceValorMinimoActual = j;
                                    }
                                }
                                if(indiceValorMinimoActual != i){
                                    tamanyoArray3[indiceValorMinimoActual] = tamanyoArray3[i];
                                    tamanyoArray3[i] = valorMinimoActual;
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

                            for(int i =0 ; i<tamanyoArray4.length-1 ; i++){
                                valorMinimoActual = tamanyoArray4[i];
                                indiceValorMinimoActual = i;
                                for( j=i+1 ; j<tamanyoArray4.length ; j++){
                                    if(valorMinimoActual > tamanyoArray4[j]){
                                        valorMinimoActual = tamanyoArray4[j];
                                        indiceValorMinimoActual = j;
                                    }
                                }
                                if(indiceValorMinimoActual != i){
                                    tamanyoArray4[indiceValorMinimoActual] = tamanyoArray4[i];
                                    tamanyoArray4[i] = valorMinimoActual;
                                }
                            }                          
                            tiempoFinal = System.currentTimeMillis();

                            tiempoEjecucion = tiempoFinal - tiempoInicial;
                            System.out.println("Tiempo de ejecucion: " + tiempoEjecucion + " ms");                                         
                            break;
                    }
                    break;
                    
                case 5:
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
                    break;
                    
                default:
                    System.out.println("Saliendo del programa...");
            }            
        
        System.out.println("Fin del programa");
        teclado.close();
    }
}