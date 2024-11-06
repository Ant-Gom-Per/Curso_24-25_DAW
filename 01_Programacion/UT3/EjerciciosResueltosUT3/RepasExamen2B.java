import java.util.Scanner;

public class RepasExamen2B {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int n = 0;
        System.out.print("Introdueix N: ");
        while (!teclat.hasNextInt() || (n = teclat.nextInt()) < 1) {
            teclat.nextLine();
            System.out.print("ERROR. Introdueix N: ");
        }
        teclat.nextLine();
        boolean signe;
        for (int i = 0; i < n; i++) {
            signe = i % 2 == 0 ? true : false;
            for(int j = 0; j < n; j++){
                System.out.print(signe ? '+' : '-');
                signe = !signe;
            }
            System.out.println();
        }
        teclat.close();

    }
}
