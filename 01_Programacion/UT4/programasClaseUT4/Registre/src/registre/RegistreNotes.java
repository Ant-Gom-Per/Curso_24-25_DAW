package registre;

import matematicas.Estadisticas;
import matematicas.dias;

public class RegistreNotes {

    public static void main(String[] args) {
        RegistreNotes programa = new RegistreNotes();
        programa.inici();
    }

    public void inici() {
        double[] notes = {2.0, 5.5, 7.25, 3.0, 9.5, 8.25, 7.0, 7.5};
        double max = Estadisticas.calcularMaxim(notes);
        double min = Estadisticas.calcularMinim(notes);
        double mitjana = Estadisticas.calcularMitjana(notes);
        System.out.println("La nota màxima és: " + max + ".");
        System.out.println("La nota mínima és: " + min + ".");
        System.out.println("La mitjana de les notes és : " + mitjana + ".");
        System.out.println(dias.MARTES);

    }

    

}
