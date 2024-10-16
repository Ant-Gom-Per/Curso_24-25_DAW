
import java.util.Scanner;

/*
Ejercicio16 UT2.3
 */

/**
 *
 * @author ciclost
 */
public class TablaMultiplicarVerFor {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor1;
        final int MAX =10;
             
        System.out.print("De que número quieres saber la tabla: ");
        if(teclado.hasNextInt()){
            valor1 = teclado.nextInt();
            teclado.nextLine();
            for(int j = 0; j <= MAX; j++){
                System.out.println(valor1 + " x " + j + " = " + (valor1 * j));
                
            }
            System.out.println();
        }
        else{
            System.out.println("ERROR");
        }
    }
    
}