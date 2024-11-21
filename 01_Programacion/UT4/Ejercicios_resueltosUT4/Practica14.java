import java.util.Scanner;

public class Practica14 {
    private final Scanner teclat = new Scanner(System.in);

    public static void main(String[] args) {
        Practica14 programa = new Practica14();
        programa.inici();
    }

    public void inici() {

        int[] valors = { -7, 11, 11, -32, 53, 11, -7 };
        int enter = llegirEnter();
        imprimirResultat(voltesApareix(enter, valors));
    }

    public int llegirEnter() {

        System.out.print("Introdueix un valor enter: ");
        while (!teclat.hasNextInt()) {
            teclat.nextLine();
            System.out.print("ERROR. Introdueix un valor enter: ");
        }
        return teclat.nextInt();
    }

    public int voltesApareix(int numero, int[] vector) {
        int comptador = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == numero)
                comptador++;
        }
        return comptador;
    }

    public void imprimirResultat(int voltes) {
        System.out.println("Voltes que es repeteix: " + voltes);

    }

}