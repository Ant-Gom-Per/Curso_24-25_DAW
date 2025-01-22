package proyectoitv1;

/**
 *
 * @author Juande y Rubén
 */
public class Box {
    
    private int id;
    private FaseRevision[] fasesRevision;
    private final String[] NOMBRE_FASES = {"Revisión inicial de elementos de seguridad", "Revisión del sistema electrico", "Revisión de emisiones de humos", "Revisión de frenos y dirección"};
    private final int NUMERO_FASES = 4;

    public Box(int id) {
        this.id = id;
        fasesRevision = new FaseRevision[NUMERO_FASES];
        for (int i = 0; i < NUMERO_FASES; i++) {
            fasesRevision[i] = new FaseRevision(NOMBRE_FASES[i]);
        }
    }
    
    public boolean estaLibre(){
        return !fasesRevision[0].tieneVehiculo();
    }
    
    public boolean esPrimeraFase(int index){
        return index == 0;
    }
    
    public void agregar(Vehiculo vehiculo){
        fasesRevision[0].asignarVehiculo(vehiculo);
    }
    
    public void pasarVehiculosFase(){
        fasesRevision[3].asignarVehiculo(fasesRevision[2].getVehiculo());
        fasesRevision[2].asignarVehiculo(fasesRevision[1].getVehiculo());
        fasesRevision[1].asignarVehiculo(fasesRevision[0].getVehiculo());
        fasesRevision[0].desAsignarVehiculo();
    }
    
    public void mostrar(){
        System.out.println("ID del box: " + id);
        fasesRevision[0].mostrar();
        fasesRevision[1].mostrar();
        fasesRevision[2].mostrar();
        fasesRevision[3].mostrar();
        System.out.println();
    }
    
}
