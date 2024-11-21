public class TestSB {
    public static void main(String[] args) {
        String text1 = "Hola";

        System.out.println("Identitat text1 abans de modificar: " + System.identityHashCode(text1));
        text1 += " món!";
        System.out.println("Identitat text1 després de modificar: " + System.identityHashCode(text1));

        StringBuilder text2 = new StringBuilder("Hola");
       
        System.out.println("Identitat text2 abans de modificar: " + System.identityHashCode(text2));
        text2.append(" món!");
        System.out.println("Identitat text2 després de modificar: " + System.identityHashCode(text2));

        String text3 = "Pepe";

        System.out.println("Identitat de text3: " + System.identityHashCode(text3));
        System.out.print("Identitat de text3 modificat: ");
        System.out.println(System.identityHashCode(text3.replaceFirst("e", "i")));

        StringBuilder text4 = new StringBuilder("Pepe");
        System.out.println("Identitat de text4: " + System.identityHashCode(text4));
        text4.setCharAt(1, 'i');
        System.out.print("Identitat de text4 modificat: ");
        System.out.println(System.identityHashCode(text4));

    }
}
