import java.util.Scanner;

public class UT31_PR32 {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);

        int quantitatNotes, posicioNota = 0;
        boolean eixir = false;

        double[] notes;

        System.out.print("Introdueix quantes notes vols llegir: ");

        while (!teclat.hasNextInt() || (quantitatNotes = teclat.nextInt()) < 0) {
            teclat.nextLine();
            System.out.print("ERROR. Introdueix quantes notes vols llegir: ");
        }

        teclat.nextLine();
        notes = new double[quantitatNotes];

        System.out.print("Introdueix les notes: ");

        while (posicioNota < quantitatNotes && !eixir) {
            if (!teclat.hasNextDouble()) {
                teclat.next();
            } else {
                notes[posicioNota] = teclat.nextDouble();
                if (notes[posicioNota] >= 0.0 && notes[posicioNota] <= 10.0) {
                    posicioNota++;
                }
                else if(notes[posicioNota] == -1){
                    eixir = true;
                }
            }
        }
        teclat.close();
        for (int i = 0; i < posicioNota; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notes[i]);
        }


    }
}