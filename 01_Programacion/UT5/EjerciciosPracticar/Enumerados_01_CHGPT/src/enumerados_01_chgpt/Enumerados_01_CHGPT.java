/**
 * 1. Crea un enum para los días de la semana:
 * LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO.
 */
package enumerados_01_chgpt;

public class Enumerados_01_CHGPT {

    public static void main(String[] args) {
        
        /**
         *  1.2 En el main, imprime todos los días de la semana utilizando un bucle for y el método values().
         */
        for (Dia dia :Dia.values()){
            System.out.println(dia);
        }
        System.out.println("-----------------------------");
        
        /**
         *  2.2 En el main, compara dos días de la semana (por ejemplo, LUNES y VIERNES) utilizando
            el operador == y imprime el resultado.
         */
        Dia dia01 = Dia.LUNES;
        Dia dia02 = Dia.VIERNES;
        
        if(dia01 == dia02){
            System.out.println("Son el mismo dia.");
        }
        else{
            System.out.println("No son el mismo dia.");
        }
        System.out.println("-----------------------------");
        
        /**
         * 3.2 Imprime el índice (posición) del día MIERCOLES utilizando el método ordinal().
         */
        Dia dia03 = Dia.MIERCOLES;
        System.out.println("El indice del " + dia03 + " es: " +  dia03.ordinal());
        System.out.println("-----------------------------");
        
        /**
         * 4.2 En el main, usa valueOf() para obtener el día JUEVES a partir de su nombre como cadena y luego imprímelo.
         */
        String diaStr = "JUEVES";
        Dia dia04 = Dia.valueOf(diaStr);
        System.out.println("El dia es: " + dia04);
        System.out.println("-----------------------------");        
    }    
}
