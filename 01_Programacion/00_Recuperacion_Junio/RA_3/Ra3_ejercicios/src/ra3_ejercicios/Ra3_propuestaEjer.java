/*
 * Propuesta de ejercicio para repaso de Ra3.
   Este ejercicio reune todos los elementos del la Ut2 e incluye elementos de la Ut7
 */
package ra3_ejercicios;

import java.util.Scanner;

public class Ra3_propuestaEjer {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        //Variables
        int altTri = 0, opcion = 0;
        final char ESPACIO = ' ', ASTERISCO = '*';
        boolean seguir = true, seguir2 =false;
        String continuar = "n";
        
        while(seguir){            
            System.out.println("**********************************");        
            System.out.println("**        Elige una opción      **");
            System.out.println("**********************************");
            System.out.println("** 1.- Triángulo a la izquierda **");
            System.out.println("** 2.- Triángulo a la derecha   **");
            System.out.println("** 3.- Triángulo Equilatero     **");
            System.out.println("**********************************");

            //Seleccion de opciones con control de entrada de datos
            do{
                try{
                    System.out.print("Elige una opcion: ");
                    opcion = Integer.parseInt(teclado.nextLine());
                    if(opcion < 1 || opcion > 3){
                        System.out.println("Error, seleciona un opción de la lista.");
                    }else{
                        seguir = false; 
                    }
                }catch(NumberFormatException e){
                    System.out.println("Error, el dato introducico no es válido");
                }
            }while(seguir);

            //Selección de la altura del triangulo con control de datos
            System.out.print("-----------------------\n¿Que altura quieres que tenga el triángulo? ");
            while(!teclado.hasNextInt() || (altTri = teclado.nextInt()) < 0){
                System.out.println("Error, esa altura no es válida.");
                System.out.print("-----------------------\n¿Que altura quieres que tenga el triángulo? ");
                teclado.nextLine();
            }
            teclado.nextLine();

            switch(opcion){
                case 1:
                    for(int i=0 ; i<altTri ; i++){
                        for(int j=0 ; j<=i ; j++){
                            System.out.print(ASTERISCO);
                        }
                        System.out.println("");
                    }
                    System.out.println("");
                    break;                                     
                    
                case 2:
                    for(int i=0 ; i<altTri ; i++){
                        for(int j=altTri ; j>i ;j--){
                            System.out.print(ASTERISCO);
                        }
                        System.out.println("");
                    }
                    System.out.println("");
                    break;
                case 3:
                    for(int i=0 ; i<altTri ;i++){
                        for(int j=altTri-1 ; j>i ; j--){
                            System.out.print(ESPACIO);
                        }
                        for(int k=0 ; k<=i ; k++){
                            System.out.print(ASTERISCO);
                        }
                        for(int l=0 ; l<i ; l++){
                            System.out.print(ASTERISCO);
                        }
                        System.out.println("");
                    }
                    System.out.println("");
            }
            do{
                try{
                    System.out.print("¿Quieres continuar s/n? ");
                    continuar = teclado.nextLine();
                    if(continuar.equalsIgnoreCase("s")){
                        seguir = true;
                        seguir2 = false;
                    }else if(continuar.equalsIgnoreCase("n")){
                        System.out.println("Fin del programa...");
                        seguir = false;
                        seguir2 = false;
                    }else{
                        throw new Ra3_InvalidSNexceptio();
                    }
                }catch(Ra3_InvalidSNexceptio e){
                    seguir2 = true;
                    System.out.println("-----------------------\nError, debe introducir s ó n");
                }finally{
                    System.out.println("");
                }
            }while(seguir2);            
        }
        teclado.close();
    }    
}
