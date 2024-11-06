import java.util.Scanner;

public class EjercicioUT31_2 {


    public static void main(String[] args) {
        final int QUANTITAT_NUMEROS = 10;
        int[] vectorNumeros1 = new int[QUANTITAT_NUMEROS];
        int[] vectorNumeros2 = new int[QUANTITAT_NUMEROS];
        int[] vectorMescla = new int[QUANTITAT_NUMEROS * 2];
        int j = 0; // Índex per al vector mescla
        Scanner teclat = new Scanner(System.in);
        System.out.println("PRIMER VECTOR:");
        for(int i=0; i<QUANTITAT_NUMEROS; i++){
            System.out.print("Introdueix un enter: ");
            while (!teclat.hasNextInt()) {
                teclat.nextLine();
                System.out.print("ERROR. Introdueix un enter: ");
            }
            vectorNumeros1[i] = teclat.nextInt();
            teclat.nextLine();
        }

        System.out.println("SEGON VECTOR:");
        for(int i=0; i<QUANTITAT_NUMEROS; i++){
            System.out.print("Introdueix un enter: ");;
            while (!teclat.hasNextInt()) {
                teclat.nextLine();
                System.out.print("ERROR. Introdueix un enter: ");
            }
            vectorNumeros2[i] = teclat.nextInt();
            teclat.nextLine();
        }

        for(int i=0; i<QUANTITAT_NUMEROS; i++){
            vectorMescla[j] = vectorNumeros1[i];
            j++;
            vectorMescla[j] = vectorNumeros2[i];
            j++;
        }

        System.out.println("Has introduït els números ");
        for(int i = 0; i<vectorMescla.length;i++){
            System.out.print(vectorMescla[i]+" ");
        }
        System.out.println();
        teclat.close();
    }
}