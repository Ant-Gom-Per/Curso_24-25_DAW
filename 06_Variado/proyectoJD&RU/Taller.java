package proyectoitv1;

import java.util.Scanner;

/**
 *
 * @author Juande y Rubén
 */
public class Taller {
    
    public static final Scanner scanner = new Scanner(System.in);

    static Box[] boxs;
    private ColaInicial colaInicial;
    private final int NUM_BOXS = 6;

    public static void main(String[] args) {
        Taller t1 = new Taller();
        t1.iniciar();
    }

    public Taller() {
        boxs = new Box[NUM_BOXS];
        for (int i = 0; i < NUM_BOXS; i++) {
            boxs[i] = new Box(i + 1);
        }
        colaInicial = new ColaInicial();
    }

    public void iniciar() {
        Menu.mostrarMenu();
    }
    
    public static Vehiculo recogerNuevoVehiculo(){
        String matricula = leerMatricula();
        String marca = leerMarca();
        String modelo = leerModelo();
        Vehiculo.TipoVehiculo tipoVehiculo = leerTipoVehiculo();
        return new Vehiculo(matricula, marca, modelo, tipoVehiculo);
    }
    
    public static String leerMatricula(){
        String matricula;
        System.out.print("Dime la matrícula del vehiculo: ");
        while (!(matricula = scanner.nextLine()).matches(Vehiculo.getPATRO_MATRICULA()) || (ColaInicial.contieneMatricula(matricula))) {
            System.out.print("ERROR! Vuelve a introducir la matrícula: ");
        }
        
        return matricula;
    }
    
    public static String leerMarca(){
        System.out.print("Dime la marca del vehiculo: ");
        while (scanner.hasNextInt() || (scanner.hasNextDouble())) {
            System.out.print("ERROR!! Introduce la marca correctamente: ");
            scanner.nextLine();
        }
        String marca = scanner.nextLine();
        
        return marca;
    }
    
    public static String leerModelo(){
        System.out.print("Dime el modelo del vehiculo: ");
        while (scanner.hasNextInt() || (scanner.hasNextDouble())) {
            System.out.print("ERROR!! Introduce el modelo correctamente: ");
            scanner.nextLine();
        }
        String modelo = scanner.nextLine();
        
        return modelo;
    }
    
    public static Vehiculo.TipoVehiculo leerTipoVehiculo(){
        System.out.println("Indica el tipo de vehículo entre las siguientes opciones(numero):");
        System.out.println("0: COCHE");
        System.out.println("1: MICROBUS");
        System.out.println("2: FURGONETA");
        System.out.println("3: CAMION");
        System.out.println("4: NADA");
        int index = 0;
        while (!scanner.hasNextInt() || (index = scanner.nextInt()) < 0 || index > 4) {
            System.out.print("ERROR! Vuelve a introducir el tipo del vehículo: ");
            scanner.nextLine();
        }
        scanner.nextLine();
        return Vehiculo.tipoSegunIndex(index);
    }
    
    public static int leerBox(){
        int id;
        System.out.print("Dime un box(1-6): ");
        while (!scanner.hasNextInt() || (id = scanner.nextInt()) < 1 || id > 6) {
            System.out.print("ERROR!! Introduce un box correcto: ");
            scanner.nextLine();
        }
        
        return id-1;
    }
    
    public static void mostrarBoxs(){
        for (int i = 0; i < 6; i++) {
            boxs[i].mostrar();
        }
    }
    
}
