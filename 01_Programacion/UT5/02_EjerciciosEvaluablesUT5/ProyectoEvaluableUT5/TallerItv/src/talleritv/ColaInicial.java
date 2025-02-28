
package talleritv;

import java.util.Arrays;

/**
 * @author Antonio Gómez Pérez
 */
public class ColaInicial {
    
    //Atributos
    private Vehiculo[] colaVehiculos;    
    
    
    //Constructores
    public ColaInicial() {        
        this.colaVehiculos = new Vehiculo[0];        
    }
    
                 
    //Metodos
    public void agregarVehiculo(Vehiculo nuevoVehiculo){        
        colaVehiculos = Arrays.copyOf(colaVehiculos, colaVehiculos.length +1);//Creas una copia de colaVehiculos con una posición mas y la asignas a la variable colavehiculos.       
        colaVehiculos[colaVehiculos.length -1] = nuevoVehiculo;//Asignas el objeto de tipo vehiculo a la posicion        
    }
    
    public void sacarVehiculo(){
        Vehiculo colaVehiculosAux = colaVehiculos[0]; //Guardas el primer vehiculo en una variable auxiliar
        colaVehiculos = Arrays.copyOfRange(colaVehiculos, 1, colaVehiculos.length); //Haces una copia de la Array si la posicion 0
        System.out.println("\nSacado: " + colaVehiculosAux);
    }
    
    public boolean colaVacia(){
        boolean vacia=false;
        if(colaVehiculos.length == 0) vacia = true;        
        return vacia;//Este true or flase se emplea en futuros procesos
    }
    
    public void mostrarVehiculos(){
        System.out.print("Vehiculos en la cola:\n----------------------");
        for(int i=0 ; i < colaVehiculos.length ; i++){
            System.out.println(colaVehiculos[i]);
        }       
    }
    
    public boolean contieneMatricula(String matricula){
        boolean contiene = false;
        for(int i=0 ; i < colaVehiculos.length ; i++){            
           if(matricula.equals(colaVehiculos[i].getMatricula())) contiene =true;//Los String se comparan con .equals
        }
        return contiene;//Este true or flase se emplea en futuros procesos        
    }        
}
