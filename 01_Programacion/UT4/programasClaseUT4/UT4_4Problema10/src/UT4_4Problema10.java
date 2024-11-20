
/*
Ejercicio 9 Ut 4_4
 */
public class UT4_4Problema10 {

    public static void main(String[] args) {
       UT4_4Problema10 programa = new UT4_4Problema10();
        programa.inicio();
        
    }
    
    public void inicio(){
        int[]elementos = {1, 2, 3, 4};
        modificar(elementos);
        for(int elemento : elementos){
            System.out.print(elemento +  " ");
        }
        System.out.println("");
    }
    
    public void modificar(int[] enteros){
        enteros[0] = 9;           
    }
    
}
