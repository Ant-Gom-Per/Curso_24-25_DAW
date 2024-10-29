package practicaut31;

import java.util.Scanner;

public class PracticaUT31D {

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
       
        System.out.print("\nIntrodueix una nota a buscar: ");
        while (!teclat.hasNextDouble() || (nota = teclat.nextDouble()) < 0 || nota > 10) {
            teclat.nextLine();
            System.out.print("Error. Introdueix nota vàlida [0-10]: ");
        }
        boolean trobada = false;
        for (int j = 0; !trobada && j < i; j++) {
            if(nota == notes[j]){
                trobada = true;
                System.out.printf("La nota %.2f es troba en la %da posició.\n", nota, j+1);
            }
        }
        if(!trobada) System.out.printf("La nota %.2f no existeix.\n", nota);
        
    }
}
