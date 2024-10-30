/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ciclost
 */
public class DuplicaArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double [] arrayA = {9.5, 4.5, 6.7};
       double [] arrayB = new double[arrayA.length];
        for(int i =0 ; i< arrayA.length ; i++){
            arrayB[i] = arrayA[i];
        }
        //A partir de aquí mostramos la array por pantalla
        System.out.print("arrary A: ");
        for(int i =0 ; i <= arrayA.length-1 ; i++){
            System.out.print(arrayA[i] + " ");
        }        
        System.out.println("");
        System.out.print("arrary B: ");
        for(int i =0 ; i <= arrayB.length-1 ; i++){            
            System.out.print(arrayB[i] + " ");
        }
        System.out.println("");
    }    
}
