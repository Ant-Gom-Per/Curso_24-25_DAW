import java.util.Arrays;

public class MetodesRepas {
    public static void main(String[] args) {
        MetodesRepas programa = new MetodesRepas();
        programa.inici();
    }

    public void inici() {
        System.out.println(esBixest(2024));
        String[] dies = { "dilluns", "dimarts", "dimecres", "dijous", "divendres" };
        double[] valors = ordenar4(3.5, 1.3, 3.53, 2.35);
        int[] valors2 = { 2, 7, 2, 1, -34, 12, 4 };
        int[] valors3 = { 1, 20, 21, 93, 93 };
        System.out.println(Arrays.toString(valors));
        System.out.println(Arrays.toString(valors));
        imprimirParells(21);
        imprimirParellsB(20);
        System.out.println();
        imprimirStrings(dies);
        imprimirStringsB(dies, dies.length - 1);
        System.out.println(xifresInvertides(352));
        System.out.println(xifresInvertidesB(512));
        System.out.println(mcd(50, 120));
        System.out.println(totsParells(40832));
        System.out.println(maxRecursiu(2, 5));
        System.out.println(maximArray(valors2));
        System.out.println(maximArrayB(valors2, valors2.length - 1));
        System.out.println(esOrdenat(valors3));
        System.out.println(esOrdenatB(valors3, valors3.length - 1));

    }

    public boolean esBixest(int any) {
        return (any % 4 == 0 && any % 100 != 0 || any % 400 == 0);
    }

    public double[] ordenar4(double n1, double n2, double n3, double n4) {
        double[] resultat = { n1, n2, n3, n4 };
        Arrays.sort(resultat);
        return resultat;
    }

    public void imprimirParells(int maxim) {
        if (maxim % 2 != 0) {
            maxim--;
        }
        if (maxim == 0) {
            System.out.println(maxim);
        } else {
            System.out.print(maxim + ", ");
            imprimirParells(maxim - 2);
        }
    }

    public void imprimirParellsB(int maxim) {
        if (maxim % 2 != 0) {
            maxim--;
        }
        if (maxim == 0) {
            System.out.print(maxim);
        } else {
            imprimirParellsB(maxim - 2);
            System.out.print(", " + maxim);
        }
    }

    public void imprimirStrings(String[] array) {
        if (array.length == 1) {
            System.out.println(array[0] + ".");
        } else {
            System.out.print(array[array.length - 1] + ", ");
            imprimirStrings(Arrays.copyOfRange(array, 0, array.length - 1));
        }
    }

    public void imprimirStringsB(String[] array, int posicio) {
        if (posicio == 0) {
            System.out.println(array[posicio] + ".");
        } else {
            System.out.print(array[posicio] + ", ");
            imprimirStringsB(array, posicio - 1);
        }
    }

    public String xifresInvertides(int numero) {
        if (numero < 10) return String.valueOf(numero);
        else return String.valueOf(numero % 10) + xifresInvertides(numero / 10);
    }

    public int xifresInvertidesB(int numero) {
        return Integer.parseInt(xifresInvertides(numero));
    }

    public int mcd(int n1, int n2) {
        if (n2 == 0) return n1;
        else return mcd(n2, n1 % n2);
    }

    public boolean totsParells(int numero) {
        if (numero < 10) return numero % 2 == 0;
        else return numero % 2 == 0 && totsParells(numero / 10);
    }

    public int max(int n1, int n2) {
        return (n1 >= n2) ? n1 : n2;
    }

    public int maxRecursiu(int n1, int n2) {
        if (n1 == 0) return n2;
        else if (n2 == 0) return n1;
        else return maxRecursiu(n1 - 1, n2 - 1) + 1;
    }

    public int maximArray(int[] array) {
        if (array.length == 1) return array[0];
        else return max(array[array.length - 1], maximArray(Arrays.copyOfRange(array, 0, array.length - 1)));
    }

    public int maximArrayB(int[] array, int posicio) {
        if (posicio == 0) return array[0];
        else return max(array[posicio], maximArrayB(array, posicio - 1));
    }

    public boolean esOrdenat(int[] array) {
        if (array.length == 1) return true;
        else
            return max(array[array.length - 1], array[array.length - 2]) == array[array.length - 1]
                    && esOrdenat(Arrays.copyOfRange(array, 0, array.length - 1));
    }

    public boolean esOrdenatB(int[] array, int posicio) {
        if (posicio == 0) return true;
        else
            return max(array[posicio], array[posicio - 1]) == array[posicio]
                    && esOrdenatB(array, posicio - 1);
    }

}
