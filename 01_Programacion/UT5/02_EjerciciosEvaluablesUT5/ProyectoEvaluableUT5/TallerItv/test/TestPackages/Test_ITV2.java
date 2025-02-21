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
        FaseRevision fase02 = new FaseRevision("Sistema Electrico");
        FaseRevision fase03 = new FaseRevision("Emisiones de humos");
        FaseRevision fase04 = new FaseRevision("Frenos y dirección");
        
        ColaInicial cola01 = new ColaInicial();
        
       
        
        
        fase01.mostrar();
        System.out.println("\n-------------------------------\n");
        fase01.ponerVehiculo(vehi01);        
        fase01.mostrar();
        System.out.println("\n-------------------------------\n");
        fase02.mostrar();
        System.out.println("\n-------------------------------\n");
        fase01.cambioFase(fase02);
        fase02.mostrar();
        System.out.println("\n-------------------------------\n");
        fase01.mostrar();
      
    }
    
}
