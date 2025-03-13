/*
Por: Antonio Gómez Pérez
 */
import java.util.Scanner;

public class CalculaNumeros {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int valor1, valor2, opcion, resultado;
        System.out.print("Introduce un primer numero entero: ");
        valor1 = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Introduce un segundo número entero: ");
        valor2 = teclado.nextInt();
        teclado.nextLine();
        System.out.println("*******************************");
        System.out.println("*      SUPER CALCULADORA      *");
        System.out.println("*  PARA SUMAR        PULSA 1  *");
        System.out.println("*  PARA RESTAR       PULSA 2  *");
        System.out.println("*  PARA MULTIPLICAR  PULSA 3  *");
        System.out.println("*  PARA DIVIDIR      PULSA 4  *");
        System.out.println("*******************************");
        System.out.print("Que operación quieres hacer? ");
        opcion = teclado.nextInt();
        teclado.nextLine();
        switch (opcion){
            case 1:
                resultado = valor1 + valor2;
                System.out.println("El resultado de la suma es:" + resultado);
                break;
            case 2:
                resultado = valor1 - valor2;
                System.out.println("El resultado de la resta es:" + resultado);
                break;
            case 3:
                resultado = valor1 * valor2;
                System.out.println("El resultado de la multiplicación es:" + resultado);
                break;
            case 4:
                if (valor2 != 0) {
                    resultado = valor1 / valor2;
                    System.out.println("El resultado de la división es:" + resultado);
                } else {
                    System.out.println("Error division por cero!!");                
                }
                break;
            default:
                System.out.println("\nERROR!!, dato no válido.");
        }        
    }    
}
