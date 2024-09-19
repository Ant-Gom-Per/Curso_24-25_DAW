/*
Creamos la tabla de la verdad del operador OR
 */

public class TablaOr {
    public static void main(String[] args) {
    
        System.out.println("A\tB\tA||B");
        System.out.println(false + "\t" + false + "\t" + (false||false));
        System.out.println(false + "\t" + true + "\t" + (false||true));
        System.out.println(true + "\t" + false + "\t" + (true||false));
        System.out.println(true + "\t" + true + "\t" + (true||true));
        System.out.println(" ");
        boolean A = false;
        boolean B = false;
        System.out.println("A" + "\t" + "B" + "\t" + "A||B");
        System.out.println(A + "\t" + B + "\t" + (A||B));
        B=true;
        System.out.println(A + "\t" + B + "\t" + (A||B));
        A=true;
        B=false;
        System.out.println(A + "\t" + B + "\t" + (A||B));
        B=true;
        System.out.println(A + "\t" + B + "\t" + (A||B));      
    }
    
}
