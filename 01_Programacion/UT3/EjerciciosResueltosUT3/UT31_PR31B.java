import java.util.Scanner;

public class UT31_PR31B {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);

        int quantitatNotes, i = 0;

        double[] notes;

        System.out.print("Introdueix quantes notes vols llegir: ");

        while (!teclat.hasNextInt() || (quantitatNotes = teclat.nextInt()) < 0) {
            teclat.nextLine();
            System.out.print("ERROR. Introdueix quantes notes vols llegir: ");
        }

        teclat.nextLine();
        notes = new double[quantitatNotes];

        System.out.print("Introdueix les notes: ");

        while (i < quantitatNotes) {
            if (!teclat.hasNextDouble()) {
                teclat.next();
            } else {
                notes[i] = teclat.nextDouble();
                if (notes[i] >= 0.0 && notes[i] <= 10.0) {
                    i++;
                }
            }
        }
        teclat.close();
        for (i = 0; i < quantitatNotes; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notes[i]);
        }


    }
}