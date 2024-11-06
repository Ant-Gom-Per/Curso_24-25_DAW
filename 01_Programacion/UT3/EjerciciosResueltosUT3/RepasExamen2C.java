import java.util.Scanner;

public class RepasExamen2C {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int n = 0;
        System.out.print("Introdueix N: ");
        while (!teclat.hasNextInt() || (n = teclat.nextInt()) < 1) {
            teclat.nextLine();
            System.out.print("ERROR. Introdueix N: ");
        }
        teclat.nextLine();
        char lletra;
        for (int i = 0; i < n; i++) {
            lletra = i % 2 == 0 ? '+' : '-';
            for(int j = 0; j < n; j++){
                System.out.print(lletra);
                lletra = lletra == '+' ? '-' : '+';
            }
            System.out.println();
        }
        teclat.close();

    }
}
