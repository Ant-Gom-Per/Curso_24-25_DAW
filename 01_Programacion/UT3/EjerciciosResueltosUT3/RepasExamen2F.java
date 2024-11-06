import java.util.Scanner;

public class RepasExamen2F {
    public static void main(String[] args) {
        
        Scanner teclat = new Scanner(System.in);
        int n = 0;
        System.out.print("Introdueix N: ");
        while (!teclat.hasNextInt() || (n = teclat.nextInt()) < 1) {
            teclat.nextLine();
            System.out.print("ERROR. Introdueix N: ");
        }
        teclat.nextLine();
  
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    System.out.print(j%2==0 ? "+" : "-");
                } else {
                    System.out.print(j%2==0 ? "-" : "+");
                }
            }
            System.out.println();
        }
        teclat.close();

    }
}
