/*
consigna: crea un programa para guardar una serie de artículos enuna consigna automática. 
primero seleccionamos el tamaño que queremos de consigna, el numero de artículos a guardar.
Introduciendo el numero asignado al artículo guardado, podemos sacarlo de la consigna y almacenar otro en su lugar.
El coste de almacenaje por articulo es fijo, pero varía si almacenas más de 3 artículos. 
Cada vez que almacenas un nuevo artículo se te cobra el coste.
Al final de su uso se te pasa el total de la factura.
 */
package ra2_ejercicios;

import java.util.Scanner;

public class Ra2_propuesta {

    public static void main(String[] args) {
        Ra2_propuesta programa = new Ra2_propuesta();
        programa.inicio();
        
    }
    
    public void inicio(){
        
        String[] consigna = new String[numObjet()];
        llenaConsig(consigna.length, consigna);
        mostrarCont(consigna);        
        do{
            System.out.print("\n¿Quieres cambiar algún objeto? ");
            if(contProg()){
                cambObj(consigna);
                mostrarCont(consigna);
            }
            System.out.print("¿Quieres continuar con el programa? ");
        }while(contProg());        
        System.out.println("Programa finalizado.");
        
        
        
        
       
        System.out.println("\nnumObjet guardados: " + consigna.length);
        System.out.println("Array" + java.util.Arrays.toString(consigna));
    }
    
    
    
    
   
    
    
    
    /**
     * Asigna un tamaño a un vector.
     * @return Devuelve el tamaño del vector que vamos a crear
     */
    public int numObjet(){
        Scanner teclado =new Scanner(System.in);
        System.out.print("Ingresa un número de artículos a guardar: ");
        int numObjet = teclado.nextInt();
        teclado.nextLine();
        return numObjet;
    }    
    /** 
     * Llena el vector vacío que hemos creado
     * @param tamanyo: Hace referencia al tamaño del vector que hemos creado. 
     * @param consigna Es el vector vacío que hemos creado
     */
    public void llenaConsig(int tamanyo, String consigna[]){
        System.out.println(" ");
        for(int i =0; i < tamanyo; i++){
            Scanner teclado =new Scanner(System.in);
            System.out.print("Ingresa el nombre de " + (i+1) + " de "+ tamanyo + " artículos: ");
            consigna[i] = teclado.nextLine();
        }
    }
    /**
     * Muestra el vector que hemos llenado.
     * @param consigna: Es el vector con valores dentro.
     */
    public void mostrarCont(String[] consigna){
        System.out.println("Tienes almacenados:");
        for(int i = 0; i < consigna.length ;i++){
            System.out.println((i+1) + ".-" + consigna[i]); 
        }        
    }
    /**
     * Permite cambiar un articulo por otro dentreo del vector.
     * @param consigna: Es el vector con valores dentro.
     */
    public void cambObj(String[] consigna){
        Scanner teclado =new Scanner(System.in);
        System.out.print("Indica el número de artículo a sacar: ");
        int numero = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Indica el nuevo artículo a introducir: ");
        String articulo = teclado.nextLine();
        consigna[numero-1] = articulo;
    }
    /**
     * Pregunta si/no para seguir con algo o no
     * @return Seguir: Devuelve un booleano, empleado como semáforo.
     */
    public boolean contProg(){
        Scanner teclado =new Scanner(System.in);
        boolean seguir ;
        System.out.print("No = 0, Si = 1: ");
        int numero = teclado.nextInt();
        if(numero == 0){
            seguir = false;
        }else{
            seguir = true;
        }
        return seguir;
    }
    
    
}
