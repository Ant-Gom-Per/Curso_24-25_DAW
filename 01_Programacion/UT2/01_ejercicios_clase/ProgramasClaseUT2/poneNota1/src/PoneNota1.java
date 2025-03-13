/*
Autor: Antonio Gómez Pérez
Este programa nos muestra nuestra claificacion en función a la nota introducida.
Para ello empleamos el condicional múltiple else if
 */
import java.util.Scanner;

public class PoneNota1 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        double notaUsuario;
        
        System.out.print("Introduce tu nota (del 1 al 10):");
        notaUsuario = teclado.nextDouble();
        teclado.nextLine();
        if(notaUsuario >= 11){  //Intentar poner menos de 3 "if" anidados
            System.out.println("Error!! Nota no válida.");
        }else if(notaUsuario >= 9){
            System.out.println("Sobresaliente");
        }else if(notaUsuario >= 6.5) {
            System.out.println("Notable");
        }else if(notaUsuario >= 5){
            System.out.println("Aprobado");
        }else{
            System.out.println("Suspendido");
        }        
    }    
}
