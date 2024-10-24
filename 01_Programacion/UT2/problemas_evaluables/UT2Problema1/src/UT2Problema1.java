/*
Por Antonio Gómez Pérez
Este programa nos calcula el % de impuestos a pagar según lo que cobremos al año.
 */
import java.util.Scanner;

public class UT2Problema1 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        double  sueldoAnual, totalPagar;
        int sueldoMensual, impuestos, ayuda;
        
        System.out.println("Calculadora de impuestos");
        System.out.println("------------------------");
        System.out.print("Introduce tu sueldo bruto mensual en euros: ");
        sueldoMensual = teclado.nextInt();
        teclado.nextLine();
        sueldoAnual = sueldoMensual * 12;
        teclado.close();
        
        if(sueldoMensual <= 0){
            System.out.println("\nERROR!!, dato no válido.");
        }else{
            if(sueldoAnual > 40000){
                impuestos = 30;
            }else if (sueldoAnual >= 10000 && sueldoAnual <= 40000){
                impuestos = 20;
            }else{
                impuestos = 0;
            }
            System.out.printf("\nTu sueldo anual es de %.2f €", sueldoAnual);
            totalPagar = (impuestos * sueldoAnual) / 100;
            if(sueldoAnual <= 15000){
                ayuda = 1500;
                System.out.printf("\nTe toca pagar %.2f € y recibes una ayuda de %d €\n", totalPagar, ayuda);
            }else{
                System.out.printf("\nTe toca pagar %.2f € y no recibes ninguna ayuda.\n",totalPagar );
            }            
        }       
    }    
}
