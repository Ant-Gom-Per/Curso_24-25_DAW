/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerrepaso;

/**
 *
 * @author ciclost
 */
public class EjerRepaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String resultado = maxRecursivo(3,3);
        System.out.println("resultado: " + resultado);
        int[] datos = {1,2,3};
        imprimirArray(datos);
    }
    
    public static String maxRecursivo(int n1, int n2){
        if(n1 == 0 && n2 == 0){
            return "Son iguales";
        }
        if(n1 == 0){
            return "n2 es mayor";
        }
        if(n2 == 0){
            return "n2 es mayor";
        }
        return maxRecursivo(--n1, --n2);
    }
    
    public static void imprimirArray(int[]array){
        if (array == null) System.out.println("Array nulo");
        imprimirArray(array, 0);
    }
    
    public static void imprimirArray(int[] array, int index){
        if(index == array.length){
            System.out.println("fin");
        }
        else{
            System.out.print(array[index] + " ");
            imprimirArray(array,index+1);
        }
        
    }
}
