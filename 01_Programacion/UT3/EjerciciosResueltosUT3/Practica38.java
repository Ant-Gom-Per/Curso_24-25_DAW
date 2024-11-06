import java.util.Scanner;
public class Practica38{
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int files, columnes;
        int[][] matriu;
        System.out.print("Introdueix el nombre de files: ");
        files = teclat.nextInt();
        teclat.nextLine();
        System.out.print("Introdueix el nombre de columnes: ");
        columnes = teclat.nextInt();
        teclat.nextLine();

        matriu = new int[files][columnes];

        for(int i=0; i<matriu.length; i++){
            for(int j=0; j<matriu[i].length; j++){
                matriu[i][j] = i + j;
            }
        }

        for(int i=0; i<matriu.length; i++){
            for(int j=0; j<matriu[i].length; j++){
                System.out.print(matriu[i][j] + " ");
            }
            System.out.println();
        }

        teclat.close();
    }
}