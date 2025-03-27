/*
En Java, los tipos primitivos (int, double, boolean, etc.) se pasan por valor,
lo que significa que se copia su contenido y no se modifica la variable original.
 */
package ra2_ejercicios;

public class Ra2_ejer_pasoPorValor {

    public static void main(String[] args) {
        
        Ra2_ejer_pasoPorValor programa = new Ra2_ejer_pasoPorValor();
        programa.inicio();
    }
    
    public void inicio(){
        int numEnt = 10;
        System.out.println("Antes de llamar a la función: " + numEnt);
        cambValor(numEnt);
        System.out.println("Después de llamar a la función: " + numEnt);        
    }
    
    public void cambValor(int numEnt2){
        numEnt2 = numEnt2 * 3;
        System.out.println("Entro de la función: " + numEnt2);
    }
    
}
