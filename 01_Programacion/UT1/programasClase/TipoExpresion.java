/* En este programa imprimimos por pantalla el resultado de una expresión
5 > 2 + 4 * 3 != 9 / 2 < 1 || true && 4 == 1
5 > 2 + 12 != 4 < 1 || true && 4 == 1
5 > 14 != 4 < 1 || true && 4 == 1
false != false || true && false
false || true && false
false || false
false
*/

public class TipoExpresion{
    public static void main(String[] args){
        System.out.println(5 > 2 + 4 * 3 != 9 / 2 < 1 || true && 4 == 1);
    }
}
