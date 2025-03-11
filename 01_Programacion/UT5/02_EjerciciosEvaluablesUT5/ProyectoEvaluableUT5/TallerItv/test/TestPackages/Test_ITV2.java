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
     
        
       
        
        
      
        cola01.agregarVehiculo(vehi01);       
        cola01.agregarVehiculo(vehi02);
        cola01.agregarVehiculo(vehi03);
        cola01.agregarVehiculo(vehi04);
        cola01.agregarVehiculo(vehi05);
        cola01.mostrarVehiculos();
        System.out.println("\n-------------------------------\n");
        System.out.println("Contiene matricula: " + cola01.contieneMatricula("0625FPH"));
        System.out.println("Cola vacia: " + cola01.colaVacia());
        
        box01.mostrar();
        box01.boxLibre();
        
      
    }
    
}
