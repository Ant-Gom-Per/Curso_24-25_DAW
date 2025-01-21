/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazexportable;

class Alumno implements Exportable {
    private String nombre;
    private int matricula;
    private double promedio;
    
    public Alumno(String nombre, int matricula, double promedio) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.promedio = promedio;
    }
    
    @Override
    public String exportToXML() {
        return String.format("""
            <alumno>
                <nombre>%s</nombre>
                <matricula>%d</matricula>
                <promedio>%.2f</promedio>
            </alumno>""", nombre, matricula, promedio);
    }
    
    @Override
    public String exportToJSON() {
        return String.format("""
            {
                "tipo": "alumno",
                "nombre": "%s",
                "matricula": %d,
                "promedio": %.2f
            }""", nombre, matricula, promedio);
    }
}