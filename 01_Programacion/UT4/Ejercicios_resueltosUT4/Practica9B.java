import java.util.Scanner;

public class Practica9B{

    
    public static void main(String[] args){
        Practica9B programa = new Practica9B();
        programa.inicio();
    }

    public void inicio(){
        imprimirAsteriscos(solicitarEnteroPositivo());
    }
   
    public int solicitarEnteroPositivo(){
        Scanner teclado = new Scanner(System.in);
        int entero;
        boolean leido = false;
        System.out.println("Introduce un entero positivo: ");
        while(!teclado.hasNextInt() || (entero = teclado.nextInt()) < 0){
            teclado.nextLine();
            System.out.println("Error, introduce un entero positivo: ");
        }
        teclado.nextLine();
        return entero;

    }
    public void imprimirAsteriscos(int numeroAsteriscos){
        for(int i=0; i<numeroAsteriscos; i++){
            System.out.print("*");
        }
    }

}