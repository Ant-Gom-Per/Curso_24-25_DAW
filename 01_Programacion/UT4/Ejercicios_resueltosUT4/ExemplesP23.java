public class ExemplesP23 {
    public static void main(String[] args) {
        ExemplesP23 programa = new ExemplesP23();
        programa.inici();
    }

    public void inici() {
        int[] arrayEnters = { 3, -2, 5, 1 };
        double[] arrayDoubles = { 3.25, -8.23, 3.3, 1.65 };

        System.out.println("El màxim dels enters és: " + maximValors(arrayEnters));
        System.out.println("El màxim dels doubles és: " + maximValors(arrayDoubles));

        System.out.println("La mitjana dels valors és: " + mitjana(arrayEnters));

        System.out.println("L'alumne amb un 3.25 està " + notaAText(3.25).toLowerCase());
        System.out.println("L'alumne amb un 5 està " + notaAText(arrayEnters[2]));

        System.out.println("El mes de novembre té " + diesDelMes(11) + " dies");
        System.out.println("El mes de desembre té " + diesDelMes(12) + " dies");

        System.out.println("Es troba el 8 en l'array: " + buscarValor(8, arrayEnters));
        System.out.println("Es troba el 5 en l'array: " + buscarValor(5, arrayEnters));

        final int VALOR_A_BUSCAR = 8;

        if (indexOf(VALOR_A_BUSCAR, arrayEnters) == -1) {
            System.out.println("Valor no trobat");
        } else {
            System.out.println("Trobat en l'índex: " + indexOf(VALOR_A_BUSCAR, arrayEnters));
        }

    }

    public int maximValors(int[] valors) {
        int maxim = valors[0];
        for (int valor : valors) {
            maxim = valor > maxim ? valor : maxim;
        }
        return maxim;
    }

    public double maximValors(double[] valors) {
        double maxim = valors[0];
        for (double valor : valors) {
            maxim = valor > maxim ? valor : maxim;
        }
        return maxim;
    }

    public double mitjana(int[] valors) {
        double acumulador = .0;
        for (int valor : valors) {
            acumulador += valor;
        }
        return acumulador / valors.length;
    }

    public String notaAText(double nota) {
        return nota < 5 ? "Suspès" : "Aprovat";
        /*
         * if(nota < 5){
         * return "Suspès";
         * }
         * else{
         * return "Aprovat";
         * }
         */
    }

    public int diesDelMes(int mes) {
        if (mes == 2) {
            return 28;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return 30;
        } else {
            return 31;
        }
    }

    public boolean buscarValor(int valorABuscar, int[] array) {
        for (int element : array) {
            if (element == valorABuscar)
                return true;
        }
        return false;
    }

    public int indexOf(int valorABuscar, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valorABuscar) {
                return i;
            }
        }
        return -1;
    }
}