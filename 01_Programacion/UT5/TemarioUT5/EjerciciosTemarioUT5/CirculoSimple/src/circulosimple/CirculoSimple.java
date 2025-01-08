/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package circulosimple;

/**
 *
 * @author ciclost
 */
//Esto es la Clase
public class CirculoSimple {
    //Atributos
    public double radio;

    //Métodos constructores
    public CirculoSimple(){
        radio = 1;
    }
    public CirculoSimple(double newRadio){
        radio = newRadio;
    }

    // Otros Métodos (Getters y setters)
    public double getArea(){
        return radio * radio * Math.PI;
    }
    public double getPerimetro(){
        return 2 * radio * Math.PI;
    }
    public void setRadio(double newRadio){
        radio = newRadio;
    }
}
