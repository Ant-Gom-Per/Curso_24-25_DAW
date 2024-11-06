import java.util.Scanner;

public class EjercicioUT31_4B {


    public static void main(String[] args) {
        final int QUANTITAT_NUMEROS = 10;
        int[] vectorNumeros = new int[QUANTITAT_NUMEROS];
        Scanner teclat = new Scanner(System.in);
        
        for(int i=0; i<QUANTITAT_NUMEROS; i++){
            System.out.print("Introdueix un enter: ");
            while (!teclat.hasNextInt()) {
                teclat.nextLine();
                System.out.print("ERROR. Introdueix un enter: ");
            }
            vectorNumeros[i] = teclat.nextInt();
            teclat.nextLine();
        }
        teclat.close();

		int aux = vectorNumeros[vectorNumeros.length - 1];
			
		for (int i = vectorNumeros.length - 2; i >= 0; i--) {
			vectorNumeros[i + 1] = vectorNumeros[i];
		}

        vectorNumeros[0] = aux;
        
        System.out.println("Has introduït els números: ");
        for(int i = 0; i<vectorNumeros.length;i++){
            System.out.print(vectorNumeros[i]+" ");
        }
    }
}