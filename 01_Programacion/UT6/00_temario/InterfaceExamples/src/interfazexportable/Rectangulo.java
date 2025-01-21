/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazexportable;

class Rectangulo implements Exportable {
    private double base;
    private double altura;
    
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public double getArea() {
        return base * altura;
    }
    
    @Override
    public String exportToXML() {
        return String.format("""
            <rectangulo>
                <base>%.2f</base>
                <altura>%.2f</altura>
                <area>%.2f</area>
            </rectangulo>""", base, altura, getArea());
    }
    
    @Override
    public String exportToJSON() {
        return String.format("""
            {
                "tipo": "rectangulo",
                "base": %.2f,
                "altura": %.2f,
                "area": %.2f
            }""", base, altura, getArea());
    }
}
