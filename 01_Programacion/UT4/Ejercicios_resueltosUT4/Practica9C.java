import java.util.Scanner;

public class Practica9C{

    
    public static void main(String[] args){
        Practica9C programa = new Practica9C();
        programa.inicio();
    }

    public void inicio(){
        //imprimirAsteriscos(solicitarEnteroPositivo());
        System.out.println(factorial(4));
    }
   
    public int solicitarEnteroPositivo(){
        Scanner teclado = new Scanner(System.in);
        int entero;
        System.out.println("Introduce un entero positivo: ");
        if(!teclado.hasNextInt()) return solicitarEnteroPositivo();
        entero = teclado.nextInt();
        if(entero < 0) return solicitarEnteroPositivo();
        return entero;
    }
    public void imprimirAsteriscos(int numeroAsteriscos){
        for(int i=0; i<numeroAsteriscos; i++){
            System.out.print("*");
        }
    }

    public int factorial(int numero){
        int total = 1;
        for(int i=2; i<=numero; i++){
            total *= i;
        }
        return total;
    }

}