/*
 * 
 * Empleqado para hacer pruebas de los metodos
 */
package teleut5;

/**
 *
 * @author ciclost
 */
public class TestTeleUt5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TeleUt5 tv1 = new TeleUt5();
        TeleUt5 tv2 = new TeleUt5();
        
        tv1.encender();
        tv1.subirVolumen();
        tv1.bajarCanal();
        tv1.mostrarEstado();               
        System.out.println("---------------------------");
        System.out.println(tv1.isEncendida());
        System.out.println(tv1.getCanal());
        System.out.println(tv1.getVolumen());
        System.out.println("\n");
        
        tv2.mostrarEstado();
        System.out.println("---------------------------");
        System.out.println(tv2.isEncendida());
        System.out.println(tv2.getCanal());
        System.out.println(tv2.getVolumen());
    }
    
}
