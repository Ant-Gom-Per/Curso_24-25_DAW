
package talleritv;

import java.util.Arrays;

/**
 * @author Antonio Gómez Pérez
 */
public class ColaInicial {
    
    //Atributos
    private Vehiculo[] colaVehiculos;
    private int capacidad;
    
    
    //Constructores
    public ColaInicial(int capacidad) {
        this.colaVehiculos = new Vehiculo[capacidad];
        capacidad = 0;
    }
       
            
    //Metodos
    public void agregarVehiculo(Vehiculo nuevoVehiculo){
        if(capacidad == colaVehiculos.length){            
            colaVehiculos = Arrays.copyOf(colaVehiculos, colaVehiculos.length +1);//Creas una copia de colaVehiculos con una posición mas y la asignas a la variable colavehiculos.
        }
        colaVehiculos[colaVehiculos.length -1] = nuevoVehiculo;//Asignas el objeto de tipo vehiculo a la posicion 
        capacidad++;
    }

    @Override
    public String toString() {
        return "ColaInicial{" + "colaVehiculos=" + colaVehiculos + ", capacidad=" + capacidad + '}';
    }
    
    

    
    
    
    
}
