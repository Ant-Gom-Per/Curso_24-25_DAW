public class RepasExamen1 {
    public static void main(String[] args) {
        double[] dades = { 5.1, 7.4, 9.3, 2.5, 5.2};

        if (dades.length % 2 != 0) {
            System.out.printf("Mediana: %.2f\n", dades[dades.length / 2]);
        } else {
            System.out.printf("Mediana: %.2f\n", (dades[dades.length / 2] + dades[dades.length / 2 - 1]) / 2);
        }
    }
}
