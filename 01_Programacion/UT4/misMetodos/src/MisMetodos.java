
import java.util.Scanner;

/**
 *
 * @author antonio
 */
public class MisMetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MisMetodos programa = new MisMetodos();
        programa.inicio();
    }
    /**
     * Este metodo cordina al resto
     */
    public void inicio(){
        int[] arrayEnteros = {1,2,3,4,5};
        System.out.println("metSuma: " + metSuma(6,2));
        System.out.println("metResta: " + metResta(6,2));
        System.out.println("metMulti: " + metMulti(6, 2));
        System.out.println("metDivi: " + metDivi(6, 2));
        System.out.println("metMod: " + metMod(6, 2));
        System.out.println("leerEntero: " + leerEntero());
        System.out.println("valMax: " + valMax(arrayEnteros));
    }
    
     /**
     * Pide un número entero por teclado.
     * @return Devuelve el valor introducido por teclado.
     */
    public int leerEntero(){
        Scanner teclado = new Scanner(System.in);
        int numEnt = 0;
        System.out.print("Introduce un número entero: ");
        while(!teclado.hasNextInt()){
            teclado.nextLine();
            System.out.println("Error, dato no válido.");
            System.out.println("Inttroduce un número entero: ");            
        }
        numEnt = teclado.nextInt();
        teclado.nextLine();
        return numEnt;
    }
    
    /**
     * Efectua la suma de dos valores.
     * @param valor1
     * @param valor2
     * @return 
     */
    public int metSuma(int valor1,  int valor2){
        int numTot = valor1 + valor2;
        return numTot;
    }
    
    /**
     * Efectua la resta de dos valores.
     * @param valor1
     * @param valor2
     * @return 
     */
    public int metResta( int valor1, int valor2){
        int numTot  = valor1 - valor2;
        return numTot;
    }
    
    /**
     * Efectua la multiplicación de dos valores.
     * @param valor1
     * @param valor2
     * @return 
     */
    public int metMulti(int valor1, int valor2){
        int numTot = valor1 * valor2;
        return numTot;
    }
    
    /**
     * Efectua la división de dos valores.
     * @param valor1
     * @param valor2
     * @return 
     */
    public int metDivi(int valor1, int valor2){
        int numTot = valor1 / valor2;
        return numTot;
    }
     /**
      * Efectua el módulo de dos valores.
      * @param valor1
      * @param valor2
      * @return 
      */
    public int metMod(int valor1, int valor2){
        int numTot = valor1 % valor2;
        return numTot;
    }
    
   
    
    public int valMax(int[] valores1){
        int numMax= valores1[0];
        for(int valor : valores1){
            numMax = valor > numMax ? valor : numMax;
        }
        return numMax;
    }
    
}
