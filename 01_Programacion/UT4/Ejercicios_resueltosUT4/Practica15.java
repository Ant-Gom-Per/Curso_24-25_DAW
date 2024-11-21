import java.util.Scanner;

public class Practica15 {
    private final Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        Practica15 programa = new Practica15();
        programa.inicio();
    }

    // NIVEL 0 de descomposición. Solo existe un módulo que deberemos descomponer.
    public void inicio() {

        double temperaturas[][] = new double[52][7];
        // int diaActual=1;
        // int mesActual=1;
        // int semana = 0;
        int[] fecha = { 1, 1, 0 };
        boolean salir = false;
        int opcion;
        while (!salir) {
            mostrarMenu();
            while (!teclado.hasNextInt()) {
                System.out.print("ERROR. Introduce un valor entero: ");
                teclado.nextLine();
            }
            opcion = teclado.nextInt();
            teclado.nextLine();
            salir = tratarOrden(opcion, fecha, temperaturas);
        }

    }

    // NIVEL 1
    // Tarea 1. Mostrar el menú
    public void mostrarMenu() {
        System.out.println("---------------- MENÚ ----------------");
        System.out.println("-- 1. Entrar temperaturas semanales --");
        System.out.println("-- 2. Mostrar temperatura media     --");
        System.out.println("-- 3. Mostrar la diferencia máxima  --");
        System.out.println("-- 4. Finalizar ejecución           --");
        System.out.println("--------------------------------------");
        System.out.print("\nINTRODUCE UNA OPCIÓN: ");
    }

    // Tarea 2. Tratar la orden dada por el usuario.
    public boolean tratarOrden(int opcion, int[] fecha, double[][] temperaturas) {
        switch (opcion) {
            case 1:
                entrarTemperaturasSemanales(fecha, temperaturas);
                break;
            case 2:
                mostrarTemperaturaMedia(fecha, temperaturas);
                break;
            case 3:
                mostrarDiferenciaMaxima(fecha, temperaturas);
                break;
            case 4:
                return true;
            default:
                System.out.println("ERROR. OPCIÓN INVÁLIDA\n");
        }
        return false;
    }

    // NIVEL 2
    // Tarea 2.1 Introducción de temperaturas semanales.
    public void entrarTemperaturasSemanales(int[] fecha, double[][] temperaturas) {
        leerTemperaturas(fecha, temperaturas);
        actualizarFecha(fecha);
    }

    // Tarea 2.2. Mostrar la temperatura media de las que tenemos introducidas.
    public void mostrarTemperaturaMedia(int[] fecha, double[][] temperaturas) {
        mostrarFechaActual(fecha);
        calcularTemperaturaMedia(fecha, temperaturas);
    }

    // Tarea 2.3, Mostrar la diferencia máxima entre temperaturas.
    public void mostrarDiferenciaMaxima(int[] fecha, double[][] temperaturas) {
        mostrarFechaActual(fecha);
        calcularDiferenciaMaxima(fecha, temperaturas);

    }

    // Tarea 2.4. Finalizar la ejecución del programa (salir del bucle).
    public void finalizarEjecucion() {

    }

    // NIVEL 3
    // Tarea 2.1.1. Lectura por teclado de las temperaturas.
    public void leerTemperaturas(int[] fecha, double[][] temperaturas) {
        System.out.println("A continuación se solicitan las 7 temperaturas de esta semana: ");
        for (int i = 0; i < 7; i++) {
            System.out.print("Introduce la temperatura " + (i + 1) + ": ");
            while (!teclado.hasNextDouble()) {
                teclado.nextLine();
                System.out.print("Error. Introduce la temperatura " + (i + 1) + ": ");
            }
            temperaturas[fecha[2]][i] = teclado.nextDouble();
            teclado.nextLine();
        }
    }

    // Tarea 2.1.2. Actualización de la fecha actual.
    public void actualizarFecha(int[] fecha) {
        fecha[2]++;
        for (int i = 0; i < 7; i++) {
            if ((fecha[0] == 28 && fecha[1] == 2)
                    || (fecha[0] == 30 && (fecha[1] == 4 || fecha[1] == 6 || fecha[1] == 9 || fecha[1] == 11))
                    || (fecha[0] == 31 && (fecha[1] == 1 || fecha[1] == 3 || fecha[1] == 5 || fecha[1] == 7
                            || fecha[1] == 8 || fecha[1] == 10))) {
                fecha[0] = 1;
                fecha[1]++;
            } else if (fecha[0] == 31 && fecha[1] == 12) {
                fecha[0] = 1;
                fecha[1] = 1;
                fecha[2] = 0;
            } else {
                fecha[0]++;
            }
        }
    }

    // Tarea 2.2.1. y 2.3.1. Mostrar por pantalla la fecha actual.
    public void mostrarFechaActual(int[] fecha) {
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        String fechaString = fecha[0] + " de " + meses[fecha[1] - 1];
       
        System.out.println("Fecha actual: " + fechaString);
    }

    // Tarea 2.2.2. Cálculos para obtener el promedio de temperaturas.
    public void calcularTemperaturaMedia(int[] fecha, double[][] temperaturas) {
        int valores = 0;
        double totales = 0;
        for (int i = 0; i < fecha[2]; i++) {
            for (int j = 0; j < 7; j++) {
                valores++;
                totales += temperaturas[i][j];
            }
        }
        System.out.printf("La temperatura media es de: %.2f ºC\n", (totales / valores));
    }

    // Tarea 2.3.2. Cálculos para obtener la diferencia máxima entre temperaturas.
    public void calcularDiferenciaMaxima(int[] fecha, double[][] temperaturas) {
        double minima = temperaturas[0][0];
        double maxima = temperaturas[0][0];

        for (int i = 0; i < fecha[2]; i++) {
            for (int j = 0; j < 7; j++) {
                if (temperaturas[i][j] > maxima) {
                    maxima = temperaturas[i][j];
                }
                if (temperaturas[i][j] < minima) {
                    minima = temperaturas[i][j];
                }
            }
        }

        System.out.println("La diferencia máxima entre temperaturas es de " + (maxima - minima) + " ºC");

    }
}