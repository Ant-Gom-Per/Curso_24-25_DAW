/*
Ejercicio 3.1 UT3_1 ***esta en ejercicios resueltos***
 */
import java.util.Scanner;
public class ArrayNotasClase {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       
       int numeroNotas, valorNotas, i=0;
       int [] arrayNotas = new int[numeroNotas=0];
       
        System.out.print("Cuantas notas necesitas introducir? ");
        while(!teclado.hasNextInt() || (numeroNotas = teclado.nextInt()) < 0){
            teclado.nextLine();
            System.out.println("Error,dato no válido");
            System.out.print("Cuantas notas necesitas introducir? ");            
        }
        teclado.nextLine();
        
        System.out.println("Introduce totas las deseadas: ");
        while(i < numeroNotas){
            if(!teclado.hasNextInt()){
                teclado.next();
            }else if((valorNotas = teclado.nextInt()) >=0 && valorNotas <=10){
                arrayNotas[numeroNotas] = valorNotas;
                i++;
                
            }
        
        }
        teclado.nextLine();
        System.out.println("fin del programa");
    }
    
}
