/*
7.- Programa “Adivina el número”. Pedirá al usuario que introduzca un número entero entre 1 y 100. Si el valor introducido por el usuario no está en ese rango,
tendrá que mostrar un mensaje de error. El número a adivinar es el 26, si el usuario lo acierta se tendrá que mostrar por pantalla “HAS GANADO” 
mientras que si no lo acierta se mostrará por pantalla “Lo siente, no era ese el número que pensé”.
 */

/** *
 * @author Antonio Gómez Pérez
 */
import java.util.Scanner;

public class AdivinaNumeroVer2 {
   
    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);
        
        int valorTeclado, numeroSecreto = 26;
        
        System.out.print("Dime un nmero del 1 al 100 ");
        valorTeclado = teclado.nextInt();
        teclado.nextLine();
        
        if (valorTeclado >=1 && valorTeclado<=100){
            System.out.println((valorTeclado == numeroSecreto) ? "Has acertado" : "Has fallado");
        }
        else{
            System.out.println("ERROR!!, dato no válido");
        }    
    }    
}
