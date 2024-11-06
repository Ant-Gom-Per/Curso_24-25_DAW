import java.util.Scanner;

public class EjercicioUT31_4 {


    public static void main(String[] args) {
        final int QUANTITAT_NUMEROS = 10;
        int[] vectorNumeros = new int[QUANTITAT_NUMEROS];
        int anterior,actual;
        Scanner teclat = new Scanner(System.in);
        
        for(int i=0; i<QUANTITAT_NUMEROS; i++){
            System.out.print("Introdueix un enter: ");
            while (!teclat.hasNextInt()) {
                teclat.nextLine();
                System.out.print("ERROR. Introdueix un enter:: ");
            }
            vectorNumeros[i] = teclat.nextInt();
            teclat.nextLine();
        }
        teclat.close();
        anterior = vectorNumeros[0];
        vectorNumeros[0] = vectorNumeros[QUANTITAT_NUMEROS-1];

        for(int i = 1; i<vectorNumeros.length; i++){
            actual = vectorNumeros[i];
            vectorNumeros[i] = anterior;
            anterior = actual;     

        }
        System.out.println("Has introduït els números: ");
        for(int i = 0; i<vectorNumeros.length;i++){
            System.out.print(vectorNumeros[i]+" ");
        }
    }
}