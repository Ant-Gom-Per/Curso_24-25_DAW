/*
 * Ejercicio practicar UT5
 */
import comandapizza.ComandaPizza;
/**Antoniociclost
 */
public class TestComandaPizza {

    public static void main(String[] args) {
        ComandaPizza pizza01 = new ComandaPizza("carbonara", "familiar");
        ComandaPizza pizza02 = new ComandaPizza("Barbacoa", "mediana");
        pizza02.servir();
        ComandaPizza pizza03 = new ComandaPizza("vegetal", "familiar");
        System.out.println(pizza01);
        System.out.println(pizza02);
        System.out.println(pizza03);            
        pizza02.servir();
        
        System.out.println("Total pedidas: " + ComandaPizza.gettotalPedidas());
        System.out.println("Total servidas: " + ComandaPizza.gettotalServidas());
        
        
    }
    
}
