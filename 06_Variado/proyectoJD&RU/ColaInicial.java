package proyectoitv1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Juande y Rubén
 */
public class ColaInicial {

    public static final Scanner scanner = new Scanner(System.in);

    private static Vehiculo[] vehiculos;

    public ColaInicial() {
        vehiculos = new Vehiculo[0];
    }

    public static void agregar(Vehiculo vehiculo) {
        vehiculos = Arrays.copyOf(vehiculos, vehiculos.length + 1);
        vehiculos[vehiculos.length - 1] = vehiculo;
    }

    public static Vehiculo sacar() {
        Vehiculo[] cola = Arrays.copyOf(vehiculos, vehiculos.length);
        vehiculos = new Vehiculo[cola.length - 1];
        int j = 0;
        for (int i = 1; i < cola.length; i++) {
            vehiculos[j] = cola[i];
            j++;
        }
        return cola[0];
    }

    public static void mostrarCola() {
        System.out.print("[");
        for (int i = 0; i < vehiculos.length; i++) {
            System.out.print(vehiculos[i]);
            if (i != vehiculos.length - 1) {
                System.out.println(", ");
            }
        }
        System.out.println("]");
    }

    public static void mostrarPosicion() {
        System.out.print("Posición del vehículo: ");
        System.out.println(vehiculos.length);
    }

    public static boolean estaVacia() {
        return vehiculos.length == 0;
    }

    public static boolean contieneMatricula(String matricula) {
        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i].tieneEsta(matricula)) {
                return true;
            }
        }
        return false;
    }
    
}