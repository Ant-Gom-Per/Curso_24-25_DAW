/*
Este programa multiplica tres números reales introducidos por el teclado, evita la introduccion de mas de un número a la vez.
teclado.nextDouble() solo lee el próximo número entero
teclado.nextDouble() solo lee el próximo número real
teclado.nextLine() lee la linea introducida
teclado.nextLine() sin variable, limpia el buffer
 */
import java.util.Scanner;

public class EntradaTeclado {
    public static void main(String[] args) {
        
        double valor1, valor2,valor3;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Escribe un número: ");
        valor1 = teclado.nextDouble();
        teclado.nextLine();
        System.out.print("Escribe otro número: ");
        valor2 = teclado.nextDouble();
        teclado.nextLine();
        System.out.print("Escribe un número más: ");
        valor3 = teclado.nextDouble();
        teclado.nextLine();
        System.out.println("El resultado es: " + valor1 * valor2 * valor3);
        
        teclado.close();
    }
    
}
