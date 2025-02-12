
package ut8_caja;

/**
 *
 * @author ciclost
 */
public class Caja <T>{
    //Atributos
    private T dato;

    //Constructores
    public Caja(T dato) {
        this.dato = dato;
    }

    //Metodos
    @Override
    public String toString() {
        return "Caja<"+ dato.getClass().getSimpleName() + ">{" + "dato=" + dato + '}';
    }
    
    public <U> Pareja<T,U> combinarCon(U otroDato){
        return new Pareja<>(this.dato, otroDato);
    }
    
     public <U> Pareja<T,U> combinarCon(Caja<U>otraCaja){
        return new Pareja<>(this.dato, otraCaja.dato);
    }
    
    
    
    
}
