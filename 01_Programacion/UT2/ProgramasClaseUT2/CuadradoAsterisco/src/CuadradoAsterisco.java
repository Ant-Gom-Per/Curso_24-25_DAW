/*
Ejercicio 6 ejercicios no evaluables UT2.3
 */

/**
 *
 * @author Antonio
 */
public class CuadradoAsterisco {

    public static void main(String[] args) {
        char ascii = 65;
       
        for(int i=0 ; i<5 ; i++){
            for(int j=0 ; j<=5 ; j++){
               System.out.print("*");
                
            }
            System.out.println();
        }
        
        // Cuadrado con caracteres ASCII
        System.out.println("");
        for(int i=0 ; i<5 ; i++){
            for(int j=0 ; j<=5 ; j++){
               System.out.print(ascii);
               ascii++;
                
            }
            System.out.println();
        }
    }
    
}
