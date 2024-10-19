/*
Por Antonio Gomez Pérez
 */
import java.util.Scanner;
public class UT2Problema5 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        double valorNota = 0, sumaNota = 0, sumAprobado=0, sumSuspenso=0, notaMayor=0, notaMenor=11, menorNotAprobado =11, mayorNotSuspenso =0;
        int contAlumnos = 0, contAprobado = 0, contSuspenso = 0;
        
        System.out.println("----------------------------");
        System.out.println("--  ESTADÍSTICA DE NOTAS  --");
        System.out.println("----------------------------\n");
        
        while(valorNota >= 0){
                                
            System.out.print("Introduce una nota (valor negativo para salir): ");
            while(teclado.hasNextDouble() && (valorNota = teclado.nextDouble()) >=0 && valorNota <=10){
                teclado.nextLine();
                contAlumnos ++;
                sumaNota +=valorNota;
                if(valorNota >= 5){
                    contAprobado ++;
                    sumAprobado += valorNota;
                    if(notaMayor <= valorNota){
                        notaMayor = valorNota;
                    }                    
                    if(menorNotAprobado > valorNota){
                        menorNotAprobado = valorNota;
                    }
                }else{
                    contSuspenso ++;
                    sumSuspenso += valorNota;                    
                    if(notaMenor >= valorNota){
                        notaMenor = valorNota;
                    }
                    if(mayorNotSuspenso < valorNota){
                        mayorNotSuspenso = valorNota;
                    }
                }                
                System.out.print("Introduce una nota (valor negativo para salir): ");
            }
            if(valorNota < 0){
                teclado.nextLine();
            }else{
            System.out.println("ERROR!!, dato de nota no válido");
            teclado.nextLine();
            }
        }       
        if(contAlumnos == 0){
        System.out.println("\nNo se han introducido notas.");
        }else{
            System.out.println("\n- Se ha evaluado un total de " + contAlumnos + " alumnos.");
            double mediaNota = sumaNota / contAlumnos;
            System.out.printf("- La nota media del curso ha sido un %.2f \n", mediaNota);            
            double porceNotaApro = (100 * contAprobado)/contAlumnos;
            System.out.print("- Han aprobado " + contAprobado);
            System.out.printf(" alumnos, lo que supone el %.2f  del total \n", porceNotaApro);
            double mediAprobados = sumAprobado / contAprobado;
            if (contAprobado == 0){
                System.out.println("- La nota media de los alumnos aprobados no existe, por que no hay ningún aprobado.");
            }else{
                System.out.printf("- La nota media de los alumnos aprobados es de %.2f\n", mediAprobados);
            }            
            double porceNotaSuspe = (100 * contSuspenso)/contAlumnos;
            System.out.print("- Han suspendido " + contSuspenso);
            System.out.printf(" alumnos, lo que supone el %.2f del total \n", porceNotaSuspe);
            double mediSuspensos = sumSuspenso / contSuspenso;
            if (contSuspenso == 0){
                System.out.println("- La nota media de los alumnos suspensos no existe, por que no hay ningún suspendido.");
            }else{
                System.out.printf("- La nota media de los alumnos suspensos es de %.2f\n", mediSuspensos);
            }
            if(notaMayor != 0){
                System.out.printf("- La nota más alta ha sido %.2f \n", notaMayor);
            }else{
                System.out.printf("- La nota más alta ha sido %.2f \n", mayorNotSuspenso);
            }            
           if(notaMenor != 11){
                System.out.printf("- La nota más baja ha sido %.2f \n", notaMenor);
           }else{
               System.out.printf("- La nota más baja ha sido %.2f \n", menorNotAprobado);
           }            
        }       
    }
}