/*
ejercicios 3_1 nº2
 */

public class FusionaArrays {

    public static void main(String[] args) {
        int [] arrayA = {1, 2, 3, 4, 5};
        int [] arrayB = {6, 7, 8, 9, 10};
        int [] arrayC = new int[arrayA.length + arrayB.length];
        int j=0;
        for( int i =0 ; i <= arrayA.length-1 ; i++){ //Usamos la array más pequeña para contar
            arrayC [j] = arrayA[i];
            j++;
            arrayC [j++] = arrayB[i];// Aquí j tiene un post-incremeto            
        }
        System.out.print("arrary C: ");
        for(int i =0 ; i <= arrayC.length-1 ; i++){
            System.out.print(arrayC[i] + " ");
        }
        System.out.println(" ");
    }
    
}
