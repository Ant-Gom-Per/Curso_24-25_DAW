/*
Ejercicio clase 3_3.txt Ej1 
 */

public class MatrizTabla {

    public static void main(String[] args) {
        int sumaFilas=0;
        int sumaColumnas[] = new int[4];
        int[][]tabla = {
            {1, 2, 3, 4},
            {2, 3, 4, 1},
            {3, 4, 1, 2},
            {4, 1, 2, 3}
            
        };
        for (int i = 0; i < 4; i++) {           
            for (int j = 0; j <  4; j++) {
                sumaFilas += tabla[i][j];
                sumaColumnas[j] += tabla[i][j];
                
                System.out.print(tabla[i][j] + "\t");
            }
            System.out.println("| " + sumaFilas);
            sumaFilas =0;
        }
        System.out.println("--------------------------------------");
        for (int i = 0; i < sumaColumnas.length; i++) {
            System.out.print(sumaColumnas[i] + "\t");
            
        }
        System.out.println(" \n");
    }
    
}
