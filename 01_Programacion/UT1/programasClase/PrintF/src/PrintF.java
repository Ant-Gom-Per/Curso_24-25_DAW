/*
Realizamos diferentes casos con printf
%d Pone un entero
%f Pone un decimal
%c Pone un caracter
%s Pone un string
\n Hace un salto de linea
\t Hace un tabulado

 */

public class PrintF {
     public static void main(String[] args) {
        final int GB =1000;
        final double TB = GB /1024d;
        System.out.printf("%d GB equivalen a %f TB\n", GB, TB);
        System.out.printf("%d GB equivalen a %.2f TB\n", GB, TB);
        System.out.printf(" ");
        System.out.printf("%c GB equivalen a %s TB\n", 'A', "cOsIcA");
        System.out.printf("%d \"GB\" \tequivalen\t a %f \'TB\'\n", GB, TB);
        System.out.printf("cosa1\n\tcosa2\n\t\tcosa3\n");
    }
    
}
