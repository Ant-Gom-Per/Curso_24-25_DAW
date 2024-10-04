/*
8.- Programa que pido por teclado un día de la semana y que diga qué asignatura toca a primera hora ese día.

Por: Antonio Gómez Pérez
Este programa nos pide que le indiquemos un día de la semana y nos indica que asignatura tenemos a primera hora.
 */
import java.util.Scanner;

public class HoraClase {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        String opcion;
        
        System.out.print("¿Que dia de la samana quieres saber? ");
        opcion = teclado.nextLine();
        
        switch (opcion){
            case "lunes":
                System.out.println("Lenguaje");
                break;
            case "martes":
                System.out.println("Matemáticas");
                break;
            case "miercoles":
                System.out.println("Inglés");
                break;
            case "jueves":
                System.out.println("Gimnasia");
                break;
            case "viernes":
                System.out.println("Plástica");
                break;
            default:
                System.out.println("ERROR!!, dato no válido");
        }
        teclado.close();
    }
    
}
