/*
 * @author Antonio
 */

import java.util.Scanner;

public class EjFunMultiplo {

    Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        
        
        EjFunMultiplo programa = new EjFunMultiplo();
        programa.inicio();
        
    }
    public void inicio(){
      
        System.out.println(funMultipo(leerEntero(),leerEntero()));
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
    
    public boolean funMultipo(int valor1, int valor2){
    return valor1 % valor2 == 0 || valor2 % valor1 ==0;
}
}