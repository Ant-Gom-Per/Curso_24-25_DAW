/*
Por: Antonio Góme Pérez
 */
import java.util.Scanner;
public class Ejerecicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int votoRegion1,votoRegion2,votoRegion3, votosTotalesPartido1=0, votosTotalesPartido2=0, votosTotalesPartido3=0, contador=1;
        
        System.out.println("-- DATOS DE ELECCIONES --");
        
        while(contador <7){
        
        System.out.println("\nDATOS DE LA REGION " + contador);
        System.out.print("Votos de partido 1: ");
        if(teclado.hasNextInt() && (votoRegion1 = teclado.nextInt()) >=0){
            teclado.nextLine();
            votosTotalesPartido1 += votoRegion1;
          
            
            System.out.print("Votos de partido 2: ");
            if(teclado.hasNextInt() && (votoRegion2 = teclado.nextInt()) >=0){
                teclado.nextLine();
                votosTotalesPartido2 += votoRegion2;
             
                
                System.out.print("Votos de partido 3: ");
                if(teclado.hasNextInt() && (votoRegion3 = teclado.nextInt()) >=0){
                teclado.nextLine();
                votosTotalesPartido3 += votoRegion3;
              
                contador++;
                }else{
                    System.out.println("Error, valor incorrecto");
                }
            }else{
                System.out.println("Error, valor incorrecto");
            }            
        }else{
            System.out.println("Error, valor incorrecto");
            
        }
        }
        
        System.out.println("VOtos partido 1: " + votosTotalesPartido1);
        System.out.println("VOtos partido 2: " + votosTotalesPartido2);
        System.out.println("VOtos partido 2: " + votosTotalesPartido3);
  
    }
    
}
