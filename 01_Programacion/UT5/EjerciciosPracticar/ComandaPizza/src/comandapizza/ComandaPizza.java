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
    private String servida;
    public static int totalPedidas = 0;
    public static int totalServidas = 0;
    
    //Constructores
    public ComandaPizza(String unTipo, String unTamanyo){
        tipo = unTipo;
        tamanyo = unTamanyo;
        servida = "pedida";
        totalPedidas++;
    }
    
    //Métodos
    public void servir(){
       if(servida.equals("pedida")){
           servida = "servida";
           totalServidas++;
       }
       else{
           System.out.println("La pizza ya está servida:");
       }
    }
    public static int gettotalPedidas(){
        return totalPedidas;        
    } 
    public static int gettotalServidas(){
        return totalServidas;
    }
    
    public String toString(){//devuelve una representación en cadena de texto del objeto sobre el cual lo invoques.
        return "La pizza es una " + tipo + " de tamaño " + tamanyo + " y está " + servida;
    }
}
