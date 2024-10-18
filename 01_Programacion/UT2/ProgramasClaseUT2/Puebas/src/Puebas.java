/*
Por Antonio Gomez Pérez
 */
import java.util.Scanner;
public class Puebas {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        double valorNota = 0, sumaNota = 0, sumAprobado = 0, sumSuspenso = 0;
        int contAlumnos = 0, contAprobado = 0, contSuspenso = 0;
        
        while(valorNota >= 0){
           System.out.print("Introduce un valor: ");
           while(!teclado.hasNextDouble() || (valorNota = teclado.nextDouble()) >=0 && valorNota <=10){       
           teclado.nextLine();
           if(valorNota >=0 && valorNota <=10){
            System.out.println("nota" + valorNota);
            System.out.print("Introduce un valor1: ");
           }else{
            System.out.print("Introduce un valor2: ");
            }
        }
        System.out.println("\nSiguiente parte.");
    }
}
}