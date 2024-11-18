/*
Banco de pruebas para desarrollar programas
secreta[posPalabra].charAt(posLetra -1)
palabra.equals(palabraSecreta)

 */

import java.util.Scanner;
public class BancoDePruebas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        boolean resultado = false;
        //int puntos=1;
        //int[] arrayPuntos = new int[puntos];
        int numAleat = (int)(Math.random()*10);                         // creo numero aleatorio  
         
        String palaIntrod = " ";        
        String[] palabrSecr = {"perro", "gaviota", "rana", "abeja", "serpiente", "atun", "cangrejo", "escolopendra", "almeja", "tarantula"};
        String[] resp1 = {"mamífero", "ave", "anfibio", "insecto", "reptil", "pez", "crustaceo", "miriápodo", "molusco", "aracnido"};
        
        
        
       
        
        
        int cantLetras = palabrSecr[numAleat].length();                 // cuento numero de letras d la palabra elegida
        char[] letrasPalSecr = new char[cantLetras];                    // array para almacenar letras del tamano d la palabra eleguida
        for (int i = 0; i < palabrSecr[numAleat].length(); i++) {       //
             letrasPalSecr[i] += palabrSecr[numAleat].charAt(i);   //Cuento el numero de letras de la palabra secreta y las guardo 1 a 1 en una array                  
        }                                                               //
        System.out.println(" ");                                      //
        
        
        System.out.println("animal: " + palabrSecr[numAleat]);          // comprobacion
        
        System.out.print("El animal secreto es: ");                 //inicio
        for (int i = 0; i < cantLetras; i++) {
            System.out.print("_ ");
        }
        System.out.print("\nIntroduce palabra: ");                      //
        palaIntrod = teclado.next();                                    //
        int cantLetras2 = palaIntrod.length();                          // cuento numero de lteras d la palabra introducida
        char[] letrasPalIntrod = new char[cantLetras2];                 //        
        for (int i = 0; i < palaIntrod.length(); i++) {                 //
             letrasPalIntrod[i] += palaIntrod.charAt(i);           //Cuento el numero de letras de la palabra introducida y las guardo 1 a 1 en una array                  
        }                                                               //
        System.out.println(" ");                                      //
        
        
        if(!palabrSecr[numAleat].equals(palaIntrod)){
            if(cantLetras == cantLetras2){                                                 //// if palabra secreat != palabra elegida
                for (int i = 0; i < palabrSecr[numAleat].length(); i++) {                  //
                    if(letrasPalSecr[i] == (letrasPalIntrod[i])){                          // Comparo letras e impromo la letra si coincide y un guion si no
                        System.out.print(palabrSecr[numAleat].charAt(i) + " ");       //          
                    }else{                                                                 //
                        System.out.print("_ ");                                          //
                    }                                                                      //
                }
            }else{
                System.out.println("Error, no tiene la misma cantidad letras");
            }
        }else{            
            resultado = true;
        }
        
        //resultado = palabrSecr[numAleat].equals(palaIntrod);// // if palabra secreat == palabra elegida resultado=true
        
        System.out.println("\n--------------------------------------------------");
        System.out.println("aleatorio: " + numAleat);
        System.out.println("animal: " + palabrSecr[numAleat]);
        System.out.println("Tamaño palabra: "  + cantLetras);
        System.out.println("tipo: " + resp1[numAleat]);
        System.out.print("palabra: ");
        for (int i = 0; i < palabrSecr[numAleat].length(); i++) {
            System.out.print(letrasPalSecr[i] + " ");                       
        }
        System.out.println("\n--------------------------------------------------");
        System.out.println("palaIntrod: " + palaIntrod);
        System.out.println("cantLetras2: " + cantLetras2);
        System.out.print("palabra2: ");
        for (int i = 0; i < palaIntrod.length(); i++) {
            System.out.print(letrasPalIntrod[i] + " ");                       
        }
        System.out.println("\nresultado: " + resultado);
       boolean pase = true;
        while(pase){
            
        }
        
        
        teclado.close();
    }
    
}
