import java.util.Scanner;

public class UT31_PR33 {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);

        int quantitatNotes, posicioNota = 0;
        boolean eixir = false;

        double[] notes;
        double maxima = 0, mitjana = 0;
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
                    mitjana += notes[posicioNota];
                    maxima = (notes[posicioNota] > maxima) ? notes[posicioNota] : maxima;
                    posicioNota++;
                }
                else if(notes[posicioNota] == -1){
                    eixir = true;
                }
            }
        }
        teclat.close();
        mitjana /= posicioNota;
        for (int i = 0; i < posicioNota; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notes[i]);
        }
        System.out.printf("La nota màxima és un %.2f\n", maxima);
        System.out.printf("La nota mitjana és un %.2f\n", mitjana);


    }
}