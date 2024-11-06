public class Matrius {
    public static void imprimirMatriu(double[][] matriu) {
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.printf("%.2f\t", matriu[i][j]);
            }
            System.out.println();
        }
    }
    public static void imprimirMatriu(int[][] matriu) {
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.printf("%d\t", matriu[i][j]);
            }
            System.out.println();
        }
    }
}
