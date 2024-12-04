/*
 * Este programa trabaja con una estructura de datos llamada cola. Una cola es una estructura FIFO (first in first out) en el que añadimos elementos por el finaly los sacamos por el frente.
 */

public class Ejercicio1UT4 {
    public static void main(String[] args) {
        Ejercicio1UT4 programa = new Ejercicio1UT4();
        programa.inicio();
    }

    public void inicio() {
        inicializarCola();
        encolar();
        desencolar();
        System.out.println(mostrarCola());
    }
    
    /**
     * Devuelve una cola. (array de Strings) inicial sin elementos.
     * @return 
     */
    public String[] inicializarCola(){
        String[] nombres = {"pepe", "carla", "juan", "maria"};
        return nombres;
    }
    /**
     * Devuelve una cola. resultante de añadir un elemento nuevo al al cola que le indicamos.
     * @return 
     */
    public String[] encolar(){
        String[] anyadir = {"pedro", "liliana"};
        return anyadir;        
    }
    
    /**
     * Devuelve una cola. resultante de sacar de la cola que le indoquemos un unico elemento. Solo lo hace mientras en la cola queden elementos. Muestra el mensaje "cola vacía" si no quedan elementos.
     * @return 
     */
    public String[] desencolar(){
        String[] quitar ={};
        return quitar;
    }
    
    /**
     * Muestra por pantalla. los elementos de la cola indicada.
     * @return 
     */
    public String mostrarCola(){
        String algo = " algo";
        return algo;
    }
    
}
