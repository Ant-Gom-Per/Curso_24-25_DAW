
package ejemplo_01_chgpt;

public class Estudiante {
    
    //Atributos
    public String nombre;
    public double nota;
    
    //Constructores
    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    
    
    //Metodos
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre + " ,Nota; " + nota);//Muestra nota de estudiante
    }        
}
