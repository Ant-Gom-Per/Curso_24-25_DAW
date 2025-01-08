/*
 * Ejercicio clase repaso UT5
 */
import trianguloclase.TrianguloClase;
/***
 * @author Antonio
 */
public class TestTrianguloClase {

    public static void main(String[] args) {
        TrianguloClase tri01 = new TrianguloClase(5,4,4);
        System.out.println("El area es: " + tri01.getArea());
        System.out.println("El lado mayor es: " + tri01.getMayor());
        tri01.mostrarTipo();
        
    }
    
}
