/*
8.- Programa que pido por teclado un día de la semana y que diga qué asignatura toca a primera hora ese día.

Por: Antonio Gómez Pérez
Este programa nos pide que le indiquemos un día de la semana y nos indica que asignatura tenemos a primera hora.
 */
import java.util.Scanner;

public class HoraClaseVer2 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);      
            
        System.out.print("¿Que dia de la samana quieres saber? ");
        String opcion = teclado.nextLine();
        String asignatura = "";
        boolean error = false;
                  
        switch(opcion) {
            case "lunes":
                asignatura = "Lenguaje";
                break;
            case "martes":
                asignatura = "Matemáticas";
                break;
            case "miercoles":
                asignatura = "Inglés";
                break;
            case "jueves":
                asignatura = "Gimnasia";
                break;
            case "viernes":
                asignatura = "Plástica";
                break;
            default:
                System.out.println("ERROR!!, dato no válido.");
                error = true;
        }
        if(!error) {
            System.out.println("El " + opcion + " tienes a primera hora " + asignatura);
        }
        teclado.close();
    }    
}
