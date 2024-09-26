/*
Autor: Antonio Gómez Pérez
 */

import java.util.Scanner;

public class UT1Programa6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int precioBebida, dineroIntroducido, cantidadCambio;
        
        System.out.println("-MAQUINA DE BABIDAS-");
        System.out.println("--------------------");
        System.out.print("Introduce el precio en centimos (máximo 100) de la bebida seleccionada : ");
        precioBebida = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Escribe la cantidad de dinero en centimos (máximo 100) introducido en la máquina: ");
        dineroIntroducido = teclado.nextInt();
        teclado.nextLine();
        cantidadCambio = dineroIntroducido - precioBebida;
        System.out.println("Tu cambio es de " + cantidadCambio + " centimos.");
        
        System.out.println("La cantida de monedas de 50 centimos es de: " + cantidadCambio / 50); 
        System.out.println("La cantida de monedas de 20 centimos es de: " + cantidadCambio / 20);
        System.out.println("La cantida de monedas de 10 centimos es de: " + cantidadCambio / 10);
        System.out.println("La cantida de monedas de  5 centimos es de: " + cantidadCambio /  5);
        System.out.println("La cantida de monedas de  2 centimos es de: " + cantidadCambio /  2);
        System.out.println("La cantida de monedas de  1 centimos es de: " + cantidadCambio /  1);
        
        
        
        teclado.close();
    }
    
}
