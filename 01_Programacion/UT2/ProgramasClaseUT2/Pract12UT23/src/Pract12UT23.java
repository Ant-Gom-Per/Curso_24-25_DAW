/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ciclost
 */
public class Pract12UT23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int dividendo = 10, divisor = 2, resto = 0;
        while(dividendo >= divisor){
            resto = dividendo - divisor;
            dividendo = resto;
        }
        System.out.println(resto);
        
    }
    
}
