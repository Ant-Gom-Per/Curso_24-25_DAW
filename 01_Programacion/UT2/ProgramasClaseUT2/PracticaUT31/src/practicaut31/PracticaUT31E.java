package practicaut31;

import java.util.Scanner;

public class PracticaUT31E {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int quantitatNotes = 0, i = 0;
        double nota = 0d, mitjana = 0d, maxima = 0d;
        System.out.print("Quantes notes vols introduir? ");
        while (!teclat.hasNextInt() || (quantitatNotes = teclat.nextInt()) <= 0) {
            teclat.nextLine();
            System.out.print("Error. Introdueix una quantitat vàlida: ");
        }
        teclat.nextLine();

        double[] notes = new double[quantitatNotes];
        System.out.print("Introdueix les " + quantitatNotes + " notes separades per espais o salts de línia: ");
        while (i < quantitatNotes && nota != -1) {
            if (!teclat.hasNextDouble()) {
                teclat.next();
            }
            else if ((nota = teclat.nextDouble()) >= 0 && nota <= 10) {
                notes[i] = nota;
                if(nota > maxima) maxima = nota;
                mitjana += nota;
                i++;
            } 
        }
        teclat.nextLine();
        mitjana /= i;
        System.out.print("NOTES: ");
        for (int j = 0; j < i; j++) {
            System.out.printf(" %.2f ", notes[j]);
        }
        System.out.printf("\nNota mitjana: %.2f \nNota màxima: %.2f \n", mitjana, maxima);

        String suspesos, aprovats, notables, excelents;
        suspesos = aprovats = notables = excelents = "";
        for (int j = 0; j < i; j++) {
            if(notes[j] < 5) suspesos+="*";
            else if(notes[j] < 7) aprovats+="*";
            else if(notes[j] < 9) notables+="*";
            else excelents+="*";
        }
        
        System.out.println("\nGràfic de barres de les notes");
        System.out.println("-----------------------------");
        System.out.println("Suspès: " + suspesos);
        System.out.println("Aprovat: " + aprovats);
        System.out.println("Notable: " + notables);
        System.out.println("Excel·lent: " + excelents);

    }
}
