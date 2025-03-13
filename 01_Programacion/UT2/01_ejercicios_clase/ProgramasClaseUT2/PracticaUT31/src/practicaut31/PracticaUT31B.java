package practicaut31;

import java.util.Scanner;

public class PracticaUT31B {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int quantitatNotes = 0;
        double nota = 0d;
        int i = 0;
        System.out.print("Quantes notes vols introduir? ");
        while (!teclat.hasNextInt() || (quantitatNotes = teclat.nextInt()) <= 0) {
            teclat.nextLine();
            System.out.print("Error. Introdueix una quantitat vàlida: ");
        }
        teclat.nextLine();

        double[] notes = new double[quantitatNotes];
        System.out.print("Introdueix les " + quantitatNotes + " notes separades per espais o salts de línia: ");
        while (i < quantitatNotes && nota != -1) {          
            if(!teclat.hasNextDouble()){
                teclat.next();
            }
            else if ((nota = teclat.nextDouble()) >= 0 && nota <= 10) {
                notes[i] = nota;
                i++;
            }
        }
        teclat.nextLine();
        System.out.print("NOTES: ");
        for (int j = 0; j < i; j++) {
            System.out.print(notes[j] + " ");
        }
        System.out.println();
    }
}
