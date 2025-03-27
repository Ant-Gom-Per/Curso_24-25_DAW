/*
Los objetos en Java se pasan por referencia, lo que significa que la 
función puede modificar los atributos del objeto original.
 */
package ra2_ejercicios;

public class Ra2_ejer_pasoPorRef {
    
    public class Persona{
        String nombre;

        public Persona(String nombre) {
            this.nombre = nombre;
        }        
    }

    public static void main(String[] args) {
        Ra2_ejer_pasoPorRef programa = new Ra2_ejer_pasoPorRef();
        programa.inicio();
    }
    
    
    public void inicio(){
        Persona pers01 = new Persona("Benito");
        System.out.println("Antes de llamar a la función: " + pers01.nombre);
        cambNombre(pers01);
        System.out.println("Después de llamar a la función: " + pers01.nombre);
    }
    
    public void cambNombre(Persona pers){
        pers.nombre = "Genaro";
        System.out.println("Dentro de la función: " + pers.nombre);
    }
    
}
