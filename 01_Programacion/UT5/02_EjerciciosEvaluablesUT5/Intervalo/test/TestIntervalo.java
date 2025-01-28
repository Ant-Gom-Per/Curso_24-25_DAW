/*
 * problema evaluable 2 UT5
 */
import intervalo.Intervalo;
/**
 *
 * @author ciclost
 */
public class TestIntervalo {

    public static void main(String[] args) {
        Intervalo val01 = new Intervalo();
        Intervalo val02 = new Intervalo(3.5, 7.8);
        Intervalo val03 = null;
        Intervalo val04 = new Intervalo(12);
        
       
       System.out.println("valor01: " + val01.longitud());
       
       val01.mover(3);
       
       System.out.println("Valor02: " + val02.longitud());
       
       val03=val02.clonar();//CLonamos los valores de val02 en val03
       
       System.out.println("valor03: " + val03.longitud());
       
       System.out.println("valor01: " + val01.longitud());
       System.out.println("Inferior: " + val01.getInferior());
       System.out.println("Superior: " + val01.getSuperior());
       
       System.out.println("incluido: " + val01.incluido(15));
       
       System.out.println("valor04: " + val04.longitud());
       
       val04.doblar();
       
       System.out.println("valor04: " + val04.longitud());
    }
    
}
