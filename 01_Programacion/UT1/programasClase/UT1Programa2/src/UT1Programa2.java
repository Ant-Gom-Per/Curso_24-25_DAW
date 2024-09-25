/*
Autor: Antonio Gómez Pérez
Este programa nos muestra un incremento de la población de un país en el periodo de cinco años.
 */
import java.util.Scanner;

public class UT1Programa2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double datoNacimientosAnyo, datoInmigrantesAnyo, datoMuertesAnyo, poblacionTotal; 
        final int POBLACIONINICIAL = 312032486;
        double segundosAnyo = ((365 * 24) * 60) * 60;
        double nacimientosAnyo = segundosAnyo / 7;
        double muertesAnyo = segundosAnyo / 13;
        double inmigrantesAnyo = segundosAnyo /45;
        double incrementoAnual = (nacimientosAnyo + inmigrantesAnyo) - muertesAnyo;
        
        System.out.println("PROYECCION DE LA POBLACIÓN DE LOS EUA");
        System.out.println("-------------------------------------");
        System.out.println("\tAño actual " + POBLACIONINICIAL + " personas");
        poblacionTotal = POBLACIONINICIAL + incrementoAnual;
        System.out.printf("\tAño 2025 %.0f personas\n", poblacionTotal);
        poblacionTotal =  poblacionTotal + incrementoAnual;
        System.out.printf("\tAño 2026 %.0f personas\n", poblacionTotal);
        poblacionTotal =  poblacionTotal + incrementoAnual;
        System.out.printf("\tAño 2027 %.0f personas\n", poblacionTotal);
        poblacionTotal =  poblacionTotal + incrementoAnual;
        System.out.printf("\tAño 2028 %.0f personas\n", poblacionTotal);
        poblacionTotal =  poblacionTotal + incrementoAnual;
        System.out.printf("\tAño 2029 %.0f personas\n", poblacionTotal);
        System.out.println(" ");
        
        
        // A patir de aquí empieza la parte opciónal 
        
        System.out.print("¿Cada cuantos segundos se produce un nacimiento en el país? ");
        datoNacimientosAnyo = teclado.nextInt();
        teclado.nextLine();       
        System.out.print("¿Cada cuantos segundos se recibe un inmigrante en el país? ");
        datoInmigrantesAnyo = teclado.nextInt();
        teclado.nextLine(); 
        System.out.print("¿Cada cuantos segundos muere una persona en el país? ");
        datoMuertesAnyo = teclado.nextInt();
        teclado.nextLine(); 
        System.out.println(" ");
            
        nacimientosAnyo = segundosAnyo / datoNacimientosAnyo;
        muertesAnyo = segundosAnyo / datoMuertesAnyo;
        inmigrantesAnyo = segundosAnyo / datoInmigrantesAnyo;
        incrementoAnual = (nacimientosAnyo + inmigrantesAnyo) - muertesAnyo;
        
        System.out.println("PROYECCION DE LA POBLACIÓN DE LOS EUA");
        System.out.println("-------------------------------------");
        System.out.println("\tAño actual " + POBLACIONINICIAL + " personas");
        poblacionTotal = POBLACIONINICIAL + incrementoAnual;
        System.out.printf("\tAño 2025 %.0f personas\n", poblacionTotal);
        poblacionTotal =  poblacionTotal + incrementoAnual;
        System.out.printf("\tAño 2026 %.0f personas\n", poblacionTotal);
        poblacionTotal =  poblacionTotal + incrementoAnual;
        System.out.printf("\tAño 2027 %.0f personas\n", poblacionTotal);
        poblacionTotal =  poblacionTotal + incrementoAnual;
        System.out.printf("\tAño 2028 %.0f personas\n", poblacionTotal);
        poblacionTotal =  poblacionTotal + incrementoAnual;
        System.out.printf("\tAño 2029 %.0f personas\n", poblacionTotal);
        teclado.close();
    }
    
}
