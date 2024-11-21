import java.util.Scanner;

public class Practica12B{

    
    public static void main(String[] args){
        Practica12B programa = new Practica12B();
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
    public int leerEntero(int indice){
        Scanner teclado = new Scanner(System.in);
        System.out.print(indice+" Introduce un entero: ");
        while(!teclado.hasNextInt()){
            teclado.nextLine();
            System.out.print("ERROR. Introduce un entero válido: ");
        }
        return teclado.nextInt();
    
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