/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepciones2;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ciclost
 */
public class Excepciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(Path.of("/home/ciclost/Curso_24-25_DAW/01_Programacion/UT7/01_ejercicios/archivo.txt"));
            input.nextLine();
            System.out.println(input.nextLine());
        } catch (IOException ex) {
            System.out.println("Error, archivo no encontrado");
        }
    }
    
}
