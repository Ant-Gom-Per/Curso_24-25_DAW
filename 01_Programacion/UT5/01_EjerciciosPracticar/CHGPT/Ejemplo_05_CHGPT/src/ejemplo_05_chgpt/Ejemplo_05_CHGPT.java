/*
 *  Ejercicio 5: Modificar un objeto dentro de un array
    Objetivo: Modificar un objeto dentro de un arreglo de objetos.
    Descripción: Crea una clase Empleado con los atributos nombre y salario. Luego, crea un
    método que reciba un arreglo de objetos Empleado y actualice el salario de un empleado en la
    posición indicada.
 */
package ejemplo_05_chgpt;


public class Ejemplo_05_CHGPT {
    
    //Metodos estáticos
    public static void actualizarSalario(Empleado[] empleados, int indice, double nuevoSalario){
        empleados[indice].salario = nuevoSalario;
    }
  
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[3];//Crea una array con 3 empleados 
        empleados[0] = new Empleado("Carlos", 2000);
        empleados[1] = new Empleado("Laura", 2500);
        empleados[0] = new Empleado("Luis", 2200);
    }
    
    
       

}
    
    

