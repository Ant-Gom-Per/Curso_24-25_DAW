/* Incrementamos los valores de las variables en un punto de diferentes formas*/
package javaapplication7;
public class JavaApplication7 {
  
    public static void main(String[] args) {
        final int MULTIPLICANDO = 4;
        int multiplicador = 1;
       
        System.out.println(MULTIPLICANDO * multiplicador);
        multiplicador = multiplicador +1;
        System.out.println(MULTIPLICANDO * multiplicador);
        multiplicador ++;
        System.out.println(MULTIPLICANDO * multiplicador);
        multiplicador += 1;
        System.out.println(MULTIPLICANDO * multiplicador++);
        System.out.println(MULTIPLICANDO * multiplicador);
        System.out.println(MULTIPLICANDO * ++multiplicador);
    }
    
}
