/*
Autor:Antonio Gómez Pérez
Este programa resuelve una ecuacion de dos incognitas por el metodo de Cramer
 */

public class UT1Problema4 {

    public static void main(String[] args) {
        
        double determinante, determinanteX, determinanteY, valorX, valorY, pruebaY1, pruebaY2;
        
        System.out.println("SISTEMAS DE EQUACIONES LINEALES");
        System.out.println("-------------------------------");
        System.out.println("3,4x + 50,2y = 44,5");
        System.out.println("2,1x + 0,55y =  5,9\n");
        
        determinante = (3.4 * 0.55) - (2.1 * 50.2);
        determinanteX = (44.5 * 0.55) - (5.9 * 50.2);
        determinanteY = (3.4 * 5.9) - (2.1 * 44.5);
        valorX = determinanteX / determinante;
        valorY = determinanteY / determinante;
        pruebaY1 = (5.9 - (2.1 * valorX)) / 0.55;
        pruebaY2 = (44.5 - (3.4 * valorX)) / 50.2;
        
        System.out.println("SOLUCIÓN POR CRAMER");
        System.out.println("-------------------");
        System.out.printf("X = %.2f\n", valorX);
        System.out.printf("X = %.2f\n\n", valorY);
        System.out.println("COMPROBACIÓN DADA LA X");
        System.out.println("----------------------");
        System.out.printf("Y = %.2f\n", pruebaY1);
        System.out.printf("Y = %.2f\n", pruebaY2);
    }
    
}
