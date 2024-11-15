/*
Ejemplo filtrar resultados de una matriz
 */

public class FiltraResultados {

    public static void main(String[] args) {
        
        int[][] matrizAleat = new int[4][4];
        int numAleat= 0, numMax=0, numMin=10, sumTotal=0, contador=0, tamanyo=0, posicion=0;
   
        
        
        for (int i = 0; i < matrizAleat.length; i++) {
            for (int j = 0; j < matrizAleat[i].length; j++) {
                matrizAleat[i][j] += (int)(Math.random()*10);   // Genero matriz aleatoria
                sumTotal += matrizAleat[i][j];                  // Saco el total de la matriz
                contador++;                                     // Cuento número de cifras de la matriz
                if(matrizAleat[i][j] > numMax){                 //
                    numMax = matrizAleat[i][j];                 // Saco valor máximo 
                }                                               // 
                if(matrizAleat[i][j] < numMin){                 //
                    numMin = matrizAleat[i][j];                 //Saco valor minimo 
                }                                               //
            }            
        }//Con este for lleno la matriz con números aleatorios, saco el número máximo, el minimo, la media y la suma total 
        
             
        for (int i = 0; i < matrizAleat.length; i++) {                              
            for (int j = 0; j < matrizAleat[i].length; j++) {
                if(matrizAleat[i][j] > numMax/2 && matrizAleat[i][j] % 2 == 0){                    
                    tamanyo++;
                }                                
            }            
        }// CUento los elementos que cumplen con la condicion
        int[] aleat = new int[tamanyo];
        for (int i = 0; i < matrizAleat.length; i++) {
            for (int j = 0; j < matrizAleat[i].length; j++) {
                if(matrizAleat[i][j] > numMax/2 && matrizAleat[i][j] % 2 == 0){                    
                    aleat[posicion] += matrizAleat[i][j];
                    posicion++;
                }                                
            }            
        }// Creo una array y guardo en ella los número que complen la condicion   
        for (int i = 0; i < aleat.length; i++) {
            System.out.print(aleat[i] + " ");            
        }// Con este bucle imprimo los resultados mayores de 4 y que sean pares. Combiando el símbolo ">" por "<=" saco los menores de 5 y cambiando 0 por 1 saco los impares
       
        
        
        System.out.println("\n\n----------------------------------");
        for (int i = 0; i < matrizAleat.length; i++) {
            for (int j = 0; j < matrizAleat[i].length; j++) {
                System.out.print(matrizAleat[i][j] + " ");                
            }
            System.out.println("");
        }
        System.out.println("\nNumero MAximo: " + numMax);
        System.out.println("Numero Minimo: " + numMin);
        System.out.println("Numero Mediana: " + numMax/2);
        System.out.println("total matriz: " + sumTotal);
        System.out.println("Media: " + sumTotal/contador);
        System.out.println("tamaño: " + tamanyo);
        
       
    }
    
}
