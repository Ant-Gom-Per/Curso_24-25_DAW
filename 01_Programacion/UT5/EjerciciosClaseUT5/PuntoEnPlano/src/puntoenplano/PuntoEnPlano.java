/*
 * Ejerciocio clase UT5 Punto en el plano.
 */
package puntoenplano;

/**
 * @author Antonio
 */
public class PuntoEnPlano {
    
    //Atributos
    private int X;
    private int Y;
    
    //Constructores
    public PuntoEnPlano(){
        this.X = 0;
        this.Y = 0;
    }
    public PuntoEnPlano(int x, int y){
        this.X = x;
        this.Y = y;        
    }
    
    //Métodos
    public void motrarCuadrante(){
        String cuadrante = "El punto se halla en el ";
        if(X>0 && Y>0) cuadrante += "primer cuadrante";
        else if (X<0 && Y>0) cuadrante += "segundo cuadrante";
        else if (X<0 && Y<0) cuadrante += "tercer cuadrante";
        else if (X>0 && Y<0) cuadrante += "cuarto cuadrante";
        else if (X==0) cuadrante += "eje Y";
        else if (Y==0) cuadrante += "eje X";
        else cuadrante += "centro del eje";
        System.out.println(cuadrante);
        
    }
    
}
