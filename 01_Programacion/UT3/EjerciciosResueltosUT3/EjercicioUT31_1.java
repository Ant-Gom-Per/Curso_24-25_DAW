import java.util.Scanner;

public class EjercicioUT31_1 {


    public static void main(String[] args) {
        final int QUANTITAT_NUMEROS = 5;
        int[] vectorNumeros = new int[QUANTITAT_NUMEROS];
        Scanner teclat = new Scanner(System.in);
        
        // Creem un bucle que demane tants números com posicions tinga el vector, i els assignem un a un a cada posició.
        for(int i=0; i<QUANTITAT_NUMEROS; i++){
            System.out.print("Introdueix un enter: ");
            // Abans de guardar el número a la posició correcta del vector, comprovem que el valor siga correcte.
            while (!teclat.hasNextInt()) {
                teclat.nextLine();
                System.out.print("ERROR. Introdueix un enter: ");
            }
            vectorNumeros[i] = teclat.nextInt();
            teclat.nextLine();
        }
        System.out.println("Has introduït els números: ");
        // Recorrem el vector posició a posició per a imprimir el seu contingut.
        for(int i = 0; i<vectorNumeros.length;i++){
            System.out.print(vectorNumeros[i]+" ");
        }

        teclat.close();
    }
}