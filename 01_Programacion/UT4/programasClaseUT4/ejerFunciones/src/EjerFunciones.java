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
       leerEntero(0);       //En estos metodos dependiendo delos argumentos que introduces te lleva a un metodo u otro.
       leerEntero(0, 20);   //  
       
    }
    
    public int leerEntero(){// Estre primero permite cualquier numero entero por teclado
        int entero = 0;
        System.out.print("Introduce un entero1: ");
        while(!teclado.hasNextInt()){
            teclado.nextLine();
            System.out.println("Error, dato no válido1.");
            System.out.print("Introduce un entero1: ");
        }
        entero = teclado.nextInt();
        teclado.nextLine();
        return entero;
    }
    
    public int leerEntero(int minimo){// Estre primero permite cualquier numero entero por teclado con un parametro mínimo.
        int entero;
        System.out.print("Introduce un entero2: ");
        while(!teclado.hasNextInt() || (entero = teclado.nextInt())< minimo){
            teclado.nextLine();
            System.out.println("Error, dato no válido2.");
            System.out.print("Introduce un entero2: ");
        }        
        teclado.nextLine();
        return entero;
    }
    
    public int leerEntero(int minimo, int maximo){
        int entero;
        System.out.print("Introduce un entero3: ");
        while(!teclado.hasNextInt() || (entero = teclado.nextInt())< minimo || entero >= maximo) {
            teclado.nextLine();
            System.out.println("Error, dato no válido3.");
            System.out.print("Introduce un entero3: ");
        }        
        teclado.nextLine();
        return entero;
    }
}
