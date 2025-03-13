import java.util.Scanner;

public class CifraAcifra {
    
    public static void main(String[]args){
        
        Scanner teclado = new Scanner(System.in);
        
        int numero, resto;
        
        System.out.print("Introduce un número: ");
        numero= teclado.nextInt();
        while(numero != 0){
            resto = numero % 10;
            numero = numero /10;
            System.out.println("cifra " + resto);
        }
        
    } 
}