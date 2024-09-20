/*
Este programa te pide dos números y te dice si son múltiplos uno de otro.
Para ello empleamos el comparador == para obtener un valor booleano.
 */
import java.util.Scanner;
public class Multiplos {

    public static void main(String[] args) {
       int valor1,valor2;
       
       Scanner teclado = new Scanner(System.in);
       
        System.out.print("Dime un número: ");
        valor1 = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Dime un segundo número: ");
        valor2 = teclado.nextInt();
        teclado.nextLine();
        System.out.println("La afirmación de que los dos números son múltiplos es... " + (valor1%valor2 == 0));
        teclado.close();
    }
    
}
