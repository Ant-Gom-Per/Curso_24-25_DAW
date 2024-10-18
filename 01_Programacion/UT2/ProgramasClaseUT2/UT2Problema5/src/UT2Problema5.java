/*
Por Antonio Gomez Pérez
 */
import java.util.Scanner;
public class UT2Problema5 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        double valorNota, sumaNota=0, sumAprobado=0, sumSuspenso=0;
        int contAlumnos = 0, contAprobado = 0, contSuspenso = 0;
        System.out.print("Introduce un valor: ");       
        
        while(teclado.hasNextDouble() && (valorNota = teclado.nextDouble()) >=0 && valorNota <=10){       
            teclado.nextLine();
            contAlumnos ++;
            sumaNota += valorNota; 
            if(valorNota >= 5){
                contAprobado ++;
                sumAprobado += valorNota;
            }else{
                contSuspenso ++;
                sumSuspenso += valorNota;
            }            
            System.out.print("Introduce un valor: ");
           
        }
        System.out.println("\nSiguiente parte.");
        System.out.println("Numero de alumnos " + contAlumnos);
        System.out.println("Media de notas " + sumaNota / contAlumnos);
        System.out.println("Numero de aprobados " + contAprobado);
        System.out.println("Porcentaje aprobados: " + (100 * contAprobado)/contAlumnos);
        System.out.println("Media de Aprobados " +  sumAprobado / contAprobado);
        System.out.println("Numero de suspensos " + contSuspenso);
        System.out.println("Porcentaje Suspensos: " + (100 * contSuspenso)/contAlumnos);        
        System.out.println("Media de suspensos " +  sumSuspenso /contSuspenso);
    }
    
}
