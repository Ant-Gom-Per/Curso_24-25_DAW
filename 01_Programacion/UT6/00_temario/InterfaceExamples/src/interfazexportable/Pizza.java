/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazexportable;

class Pizza implements Exportable {
    private String nombre;
    private double precio;
    
    public Pizza(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    @Override
    public String exportToXML() {
        return String.format("""
            <pizza>
                <nombre>%s</nombre>
                <precio>%.2f</precio>
            </pizza>""", nombre, precio);
    }
    
    @Override
    public String exportToJSON() {
        return String.format("""
            {
                "tipo": "pizza",
                "nombre": "%s",
                "precio": %.2f
            }""", nombre, precio);
    }
}