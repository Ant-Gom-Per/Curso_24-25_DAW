import java.util.Scanner;

public class UT33_ej5b {
    public static void main(String[] args) {
        int[][] divisions = new int[0][4];
        int[][] aux;
        int dividend;
        Scanner teclat = new Scanner(System.in);
        System.out.println("Introdueix les divisions: ");
        // Introducció de dades en matriu "divisions" (versió sense break)
        do {
            aux = divisions;
            dividend = teclat.nextInt();
            if (dividend != -1) {
                // Es crea un array amb una fila més, i copiem el contingut de l'array anterior
                divisions = new int[aux.length + 1][4];
                for (int i = 0; i < aux.length; i++) {
                    for (int j = 0; j < aux[i].length; j++) {
                        divisions[i] = aux[i];
                    }
                }
                divisions[aux.length][0] = dividend;
                divisions[aux.length][1] = teclat.nextInt();
                divisions[aux.length][2] = teclat.nextInt();
                divisions[aux.length][3] = teclat.nextInt();
            }
        } while (dividend != -1);

        // Imprimim els resultats
        System.out.println();
        for (int i = 0; i < divisions.length; i++) {
            System.out.println(
                    (divisions[i][1] * divisions[i][2] + divisions[i][3] == divisions[i][0]) ? "correcte" : "error");
            // Cas problemàtic: 8 4 1 4
            // Altra opció
            // System.out.println((divisions[i][0] / divisions[i][1] == divisions[i][2] &&
            // divisions[i][0] % divisions[i][1] == divisions[i][3] ) ? "correcte" : "error"
            // );
            // Cas problemàtic: 8 0 1 4

        }
        teclat.close();
    }
}
