/*
 *  1. Crea un enum llamado Mes con los 12 meses del año.
    2. Asocia a cada mes el número de días que tiene (por ejemplo, ENERO tiene 31 días).
    3. Imprime el nombre del mes y el número de días.
 */
package enumerados_02_chgpt;

public class Enumerados_02_CHGPT {

    public static void main(String[] args) {
        
        for (Mes mes : Mes.values()) {
            System.out.println(mes + " tiene " + mes.getDias() + " dias.");
        }
        System.out.println("-------------------------------------");
        
        
        /**
         *  2. En el main, verifica si un mes, como FEBRERO, tiene más de 30 días e imprime el
            resultado.
         */
        Mes mes = Mes.FEBRERO;
        if(mes.getDias() > 30){
            System.out.println(mes + " tiene más de 30 dias.");
        }
        else{
            System.out.println(mes + " no tiene más de 30 dias.");
        }
        
        
    }
    
}
