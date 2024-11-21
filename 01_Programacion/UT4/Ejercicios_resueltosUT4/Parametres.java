public class Parametres {
    public static void main(String[] args) {
        imprimirNotes("Pere", "Programació", 8.3, 5.1, 8.75, 7.1, 6.9);
        imprimirNotes("Laura", "Sistemes", 9.25, 7.6);
    }

    public static void imprimirNotes(String alumne, String modul, double ...notes){
        System.out.print(alumne + " en el mòdul de " + modul + " té les notes:");
        for(int i=0; i<notes.length; i++){
            System.out.print("\t" + notes[i]);
        }
        System.out.println();
    }


}
