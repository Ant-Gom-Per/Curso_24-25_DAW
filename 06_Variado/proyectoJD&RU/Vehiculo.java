package proyectoitv1;

import java.util.Scanner;

/**
 *
 * @author Juande y Rubén
 */
public class Vehiculo {
    
    public static final Scanner scanner = new Scanner(System.in);
    
    private String matricula;
    private String marca;
    private String modelo;
    private TipoVehiculo tipoVehiculo;
    private static final String PATRO_MATRICULA = "\\d{4}[A-Z]{3}";
    //matricula.matches()
    
    enum TipoVehiculo{
        COCHE, MICROBUS, FURGONETA, CAMION, NADA;
    }
    
    // Taller es la clase principal, puede ser el main
    // el main solo hace un new Taller y llama al metodo iniciar
    
    public Vehiculo(String matricula, String marca, String modelo, TipoVehiculo tipoVehiculo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.tipoVehiculo = tipoVehiculo;
    }

    public Vehiculo(String matricula, String marca, String modelo, int index) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.tipoVehiculo = tipoSegunIndex(index);
    }
    
    public boolean tieneEsta(String matricula){
        return matricula.equals(this.matricula);
    }
    
    public static TipoVehiculo tipoSegunIndex(int index){
        TipoVehiculo[] tipos = TipoVehiculo.values();
        return tipos[index];
    }

    public String getMatricula() {
        return matricula;
    }

    public static String getPATRO_MATRICULA() {
        return PATRO_MATRICULA;
    }

    @Override
    public String toString() {
        return "Vehiculo {" + "matricula = " + matricula + ", marca = " + marca + ", modelo = " + modelo + ", tipoVehiculo = " + tipoVehiculo + '}';
    }
    
}
