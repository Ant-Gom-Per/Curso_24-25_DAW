package TestPackages;

import talleritv.FaseRevision;
import talleritv.TipoVehiculo;
import talleritv.Vehiculo;

public class Test_ITV2 {

    public static void main(String[] args) {
        Vehiculo vehi01 = new Vehiculo("4578BXR", "Seat Ibiza", TipoVehiculo.COCHE);
        Vehiculo vehi02 = new Vehiculo("12345pd", "Opel corsa", TipoVehiculo.COCHE);
        Vehiculo vehi03 = new Vehiculo("9835ASP", "Citroen Berlingo", TipoVehiculo.FURGONETA);
        Vehiculo vehi04 = new Vehiculo("2535GST", "Iveco Daily", TipoVehiculo.CAMION);
        
        FaseRevision fase01 = new FaseRevision("Seguridad");
        
       
        
        
        fase01.mostrar();
        System.out.println("\n-------------------------------\n");
        fase01.ponerVehiculo(vehi01);        
        fase01.mostrar();
        System.out.println("\n-------------------------------\n");
        System.out.println(vehi01.toString());
        System.out.println("\n-------------------------------\n");
        fase01.cambioFase("Luces");
        fase01.mostrar();
    }
    
}
