/**
Por: Antonio
 */
import java.util.Scanner;

public class Adivina241 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int numSecreto = 241, numUsuario;
        
        System.out.print("Adivina el número secreto: ");
        numUsuario = teclado.nextInt();
        teclado.nextLine();
        
        if (numSecreto == numUsuario){
            System.out.println("Correcto, has acertado.");
        }else{
            System.out.println("Lo siento te has equivocado.");
        }        
    }    
}
