package proyectoitv1;

/**
 *
 * @author Juande y Rubén
 */
public class FaseRevision {
    
    private String nombre;
    private Vehiculo vehiculo;

    public FaseRevision(String nombre) {
        this.nombre = nombre;
        this.vehiculo = null;
    }
    
    public boolean tieneVehiculo(){
        return vehiculo != null;
    }
    
    public void asignarVehiculo(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
    }
    
    public void desAsignarVehiculo(){
        this.vehiculo = null;
    }
    
    public void mostrar(){
        System.out.println("Nombre de la fase: " + nombre);
        if(tieneVehiculo())
            System.out.println(vehiculo.toString());
        else
            System.out.println("No tiene vehículo");
    }
    
    public void asignarVehiculoA(FaseRevision faseRevision){
        faseRevision.vehiculo = ColaInicial.sacar();
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    
}
