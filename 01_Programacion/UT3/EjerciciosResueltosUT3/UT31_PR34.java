import java.util.Scanner;

public class UT31_PR34 {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);

        int quantitatNotes, posicioNota = 0, posicioTrobada = -1;
        boolean eixir = false;

        double[] notes;
        double nota = 0, maxima = 0, mitjana = 0;
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
                } else if (notes[posicioNota] == -1) {
                    eixir = true;
                }
            }
        }

        mitjana /= posicioNota;
        for (int i = 0; i < posicioNota; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notes[i]);
        }
        System.out.printf("La nota màxima és un %.2f\n", maxima);
        System.out.printf("La nota mitjana és un %.2f\n", mitjana);

        eixir = false;
        while (!eixir) {
            System.out.print("\nIntrodueix nota a buscar: ");
            if (teclat.hasNextDouble()) {
                nota = teclat.nextDouble();
                if (nota >= 0.0 && nota <= 10.0) {
                    eixir = true;
                }
            } else {
                teclat.nextLine();
            }
        }

        for (int j = 0; j < posicioNota; j++) {
            if (nota == notes[j]) {
                posicioTrobada = j;
                break;
            }
        }

        if (posicioTrobada == -1) {
            System.out.println("La nota " + nota + " no s'ha trobat");
        } else {
            System.out.println("S'ha trobat la nota " + nota + " en la posició " + (posicioTrobada + 1));
        }
        teclat.close();

    }
}