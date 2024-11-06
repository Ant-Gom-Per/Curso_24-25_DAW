import java.util.Scanner;

public class RepasExamen3 {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int n = 0;
        System.out.println("Introdueix N: ");
        while (!teclat.hasNextInt() || (n = teclat.nextInt()) < 1) {
            teclat.nextLine();
            System.out.println("ERROR. Introdueix N: ");
        }
        teclat.nextLine();
        //int comptador = 0;
        int[][] matriu = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriu[i][j] = (i * n) + (j + 1);
                //matriu[i][j] = ++comptador;
            }
        }

        Matrius.imprimirMatriu(matriu);
        teclat.close();
    }
}
