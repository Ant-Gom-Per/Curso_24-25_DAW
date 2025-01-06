/*
 * Ejercicio cuenta corriente Ut5
 */
package cuentacorriente;

//Clase
public class CuentaCorriente {

    //Atributos
    private String dni;
    public String nombre;
    protected double saldo;
    
    //Constructores
    public CuentaCorriente(String unDni, String unNombre){
        dni = unDni;
        nombre = unNombre;
        saldo = 0.0;
    }
    
    //Metodos
    public void sacarDinero(double valorExtracto){
        if(saldo > valorExtracto){
            saldo = saldo - valorExtracto;
        }
        else{
            System.out.println("Error, no hay saldo suficiente\n-----------------");
        }        
    }    
    public void ingresarDinero(double valorIngreso){
        saldo = saldo + valorIngreso;
    }
    public void verInformacion(){
        System.out.println("Los datos de la cuenta son:\nTitular: " + nombre + "\nDni: " + dni + "\nSaldo: " + saldo);
        System.out.println("-----------------");
    }
    
    
    
}
