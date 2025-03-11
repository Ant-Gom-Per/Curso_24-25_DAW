
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
    public Box(int idBox){ //composicion y agregacion
        this.idBox = idBox;
        fasesRevision = new FaseRevision[NUMERO_FASES];
        for (int i=0 ; i < NUMERO_FASES ; i++){
            fasesRevision[i] = new FaseRevision(NOMBRE_FASES[i]);  //crear las fases dentro del constructor
        }                            
    }
    
    //Atributos
    public boolean boxLibre(){
        return fasesRevision[0].tieneVehiculo();
    }
    
    
    public void mostrar(){
        System.out.println("El box es: " + idBox);
        fasesRevision[0].mostrar();
        fasesRevision[1].mostrar();
        fasesRevision[2].mostrar();
        fasesRevision[3].mostrar();
    }
    
    
    
    
    
}
