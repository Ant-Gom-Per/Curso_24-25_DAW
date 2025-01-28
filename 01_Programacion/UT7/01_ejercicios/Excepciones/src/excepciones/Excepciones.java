/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepciones;

/**
 *
 * @author ciclost
 */
public class Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            int[] datos ={1, 7, 3};
            System.out.println(datos[3]); //Esto da un array index out of bounce
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("posicion invalida");
            e.printStackTrace();//Esto muestra el error, pero es peligrosillo
        }
        System.out.println("continua el programa...");
        //LAs excepciones explicitas te obligan a meterlas en un try-catch
    }
    
    
    
}
