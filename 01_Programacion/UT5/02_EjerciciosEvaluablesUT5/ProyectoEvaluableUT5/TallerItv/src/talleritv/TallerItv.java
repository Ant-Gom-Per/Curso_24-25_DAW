
package talleritv;

/**
 * @author Antonio Gómez Pérez
 */

public class TallerItv {

    public static void main(String[] args) {
        Vehiculo vehi01 = new Vehiculo("4578BXR", "Seat Ibiza", TipoVehiculo.COCHE);
        Vehiculo vehi02 = new Vehiculo("12345pd", "Opel corsa", TipoVehiculo.COCHE);
        
        System.out.println("Coche 1: " + vehi01.getMatricula()); 
        System.out.println("\n-------------------------------\n");
        System.out.println(vehi01.toString()); 
        System.out.println("\n-------------------------------\n");
        vehi02.validaMatricula();
        System.out.println("\n-------------------------------\n");
        vehi01.validaMatricula();
        System.out.println("\n-------------------------------\n");
        vehi02.tipoPorIndice(TipoVehiculo.COCHE);
    }
    
}
