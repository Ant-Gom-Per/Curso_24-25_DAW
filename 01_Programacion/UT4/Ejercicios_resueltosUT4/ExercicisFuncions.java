import java.util.Scanner;

public class ExercicisFuncions {
    private static final Scanner teclat = new Scanner(System.in);
    public static void main(String[] args) {
        ExercicisFuncions programa = new ExercicisFuncions();
        programa.inici();
        teclat.close();

    }

    public void inici() {
        int[] divisors = divisorsDe(llegirEnter(0));
        for (int i = 0; i < divisors.length; i++) {
            System.out.println(divisors[i] + " ");

        }
    }

    public int llegirEnter() {
        int enter = 0;
        System.out.print("Introdueix enter: ");
        while (!teclat.hasNextInt()) {
            teclat.nextLine();
            System.out.print("ERROR. Introdueix enter: ");
        }
        enter = teclat.nextInt();
        teclat.nextLine();

        return enter;

    }

    public int llegirEnter(int minim) {
        int enter = 0;
        System.out.print("Introdueix enter: ");
        while (!teclat.hasNextInt() || (enter = teclat.nextInt()) < minim) {
            teclat.nextLine();
            System.out.print("ERROR. Introdueix enter: ");
        }
        teclat.nextLine();

        return enter;

    }

    public int llegirEnter(int minim, int maxim) {
        int enter = 0;
        System.out.print("Introdueix enter: ");
        while (!teclat.hasNextInt() || (enter = teclat.nextInt()) < minim || enter > maxim) {
            teclat.nextLine();
            System.out.print("ERROR. Introdueix enter: ");
        }
        teclat.nextLine();

        return enter;

    }

    public double fahrenheitToCelsius(double fahrenheit) {
        return (5. / 9) * (fahrenheit - 32);
    }

    public boolean esMultiple(int valor1, int valor2) {
        return valor1 % valor2 == 0 || valor2 % valor1 == 0;
    }

    public int toSeconds(int hores, int minuts, int segons) {
        return segons + minuts * 60 + hores * 60 * 60;
    }

    public int[] toHoresMinutsSegons(int segons) {
        int[] resultat = new int[3];
        resultat[0] = segons / 3600;
        resultat[1] = segons % 3600 / 60;
        resultat[2] = segons % 3600 % 60;
        return resultat;
    }

    public boolean esPrimer(int enter) {
        for (int i = 2; i < enter; i++) {
            if (enter % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int[] divisorsDe(int enter) {
        int numDivisors = 0;
        int indexResultat = 0;
        for (int i = 2; i < enter; i++) {
            if (esPrimer(i) && enter % i == 0) {
                numDivisors++;
            }
        }
        int[] resultat = new int[numDivisors];
        for (int i = 2; i < enter; i++) {
            if (esPrimer(i) && enter % i == 0) {
                resultat[indexResultat] = i;
                indexResultat++;
            }
        }
        return resultat;

    }
}
