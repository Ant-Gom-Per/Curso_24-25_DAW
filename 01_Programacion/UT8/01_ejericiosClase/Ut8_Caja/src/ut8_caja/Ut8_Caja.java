
package ut8_caja;

public class Ut8_Caja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caja<Persona> cajaPersona = new Caja<>(new Persona("Adolfo", 22));
        System.out.println(cajaPersona);
        Caja<Double> cajaDouble = new Caja<>(5.75);
        System.out.println(cajaDouble);
        
        Pareja<Persona, Double> personaNota = cajaPersona.combinarCon(cajaDouble);
        System.out.println(personaNota);
        
    }
    
}
