/*
Autor: Antonio Gómez Pérez
Este programa nos pide una fecha y nos devuelve el animal del horóscopo chino que le corresponde.
 */
import java.util.Scanner;

public class UT2Problema3 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int anyoNacimiento, anyoAnimal;
        String animal = "";
        
        System.out.print("Introduce el año (dc) para saber el horóscopo chino: ");
        anyoNacimiento = teclado.nextInt();
        teclado.nextLine();
        teclado.close();
        if(anyoNacimiento <= 0){
            System.out.println("ERROR!!, dato no válido.");
        }else{
            anyoAnimal = (anyoNacimiento % 12);
                        
            switch(anyoAnimal){
                case 0:
                    animal = "mono";
                    break;
                case 1:
                    animal = "gallo";
                    break;
                case 2:
                    animal = "perro";
                    break;
                case 3:
                    animal = "cerdo";
                    break;    
                case 4:
                    animal = "rata";
                    break;
                case 5:
                    animal = "buey";
                    break;
                case 6:
                    animal = "tigre";
                    break;
                case 7:
                    animal = "conejo";
                    break;
                case 8:
                    animal = "dragón";
                    break;
                case 9:
                    animal = "serpiente";
                    break;
                case 10:
                    animal = "caballo";
                    break;
                case 11:
                    animal = "cabra";
                    break;
            }
            if(anyoAnimal == 4 || anyoAnimal == 9 || anyoAnimal == 11){
                System.out.println("El animal del horscopo chino es la " + animal);
            }else{
                System.out.println("El animal del horscopo chino es el " + animal);
            }            
        }
    }  
}
