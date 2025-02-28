
package talleritv;

/**
 * @author Antonio Gómez Pérez
 */
public class Box {
    
    //Atributos
    private int idBox;//Numero del box
    private FaseRevision[] fasesRevision;
    private String[] nombreFases;
    private int numeroFases = 4;
    
    
    //Constructores

    public Box(int idBox, FaseRevision[] fasesRevision, String[] nombreFases) {
        this.idBox = idBox;
        this.fasesRevision = fasesRevision;
        this.nombreFases = nombreFases;
    }
    
    //composicion y agregacion
    //crear las fases dentro del constructor
    
    
    
}
