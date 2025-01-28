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
    
    public Intervalo(double superior){
        this.superior=superior;
    }
    
    public Intervalo(Intervalo valor){//Constructor copia
        this(valor.inferior, valor.superior);
    }
    
    public Intervalo(){
        this.inferior=0.0;
        this.superior=10.0;
    }
    
    //Métodos de instancia
    public double getInferior(){
        return inferior;
    }
    
    public double getSuperior(){
        return superior;
    }
    
    public Intervalo clonar(){
        return new Intervalo(this);
    }
    
    public double longitud(){
        return superior - inferior;
    }
    
    public void mover(double cantidad){//Esto mueve el intervalo tanto superior como inferior
        this.superior = cantidad + this.superior;
        this.inferior = cantidad + this.inferior;
    }
    
    public Intervalo movido(double cantidad){
        Intervalo Aux = this.clonar();//Clonamos el original
        Aux.mover(cantidad);//Movemos el intervalo
        return Aux;
    }
    
    public String incluido(double valor){
        String mensaje = (valor >= this.inferior && valor <= this.superior) ? "Está incluido" : "No está incluido";            
        return mensaje;
    }
    
    /**
    public String incluido(Intervalo,){
      Intervalo Aux = this.clonar();
      String mensaje =         
      return
    }
    
    public boolean compara(){
        
    }
    
    public Intervalo interseccion(){
        
    }
    
    public Intervalo intersectacion(){
        
    }
    
    public intervalo invertir(){
        
    }*/
        
    public void doblar(){
        Intervalo aux = this.clonar();
        double incremento = aux.longitud()/2;
        inferior = incremento - this.inferior;
        superior = incremento + this.superior;        
    }
    
    /**
    public void recoger(){
        
    }
    
    public void mostrar(){
        
    }
    
    public Intervalo[] trocear(int trozos){
        
    }
    */
}