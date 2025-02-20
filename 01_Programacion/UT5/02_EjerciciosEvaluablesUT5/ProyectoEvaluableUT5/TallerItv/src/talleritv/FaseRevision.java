
package talleritv;

/**
 * @author Antonio Gómez Pérez
 */
public class FaseRevision {
    
    //Atributos
    String nombreFase;
    Vehiculo vehiculo;
    
    
    //Constructor
    public FaseRevision(String nombreFase) {
        this.nombreFase = nombreFase;
        this.vehiculo = null;
    }
    
    
    //Metodos
    public boolean tieneVehiculo(){
        return this.vehiculo != null;
    }
    
    public void ponerVehiculo(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
    }
    
    public void quitarVehiculo(){
        this.vehiculo = null;
    }

    public void mostrar() {
        System.out.println("La fase de revision es: " + nombreFase + "\nEl vehiculo es: " + vehiculo);        
    }

    @Override
    public String toString() {
        return "FaseRevision{" + "nombreFase=" + nombreFase + ", vehiculo=" + vehiculo + '}';
    }
    
    public void cambioFase(String nuevaFase){
        this.nombreFase = nuevaFase;
    }
    
    
}
