/*
Por Antonio Gómez Pérez
Empleamos una operación ternária para obtener un resultado booleano decidido por nosotros.
 */
import java.util.Scanner;

public class EdadTernaria {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int edad;
        
        System.out.print("Que edad tienes?: ");         
        edad = teclado.nextInt();
        teclado.nextLine();
        String mensaje = edad>18 ? "Puedes pasar" : "No puedes pasar";  // Esta es la expresión ternaria.
        System.out.println(mensaje);         
    }    
}
