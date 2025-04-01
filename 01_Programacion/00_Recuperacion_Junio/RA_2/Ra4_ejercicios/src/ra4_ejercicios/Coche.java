/*
Crea una clase llamada coche con los siguientes atributos:
marca, modelo, año y velocidad
Incluye los siguientes métodos:
acelerar, frenar, mostrarInformación
*/
package ra4_ejercicios;

public class Coche {
    
    //Atributos
    private String marca;
    private String modelo;
    private int anyo;
    private int velocidad;  
    
    //Constructores    
    public Coche (String marca, String modelo, int anyo){
        this.marca = marca;
        this.modelo = modelo;
        this.anyo = anyo;
        this.velocidad = 0;
    }    
    
    
    //Metodos
    public void acelerar(int incremento){
        velocidad += incremento;
        System.out.println("El coche acelera a " + velocidad + " Km/h.");
    }
    
    public void frenar(int decremento){
        velocidad = Math.max(0, velocidad - decremento);
        System.out.println("El coche ha frenado hasta " + velocidad + " Km/h.");
    }
    
    public void mostrarInfo(){
        System.out.println("Datos del vehículo:\nMarca: " + marca + 
                           "\nModelo: " + modelo + 
                           "\nAño: " + anyo);
    }
}
/**
 * Coche vehi01 = new Coche("Pontiac", "Firebird", 1982);
        vehi01.mostrarInfo();
        vehi01.acelerar(50);
        vehi01.frenar(30);
        vehi01.frenar(25);  
 */