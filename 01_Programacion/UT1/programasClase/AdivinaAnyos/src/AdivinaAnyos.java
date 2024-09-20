/*
Este programa te pide tu nombre, año de nacimiento, el año actual y te dice tu edad.
Segido de un nextInt, nextDouble, podemos poner un nextLine y vaciamos el buffer, por lo que solo nos admitirá un único dato de entrada por el teclado
 */
// Con dos barras hacemos comentarios en una línea.
import java.util.Scanner;
public class AdivinaAnyos {

    public static void main(String[] args) {
        
        int anyos,fecha, edad;
        String nombre;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Hola dime tu nombre: ");
        nombre = teclado.nextLine();
        System.out.print("Dime tu año de nacimiento: ");
        anyos = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Ahora dime en que año estamos: ");
        fecha = teclado.nextInt();
        teclado.nextLine();
        edad = fecha - anyos;
        System.out.println("Hola " + nombre + " este año cumples o has cumplido " + edad + " años");
        
        teclado.close();
    }    
}
