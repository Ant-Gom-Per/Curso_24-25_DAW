/*
 * ejercicio UT5_3
 */
package bombillas;

/**
 *
 * @author Antonio
 */
public class Bombillas {
    
    //Atributos estaticos
    private static boolean intGeneral = true;    
    //Atributos de instancia
    private boolean interruptor;
    
    
    //Constructores
    public Bombillas(){
        this.interruptor = false;      
    }
    
    //Metodos de estáticos
    public static void encenderGeneral(){
        intGeneral = true;
    }
    public static void apagarGeneral(){
        intGeneral = false;
    }
    
    // Métodos de instancia
    public void encender(){
        this.interruptor = true;
    }
    public void apagar(){
        this.interruptor = false;
    }
    public boolean estado(){
        return intGeneral && interruptor ;
    }
    public String mostrarResultado(){
        return (estado()? "Encendida" : "Apagada");
    }

    
}
