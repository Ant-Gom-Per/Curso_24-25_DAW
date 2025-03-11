
package talleritv;

/**
 * @author Antonio Gómez Pérez
 */
public class FaseRevision {
    
    //Atributos
    private String nombreFase;
    private Vehiculo vehiculo;
    
    
    //Constructor
    public FaseRevision(String nombreFase) {
        this.nombreFase = nombreFase;
        this.vehiculo = null;
    }
    
    
    //Metodos
    public boolean tieneVehiculo(){
        return this.vehiculo != null;//Devuelve true o false si el vehiculo es o no null, en el test hay que montarlo en un print
    }
    
    public void ponerVehiculo(Vehiculo vehiculo){//Asignas un objeto de tipo vehiculo
        this.vehiculo = vehiculo;
    }
    
    public void quitarVehiculo(){//Pones el atributo vehiculo a null
        this.vehiculo = null;
    }

    public void mostrar() {
        System.out.println("La fase de revision es: " + nombreFase + "\nEl vehiculo es: " + vehiculo);        
    }
    
    public void cambioFase(FaseRevision nuevaFase){// Tienes que asignar un fase existente a la cual vas a pasar el vehiculo
        nuevaFase.ponerVehiculo(vehiculo); // Le pasas el vehiculo que tiene la fase a una nueva fase.
        this.quitarVehiculo();//Le quitas el vehiculo a esta fase
    }
    
    
}
