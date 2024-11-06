import java.util.Scanner;
public class UT33_ej4 {
    public static void main(String[] args) {
        boolean simetrica = true;
        Scanner teclat = new Scanner(System.in);
        System.out.print("Introdueix la longitud de la matriu: ");
        int longitud = teclat.nextInt();
        int[][] matriu = new int[longitud][longitud];

        System.out.println("Introdueix els valors de la matriu: ");
        for(int i=0; i<matriu.length; i++){
            for(int j=0; j<matriu[i].length; j++){
                matriu[i][j] = teclat.nextInt();
            }
        }

        for(int i=0; simetrica && i<matriu.length; i++){
            for(int j=0; simetrica && j<i; j++){
                if(matriu[i][j] != matriu[j][i]) simetrica = false;
            }
        }

        System.out.println(simetrica);
        teclat.close();
    }
}
