
package ut5ejemplo;

public class Coche {
    
    //Atributos
    String marca;
    String modelo;
    double kilometros;
    int anyos;
    
    
    //Consstructores
    public Coche() {
    }
     
    public Coche(String marca, String modelo, double kilometros, int anyos) {
        this.marca = marca;
        this.modelo = modelo;
        this.kilometros = kilometros;
        this.anyos = anyos;
    }
    
    
    //Metodos

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getKilometros() {
        return kilometros;
    }

    public void setKilometros(double kilometros) {
        this.kilometros = kilometros;
    }

    public int getAnyos() {
        return anyos;
    }

    public void setAnyos(int anyos) {
        this.anyos = anyos;
    }    
}
