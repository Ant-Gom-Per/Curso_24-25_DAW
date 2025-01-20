/*
 * Ejercicio practicar UT5
 */
package numcomplejos;

/**
 * @author Antonio
 */
public class NumComplejos {
    
    //Atributos
    private double real;
    private double imaginario;
    
    
    //Constructores
    public NumComplejos(){
        this(0,0);
    }
    
    public NumComplejos(double real, double imaginario){
        this.real=real;
        this.imaginario=imaginario;
    }    
    
    
    //Métodos
    public double getReal(){
        return real;
    }
    
    public double getImaginario(){
        return imaginario;
    }
    
    public void setReal(double real){
        this.real=real;
    }
    
    public void setImaginaria(double imaginario){
        this.imaginario=imaginario;
    }       
    
    public NumComplejos sumar(NumComplejos b){
        return new NumComplejos(this.real + b.real, this.imaginario + b.imaginario);
    }
    
    public NumComplejos producto(NumComplejos b){
        return new NumComplejos(this.real * b.real - this.imaginario * b.imaginario, this.real * b.imaginario + this.imaginario * b.real);
    }
    
    @Override
    public String toString(){
        return real + " + " + imaginario + "i";
    }
}
