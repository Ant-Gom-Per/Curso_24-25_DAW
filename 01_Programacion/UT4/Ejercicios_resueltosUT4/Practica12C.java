import java.util.Scanner;

public class Practica12C{

    
    public static void main(String[] args){
        Practica12C programa = new Practica12C();
        programa.inicio();
    }

    public void inicio(){
        int[] miArray = crearArrayEnteros(5);
        imprimirArray(miArray);
    }

    // NIVEL 1 
    // Crear un array de enteros de la cantidad deseada
    public int[] crearArrayEnteros(int cantidad){
        int[] array = new int[cantidad];
        for(int i=0; i<cantidad; i++){
            array[i] = leerEntero(i);
        }
        return array;
    }

    // NIVEL 2 
    // Leer entero correcto por teclado
    public int leerEntero(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un entero: ");
        while(!teclado.hasNextInt()){
            teclado.nextLine();
            System.out.print("ERROR. Introduce un entero válido: ");
        }
        return teclado.nextInt();
    
    }

    //  Leer un entero indicando primero un índice.
    public int leerEntero(int pos){
        System.out.print("["+pos+"] ");
        return leerEntero();
    }

    // Imprimir array de enteros por pantalla
    public void imprimirArray(int[] array){
        System.out.println("- - - - - - - - - - - - -");
        for(int i=0; i<array.length; i++){
            System.out.println("Elemento "+(i+1)+": "+array[i]);
        }
        System.out.println("- - - - - - - - - - - - -");
    }

}