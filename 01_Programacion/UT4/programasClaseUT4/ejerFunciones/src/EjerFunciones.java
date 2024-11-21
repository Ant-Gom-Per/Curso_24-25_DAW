/*
 * @author Antonio
 */

import java.util.Scanner;

public class EjerFunciones {

    Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        
        
        EjerFunciones programa = new EjerFunciones();
        programa.inicio();
        
    }
    public void inicio(){
       leerEntero();        //
       leerEntero(0);       //En estos metodos 
       leerEntero(0, 20);   //  
       
    }
    
    public int leerEntero(){
        int entero = 0;
        System.out.print("Introduce un entero: ");
        while(!teclado.hasNextInt()){
            teclado.nextLine();
            System.out.println("Error, dato no válido.");
            System.out.print("Introduce un entero: ");
        }
        entero = teclado.nextInt();
        teclado.nextLine();
        return entero;
    }
    
    public int leerEntero(int minimo){
        int entero;
        System.out.print("Introduce un entero: ");
        while(!teclado.hasNextInt() || (entero = teclado.nextInt())< minimo){
            teclado.nextLine();
            System.out.println("Error, dato no válido.");
            System.out.print("Introduce un entero: ");
        }        
        teclado.nextLine();
        return entero;
    }
    
    public int leerEntero(int minimo, int maximo){
        int entero;
        System.out.print("Introduce un entero: ");
        while(!teclado.hasNextInt() || (entero = teclado.nextInt())< minimo || entero >= maximo) {
            teclado.nextLine();
            System.out.println("Error, dato no válido.");
            System.out.print("Introduce un entero: ");
        }        
        teclado.nextLine();
        return entero;
    }
}
