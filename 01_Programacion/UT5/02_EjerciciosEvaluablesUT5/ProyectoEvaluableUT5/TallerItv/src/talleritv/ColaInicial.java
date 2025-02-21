
package talleritv;

import java.util.Arrays;

/**
 * @author Antonio Gómez Pérez
 */
public class ColaInicial {
    
    //Atributos
    private Vehiculo[] colaVehiculos;
    
    
    //Constructores
    public ColaInicial(Vehiculo[] colaVehiculos) {
        this.colaVehiculos = colaVehiculos;
    }
       
            
    //Metodos
    public void agregarVehiculo(Vehiculo nuevoVehiculo){
        colaVehiculos = Arrays.copyOf(colaVehiculos, colaVehiculos.length +1);//Creas una copia de colaVehiculos con una posición mas y la asignas a la variable colavehiculos.
        colaVehiculos[colaVehiculos.length -1] = nuevoVehiculo;//Asignas el objeto de tipo vehiculo a la posicion 
    }
    
    
}
