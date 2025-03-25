/*
 Crea un programa que solicite la base y la altura de un rectángulo, y luego calcule su área usando un método separado.
 */
package ra2_ejercicios;

import java.util.Scanner;

public class Ra2_ejercicios {

    public static void main(String[] args) {
                        
        Ra2_ejercicios programa = new Ra2_ejercicios();        
        programa.inicio();
        
    }
    
    public void inicio(){
        int areaTotal = AreaRectangulo(leerEntero(), leerEntero());
        System.out.println("El area es: "+ areaTotal);
        System.out.println("El area es: " + (parOimpar(areaTotal) ? "par" : "impar"));        
    }
    
    public int AreaRectangulo(int base, int altura){
        int areaResult = base * altura;
        return areaResult;
    }
    
    public boolean parOimpar(int numIntr){
        return numIntr % 2 == 0;
    }
    
    public int leerEntero(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce entero: ");
        int numEntero = teclado.nextInt();
        return numEntero;
    }
    
}
