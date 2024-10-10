/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

public class UT2Problema3 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int anyoNacimiento;
        String animal = "";
        
        System.out.print("Introduce tu año de nacimiento: ");
        anyoNacimiento = teclado.nextInt();
        teclado.nextLine();
        if(anyoNacimiento <= 0){
            System.out.println("ERROR!!, dato no válido.");
        }else{
          while(anyoNacimiento > 11){
              anyoNacimiento -= 12;              
          }
            switch(anyoNacimiento){
                case 0:
                    animal = "Rata";
                    break;
                case 1:
                    animal = "Buey";
                    break;
                case 2:
                    animal = "Tigre";
                    break;
                case 3:
                    animal = "Conejo";
                    break;    
                case 4:
                    animal = "Dragón";
                    break;
                case 5:
                    animal = "Serpiente";
                    break;
                case 6:
                    animal = "Caballo";
                    break;
                case 7:
                    animal = "Cabra";
                    break;
                case 8:
                    animal = "Mono";
                    break;
                case 9:
                    animal = "Gallo";
                    break;
                case 10:
                    animal = "Perro";
                    break;
                case 11:
                    animal = "Cerdo";
                    break;
            }
            System.out.println("El animal de tu horscopo chino es: " + animal);
        }
    }  
}
