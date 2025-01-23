/*
 * problema evaluable 2 UT5
 */
package intervalo;

/**
 * @author Antonio
 */
public class Intervalo {
    //Atributos
    private double inferior;
    private double superior;
    
    
    //Constructores
    public Intervalo(double inferior, double superior){
        this.inferior=inferior;
        this.superior=superior;
    }
    
    public Intervalo(double inferior){
        this.inferior=inferior;
    }
    
    public Intervalo(Intervalo valores){
        this(valores.inferior, valores.superior);
    }
    
    public Intervalo(){
        this.inferior=0.0;
        this.superior=10.0;
    }
}
