/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazexportable;

/**
 *
 * @author josem
 */
public class Test {

    public static void main(String[] args) {
        Exportable[] elementos = new Exportable[3];

        elementos[0] = new Pizza("Margherita", 12.99);
        elementos[1] = new Alumno("Juan Pérez", 1001, 8.5);
        elementos[2] = new Rectangulo(10.5, 5.2);

        System.out.println("=== Exportación XML ===");
        for (Exportable elemento : elementos) {
            System.out.println(elemento.exportToXML());
            System.out.println();
        }

        System.out.println("\n=== Exportación JSON ===");
        for (Exportable elemento : elementos) {
            System.out.println(elemento.exportToJSON());
            System.out.println();
        }
    }
}
