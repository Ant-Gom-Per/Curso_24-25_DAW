
package ejemplo_05_chgpt;

public class Empleado {
    
    //Atributos
    public String nombre;
    public double salario;
    
    
    //Constructores
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    
    
    //Metodos
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre + ", Salario: " + salario);
    }                      
}
