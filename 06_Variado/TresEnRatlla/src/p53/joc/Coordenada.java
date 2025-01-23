package p53.joc;

public class Coordenada {
    //Atributos
    int fila;
    int columna;
    final Interval LIMITS;
    
    //Constructores
    public void vacio(){
        this.fila=0;
        this.columna=0;        
    }
    
    public void completo(int fila, int columna){
        this.fila=fila;
        this.columna=columna;
    }
    
    //Metodos
    public int getFila(){
        return fila;
    }
    
    public int getColumna(){
        return columna;
    }
    
}
