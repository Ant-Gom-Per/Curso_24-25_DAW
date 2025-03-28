/**
 * 
 **/

package TestPackages;

import talleritv.ColaInicial;
import talleritv.FaseRevision;
import talleritv.TipoVehiculo;
import talleritv.Vehiculo;
import talleritv.Box;

public class Test_ITV2 {

    public static void main(String[] args) {
        
        ColaInicial cola01 = new ColaInicial();
        
        Vehiculo vehi01 = new Vehiculo("4578BXR", "Seat Ibiza", TipoVehiculo.COCHE);
        Vehiculo vehi02 = new Vehiculo("1234PDH", "Opel Corsa", TipoVehiculo.COCHE);
        Vehiculo vehi03 = new Vehiculo("9835ASP", "Citroen Berlingo", TipoVehiculo.FURGONETA);
        Vehiculo vehi04 = new Vehiculo("2535GST", "Iveco Daily", TipoVehiculo.CAMION);
        Vehiculo vehi05 = new Vehiculo("0625FPH", "Peugeot 206", TipoVehiculo.COCHE);
       
        
        FaseRevision fase01 = new FaseRevision("Seguridad");
        FaseRevision fase02 = new FaseRevision("Sistema Electrico");
        FaseRevision fase03 = new FaseRevision("Emisiones de humos");
        FaseRevision fase04 = new FaseRevision("Frenos y dirección");
        
        Box box01 = new Box(1);                                                  
       
        
        box01.agregar(vehi01);      
        box01.pasoVehiculoFase();     
        box01.agregar(vehi02);                
        box01.pasoVehiculoFase();     
        box01.agregar(vehi03);       
        box01.pasoVehiculoFase();     
        box01.agregar(vehi04);          
        box01.mostrar();
        System.out.println("\n-------------------------------\n");
        box01.pasoVehiculoFase();       
        box01.agregar(vehi05);
        box01.mostrar();
        System.out.println("\n-------------------------------\n");
    }
    
}
