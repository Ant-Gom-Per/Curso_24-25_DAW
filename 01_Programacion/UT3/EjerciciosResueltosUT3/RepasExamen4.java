public class RepasExamen4 {
    public static void main(String[] args) {
        double[][] matriu1 = {
                { 2.5, 3.1, 5.6, 1.9 },
                { 7.8, 6.1, 0.25, 2.3 },
                { 8.54, 2.1, 6.0, 4.6 }
        };
        System.out.println("MATRIU1:");
        Matrius.imprimirMatriu(matriu1);

        double[][] matriu2 = {
                { 0.15, 8.3, 1.2, 9.9 },
                { 6.7, 9.11, 7.57, 3.6 },
                { 3.1, 6.55, 8.7, 2.1 }
        };
        System.out.println("\nMATRIU2:");
        Matrius.imprimirMatriu(matriu2);

        for (int i = 0; i < matriu2.length; i++) {
            for (int j = 0; j < matriu2[i].length; j++) {
                matriu2[i][j] += matriu1[i][j];
            }
        }

        System.out.println("\nMATRIU2 FINAL:");
        Matrius.imprimirMatriu(matriu2);

    }
}
