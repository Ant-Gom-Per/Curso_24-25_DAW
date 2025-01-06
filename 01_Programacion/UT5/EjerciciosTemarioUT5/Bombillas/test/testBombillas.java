/*
 *  ejercicio UT5_3
 */
import bombillas.Bombillas;
public class testBombillas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bombillas bomb1 = new Bombillas();
        Bombillas bomb2 = new Bombillas();
        
        bomb1.encender();
        bomb2.apagar();
        
        System.out.println("Interruptor general Encendido");
        System.out.println("La bombilla 1 esta: " + bomb1.mostrarResultado());
        System.out.println("La bombilla 2 esta: " + bomb2.mostrarResultado());
        
        Bombillas.apagarGeneral();
        System.out.println("\n---------------------------\nInterruptor general Apagado");
        System.out.println("La bombilla 1 esta: " + bomb1.mostrarResultado());
        System.out.println("La bombilla 2 esta: " + bomb2.mostrarResultado());
        
        Bombillas.encenderGeneral();
        System.out.println("\n---------------------------\nInterruptor general Encendido");
        
        bomb1.apagar();
        bomb2.encender();
        System.out.println("La bombilla 1 esta: " + bomb1.mostrarResultado());
        System.out.println("La bombilla 2 esta: " + bomb2.mostrarResultado());
    }
    
}
