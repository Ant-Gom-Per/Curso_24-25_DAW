
package talleritv;

/**
 * @author Antonio Gómez Pérez
 */
public class Box {
    
    //Atributos
    private int idBox;//Numero del box
    private FaseRevision[] fasesRevision;
    private final int NUMERO_FASES = 4;
    private final String[] NOMBRE_FASES = {
        "Elementos de Seguridad",
        "Sistema Eléctrico",
        "Emisión de Gases",
        "Frenos y Dirección"
    };       
    
    //Constructores
    public Box(int idBox){ //Esto es composicion y agregacion
        this.idBox = idBox;
        fasesRevision = new FaseRevision[NUMERO_FASES];
        for (int i=0 ; i < NUMERO_FASES ; i++){
            fasesRevision[i] = new FaseRevision(NOMBRE_FASES[i]);  //crear las fases dentro del constructor
        }                            
    }
    
    //Atributos
    public boolean boxLibre(){
        return !fasesRevision[0].tieneVehiculo();
    }
    
    public boolean esPrimeraFase(int numFase){
        return numFase == 0;
    }
    
    public void agregar(Vehiculo vehiculo){
        fasesRevision[0].ponerVehiculo(vehiculo);
    }
    
    public void pasoVehiculoFase(){
        fasesRevision[3].quitarVehiculo();
        fasesRevision[2].cambioFase(fasesRevision[3]);
        fasesRevision[1].cambioFase(fasesRevision[2]);
        fasesRevision[0].cambioFase(fasesRevision[1]);
    }
    
    public void mostrar(){
        System.out.println("El box es: " + idBox);
        fasesRevision[0].mostrar();
        fasesRevision[1].mostrar();
        fasesRevision[2].mostrar();
        fasesRevision[3].mostrar();
    }
    
    
    
    
    
}
