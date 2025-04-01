/*
Este programa simula el sistema se alquiler de un videobank.
Si se alquilan 2 o más peliculas se aplica un descuento del 10%
 */
package ra2_ejercicios;

import java.util.Scanner;

public class Ra2_propuesta {

    public static void main(String[] args) {
        Ra2_propuesta programa = new Ra2_propuesta();
        programa.inicio();
        
    }
    
    public void inicio(){
        double alquiler = 2.99;
        String[] peliculas = {"Regreso al futuro",
                              "El bueno, el feo y el malo",
                              "Terminator",
                              "Rocky",
                              "El Gran Torino"};
        
        mostrarCont(peliculas,alquiler);
        precioAlquiler(sacPelis(peliculas), alquiler);        
        mostrarCont(peliculas, alquiler);        
    }   
    
    /**
     * Muestra el contenido del menú principal.
     * @param peliculas: Es el vector con valores dentro.
     * @param alquiler: Coste del alquiler de una pelicula.
     */
    public void mostrarCont(String[] peliculas, double alquiler){
        System.out.println("Precio por pelicula: " + alquiler);
        System.out.println("Titulos disponibles:");
        for(int i = 0; i < peliculas.length ;i++){
            System.out.println((i+1) + ".- " + peliculas[i]); 
        }        
        System.out.println(" ");
    }
    
      /**
     * Permite cambiar un objeto por otro dentro del vector.
     * @param peliculas: Es el vector con valores dentro.
     */
    public void cambObj(String[] peliculas){
        Scanner teclado =new Scanner(System.in);
        System.out.print("Indica el número de pelicula a alquilar: ");
        int numero = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Has sacado la película: " + peliculas[numero-1]);
       /** System.out.print("Indica el nuevo artículo a introducir: ");**/
        String articulo = peliculas[numero-1] + " (En alquiler)";
        peliculas[numero-1] = articulo;
    }
    
       /**
     * Pregunta si/no para seguir con el programa.
     * @return Seguir: Devuelve un booleano empleado como semáforo.
     */
    public boolean contProg(){
        Scanner teclado =new Scanner(System.in);
        boolean seguir ;
        System.out.print("Quieres sacar otra pelicula? No = 0, Si = 1: ");
        int numero = teclado.nextInt();
        if(numero == 0){
            seguir = false;
        }else{
            seguir = true;
        }
        return seguir;
    }
    
    /**
     * Este metodo permite sacar peliculas y modifica el vector.
     * @param peliculas: Es el vector con valores dentro.
     * @return: Devuelve la cantidad de peliculas alquiladas
     */
    public int sacPelis(String[] peliculas){
        int seguir = 0 ;
        do{            
            cambObj(peliculas);            
            seguir ++;
            if(seguir >= 5) break;
        }while(contProg());
        return seguir;
    }
    
    /**
     * Este metodo calcula el precio del alquiler en funcion a la cantidad de peliculas.
     * @param cantPelis: cantidad de peliculas seleccionadas
     * @param precioAlqui: Precio del alquiler 
     */
    public void precioAlquiler(int cantPelis, double precioAlqui){        
        System.out.println("\nCantidad de peliculas: " + cantPelis);
        if(cantPelis >= 2){
            double descuento = precioAlqui * 10/100;
            System.out.printf("Descuento por película: %.2f\n",descuento);
            precioAlqui = (precioAlqui - descuento);
            System.out.printf("Precio por pelicula: %.2f\n",precioAlqui);
            double precioTotAlqui = (precioAlqui - descuento) * cantPelis;
            System.out.printf("Coste del aquiler: %.2f\n\n",precioTotAlqui);
        }else{
            System.out.println("Coste alquiler: " + precioAlqui * cantPelis + " \n");
        }
    }    
}
