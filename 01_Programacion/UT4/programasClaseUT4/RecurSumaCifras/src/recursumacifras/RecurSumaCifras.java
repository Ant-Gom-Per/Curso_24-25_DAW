/*
Ejercicio 5 recursividad
 */
package recursumacifras;

/**
 *
 * @author ciclost
 */
import java.util.Scanner;

public class RecurSumaCifras {

    public static void main(String[] args) {
        
        RecurSumaCifras programa = new RecurSumaCifras();
        programa.inicio();
    }
    
    public void inicio(){
    int resultado = SumaCifras(leerEntero());// Leer entero 
        System.out.println("Resultado: " + resultado);
    
    }
    
    public int SumaCifras(int valor1){
        valor1 = Math.abs(valor1);
        if(valor1 < 10){
            return valor1;
        }else{
            return SumaCifras(valor1/10) + valor1 % 10;
        }
    }
    //El metodo de entrada por teclado no forma parte del ejercicio, es un añadido mio.
    public int leerEntero(){// Estre primero permite cualquier numero entero por teclado
        Scanner teclado = new Scanner(System.in);
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
}
