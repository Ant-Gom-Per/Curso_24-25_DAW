package proyectoitv1;

import java.util.Scanner;

/**
 *
 *
 * @author Juande y Rubén
 */
public class Menu {

    public static final Scanner scanner = new Scanner(System.in);

    public static void mostrarMenu() {
        System.out.println();
        System.out.println("_____________________________________________________");
        System.out.println("MENÚ ITV");
        System.out.println("----------------");
        System.out.println("1. Alta y recepción de vehículos");
        System.out.println("2. Reclamar vehículo para entrar al box");
        System.out.println("3. Mover todos los vehículos de fase dentro de un box");
        System.out.println("4. Información del estado de un box concreto");
        System.out.println("5. Información general de todos los boxes");
        System.out.println("6. Salir del programa");
        System.out.println("_____________________________________________________");
        System.out.println();
        opcion();
    }

    public static void opcion() {
        System.out.print("Selecciona una opción: ");
        int num = 0;
        while (!scanner.hasNextInt() || (num = scanner.nextInt()) < 1 || num > 6) {
            System.out.print("ERROR!! Seleccione una opción válida: ");
            scanner.nextLine();
        }
        scanner.nextLine();

        switch (num) {
            case 1:
                ColaInicial.agregar(Taller.recogerNuevoVehiculo());
                ColaInicial.mostrarPosicion();
                break;
            case 2:
                if (ColaInicial.estaVacia()) {
                    System.out.println("La cola se encuentra vacía.");
                } else {
                    int i = Taller.leerBox();
                    if (Taller.boxs[i].estaLibre()) {
                        Taller.boxs[i].agregar(ColaInicial.sacar());
                        System.out.println("El vehiculo ha entrado al box");
                    } else {
                        System.out.println("El vehiculo no ha podido entrar al box");
                    }
                }
                break;
            case 3:
                int i = Taller.leerBox();
                Taller.boxs[i].pasarVehiculosFase();
                break;
            case 4:
                int j = Taller.leerBox();
                Taller.boxs[j].mostrar();
                break;
            case 5:
                Taller.mostrarBoxs();
                break;
            default:
                System.out.println("FIN DEL PROGRAMA");
        }
        if (num != 6) {
            mostrarMenu();
        }
    }

}
