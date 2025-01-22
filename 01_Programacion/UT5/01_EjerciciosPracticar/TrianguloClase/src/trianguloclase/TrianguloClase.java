/*
 * Ejercicio clase repaso UT5
 */
package trianguloclase;

/**
 * @author Antonio
 */
public class TrianguloClase {
    
    //Atributos
    private double A;
    private double B;
    private double C;
    
    //Contructures
    public TrianguloClase(double a, double b, double c){
        this.A = a;
        this.B = b;
        this.C = c;
    }
    
    //Métodos
    public double getMayor(){
        return Math.max(A, Math.max(B,C));
    }
    public double getArea(){
        double semiperimetro = (A+B+C)/2;
        return Math.sqrt(semiperimetro * (semiperimetro - A) * (semiperimetro - B) * (semiperimetro - C));
    }
    public void mostrarTipo(){
        String respuesta = "El triangulo es del tipo: ";
        if(A == B && B == C) respuesta += "Equilatero";
        else if(A == B || A == C || B == C) respuesta += "Escaleno";
        else respuesta += "Isósceles";
        System.out.println(respuesta);
    }    
}
