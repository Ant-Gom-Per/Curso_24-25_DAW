
import java.util.Scanner;

/**
 * Implementació del joc de cartes "Set i Mig". Aquest joc és similar al
 * Blackjack però es juga amb la baralla espanyola i l'objectiu és aconseguir
 * una puntuació el més propera possible a 7.5 sense passar-se.
 *
 * <p>
 * Regles bàsiques:</p>
 * <ul>
 * <li>Les cartes de l'1 al 7 valen el seu valor nominal</li>
 * <li>Les figures (Sota, Cavall i Rei) valen 0.5 punts</li>
 * <li>Es juga amb 2 o més jugadors</li>
 * <li>Guanya qui s'aprope més a 7.5 sense passar-se</li>
 * </ul>
 *
 * @author Jose R. Mas
 * @version 2.0
 */
public class SetIMig {

    // Constants del joc
    private static final double PUNTUACIO_OBJECTIU = 7.5;
    private static final double VALOR_FIGURA = 0.5;
    private static final int MINIM_JUGADORS = 2;
    private static final int NUM_PALS = 4;
    private static final int CARTES_PER_PAL = 10;
    private static final int SOTA = 7;
    private static final int CAVALL = 8;
    private static final int REI = 9;

    private Scanner teclat = new Scanner(System.in);

    /**
     * Mètode principal que inicia el joc.
     *
     * @param args arguments de línia de comandaments (no utilitzats)
     */
    public static void main(String[] args) {
        SetIMig programa = new SetIMig();
        programa.inici();
    }

    /**
     * Inicialitza i controla el flux principal del joc.
     *
     * Exemple d'ús: null     {@code
     * SetIMig joc = new SetIMig();
     * joc.inici();
     * }
     */
    public void inici() {
        int[][] baralla = new int[NUM_PALS][CARTES_PER_PAL];
        int jugadors = demanaJugadors();
        double[] puntuacio = new double[jugadors];

        System.out.println("\n=== BENVINGUTS AL JOC DEL SET I MIG ===\n");

        for (int i = 1; i <= jugadors; i++) {
            puntuacio[i - 1] = jugar(baralla, i);
        }

        mostrarResultats(puntuacio);
        teclat.close();
    }

    /**
     * Sol·licita i valida el nombre de jugadors.
     *
     * @return nombre de jugadors validat (mínim 2)
     */
    public int demanaJugadors() {
        int resultat = 0;
        System.out.println("=== CONFIGURACIÓ DEL JOC ===");
        System.out.print("Introdueix el nombre de jugadors (mínim " + MINIM_JUGADORS + "): ");

        while (!teclat.hasNextInt() || (resultat = teclat.nextInt()) < MINIM_JUGADORS) {
            System.out.print("ERROR! El nombre ha de ser major o igual a " + MINIM_JUGADORS + ": ");
            teclat.nextLine();
        }
        teclat.nextLine();
        return resultat;
    }

    /**
     * Gestiona el torn d'un jugador específic.
     *
     * @param baralla matriu que representa la baralla de cartes
     * @param jugador número del jugador actual
     * @return puntuació final del jugador
     */
    public double jugar(int[][] baralla, int jugador) {
        double punts = 0.0;
        System.out.println("\n=== TORN DEL JUGADOR " + jugador + " ===\n");

        do {
            repartirCarta(baralla, jugador);
            punts = obtindrePunts(baralla, jugador);

            if (punts == PUNTUACIO_OBJECTIU) {
                System.out.println("¡¡Perfecte!! Has aconseguit " + PUNTUACIO_OBJECTIU + " punts");
                break;
            } else if (punts > PUNTUACIO_OBJECTIU) {
                System.out.println("Ohhh! T'has passat amb " + punts + " punts :(");
                break;
            }

            System.out.println("Puntuació actual: " + punts + " punts");
        } while (!etPlantes());

        if (punts <= PUNTUACIO_OBJECTIU) {
            System.out.println("T'has plantat amb " + punts + " punts");
        }
        return punts;
    }

    /**
     * Reparteix una carta aleatòria al jugador especificat.
     *
     * @param baralla matriu que representa la baralla de cartes
     * @param jugador número del jugador que rep la carta
     */
    public void repartirCarta(int[][] baralla, int jugador) {
        int pal, carta;
        do {
            pal = (int) (Math.random() * NUM_PALS);
            carta = (int) (Math.random() * CARTES_PER_PAL);
        } while (baralla[pal][carta] != 0);

        baralla[pal][carta] = jugador;
        mostrarCarta(pal, carta);
    }

    /**
     * Mostra la carta repartida en format llegible.
     *
     * @param pal número que representa el pal (0=Ors, 1=Espases, 2=Bastos,
     * 3=Copes)
     * @param carta número que representa la carta (0-6=valor+1, 7=Sota,
     * 8=Cavall, 9=Rei)
     */
    public void mostrarCarta(int pal, int carta) {
        String resultat = "Ha eixit: ";

        // Determinar el valor de la carta
        switch (carta) {
            case SOTA:
                resultat += "Sota";
                break;
            case CAVALL:
                resultat += "Cavall";
                break;
            case REI:
                resultat += "Rei";
                break;
            default:
                resultat += (carta + 1);
                break;
        }

        // Determinar el pal
        switch (pal) {
            case 0:
                resultat += " d'Ors";
                break;
            case 1:
                resultat += " d'Espases";
                break;
            case 2:
                resultat += " de Bastos";
                break;
            case 3:
                resultat += " de Copes";
                break;
        }

        System.out.println(resultat);
    }

    /**
     * Calcula la puntuació total d'un jugador.
     *
     * @param baralla matriu que representa la baralla de cartes
     * @param jugador número del jugador
     * @return puntuació total del jugador
     */
    public double obtindrePunts(int[][] baralla, int jugador) {
        double acumulador = 0.0;
        for (int i = 0; i < baralla.length; i++) {
            for (int j = 0; j < baralla[i].length; j++) {
                if (baralla[i][j] == jugador) {
                    acumulador += (j < 7) ? (j + 1) : VALOR_FIGURA;
                }
            }
        }
        return acumulador;
    }

    /**
     * Pregunta al jugador si vol plantar-se i valida la resposta.
     *
     * @return true si el jugador es planta, false si vol continuar
     */
    public boolean etPlantes() {
        String resposta;
        do {
            System.out.print("Et plantes? (s/n): ");
            resposta = teclat.nextLine().trim().toLowerCase();
            if (!resposta.equals("s") && !resposta.equals("n")) {
                System.out.println("ERROR! Has de respondre 's' o 'n'");
            }
        } while (!resposta.equals("s") && !resposta.equals("n"));

        return resposta.equals("s");
    }

    /**
     * Mostra els resultats finals del joc i determina el guanyador.
     *
     * @param puntuacio array amb les puntuacions finals de cada jugador
     */
    public void mostrarResultats(double[] puntuacio) {
        boolean empat = false;
        double maxima = 0.0;
        String guanyadors = "";

        System.out.println("\n=== PUNTUACIÓ FINAL ===");

        for (int i = 0; i < puntuacio.length; i++) {
            System.out.print("Jugador " + (i + 1) + ": ");
            if (puntuacio[i] > 7.5) {
                System.out.println("S'HA PASSAT (" + puntuacio[i] + " punts)");
            } else {
                System.out.println(puntuacio[i] + " punts");
                if (puntuacio[i] > maxima) {
                    maxima = puntuacio[i];
                    empat = false;
                    guanyadors = "Jugador " + (i + 1);
                } else if (puntuacio[i] == maxima) {
                    empat = true;
                    guanyadors += ", Jugador " + (i + 1);
                }
            }
        }

        System.out.println("\n=== RESULTAT FINAL ===");
        if (maxima == 0.0) {
            System.out.println("NO HI HA GUANYADOR - Tots els jugadors s'han passat!");
        } else if (empat) {
            System.out.println("HI HA EMPAT!");
            System.out.println("Els jugadors " + guanyadors
                    + " han empatat amb " + maxima + " punts");
        } else {
            System.out.println("HA GUANYAT EL " + guanyadors + "!");
            System.out.println("Ha aconseguit " + maxima + " punts");
        }
    }
}
