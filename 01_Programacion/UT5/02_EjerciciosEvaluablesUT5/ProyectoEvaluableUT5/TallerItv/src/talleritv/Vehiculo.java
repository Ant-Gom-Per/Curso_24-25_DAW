
package talleritv;

/**
 * @author Antonio Gómez Pérez
 */

public class Vehiculo {
    
    //Atributos
    private String matricula;
    private String modelo;
    private final TipoVehiculo tipoVehiculo;
    
    
    //Constructores 
    public Vehiculo(String matricula, String modelo, TipoVehiculo tipoVehiculo) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.tipoVehiculo = tipoVehiculo;
    }
    
    
    //Metodos
    public void validaMatricula(){
        if (matricula.matches("\\d{4}[A-Z]{3}")){
            this.matricula = matricula;
            System.out.println("La matricula " + matricula + " es correcta.");
        }
        else{
            System.out.println("La matricula " + matricula + " no es válida.");
        }
    }

    public String getMatricula() {
        return matricula;
    }   
    
    public void tipoPorIndice(TipoVehiculo tipo){
         if(tipo.equals(tipoVehiculo)){
             System.out.println("Su número es: " + tipoVehiculo.ordinal());
         }
        
    }
    

    @Override
    public String toString() {
        return "El vehiculo tiene:\nMatricula: " + matricula + "\nModelo: " + modelo + "\nTipo: " + tipoVehiculo;
    }
    
    
    
    
    
    
    
}
