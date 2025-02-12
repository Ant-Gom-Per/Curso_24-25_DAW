
package ut8_caja;

public class Pareja<T1,T2> {
    private T1 izquierdo;
    private T2 derecho;

    public Pareja(T1 izquierdo, T2 derecho) {
        this.izquierdo = izquierdo;
        this.derecho = derecho;
    }

    @Override
    public String toString() {
        return "Pareja<"+ izquierdo.getClass().getSimpleName() + "," + derecho.getClass().getSimpleName() + ">{" + "izquierdo=" + izquierdo + ", derecho=" + derecho + '}';
    }
    
    
    
}
