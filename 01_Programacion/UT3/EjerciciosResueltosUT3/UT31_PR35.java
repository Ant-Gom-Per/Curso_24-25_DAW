import java.util.Scanner;

public class UT31_PR35 {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        String excelents = "", notables = "", aprovats = "", suspesos = "";
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

                    if (notes[posicioNota] >= 9)
                        excelents += "*";
                    else if (notes[posicioNota] >= 7)
                        notables += "*";
                    else if (notes[posicioNota] >= 5)
                        aprovats += "*";
                    else
                        suspesos += "*";

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

        System.out.println("GRÀFIC DE BARRES DE LES NOTES: ");
        System.out.println("------------------------------ ");
        System.out.println("Suspès:\t\t" + suspesos);
        System.out.println("Aprovat:\t" + aprovats);
        System.out.println("Notable:\t" + notables);
        System.out.println("Excel·lent:\t" + excelents);
        teclat.close();

    }
}