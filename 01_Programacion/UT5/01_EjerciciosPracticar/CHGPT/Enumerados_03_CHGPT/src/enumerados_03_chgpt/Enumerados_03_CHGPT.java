/*
 *  1. Crea un enum llamado Color que contenga los colores ROJO, AZUL, VERDE, AMARILLO
    y sus respectivos códigos hexadecimales.
    2. En el main, imprime el nombre del color junto con su código hexadecimal.
 */
package enumerados_03_chgpt;

public class Enumerados_03_CHGPT {

    public static void main(String[] args) {
        for(Color color : Color.values()){
            System.out.println(color + " tiene el valor hexadecimal: " + color.getCodigoHex());
        }
    }
    
}
