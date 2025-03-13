/*
Por: Antonio
 */

import java.util.Scanner;
public class TablaMultiplicar {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor1, i=0;
        final int MAX =10;
             
        System.out.print("De que número quieres saber la tabla: ");
        if(teclado.hasNextInt()){
            valor1 = teclado.nextInt();
            teclado.nextLine();
            while(i <= MAX){
                System.out.println(valor1 + " x " + i + " = " + (valor1 * i));
                i++;
            }
            System.out.println();
        }
        else{
            System.out.println("ERROR");
        }
    }
    
}
