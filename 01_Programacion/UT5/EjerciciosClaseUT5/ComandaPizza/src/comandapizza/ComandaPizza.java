/*
 * Ejercicio practicar UT5
 */
package comandapizza;

/**
 * @author Antonio
 */
public class ComandaPizza {
    
    //Atributos
    private String tipo;
    private String tamanyo;
    private Boolean servida = false;
    
    //COnstructores
    public ComandaPizza(String unTipo, String unTamanyo){
        this.tipo = unTipo;
        this.tamanyo = unTamanyo;        
    }
    
    //Métodos
    public void servir(){
        this.servida = true;
    }
    
}
