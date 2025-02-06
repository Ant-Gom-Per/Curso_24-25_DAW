
package ejemplo_01_chgpt;

public class Ejemplo_01_CHGPT {
    
    public static void cambiarNota(Estudiante estudiante){
        estudiante.nota = 9.5; //Esto cambia nota de estudiante
    }

    public static void main(String[] args) {
        Estudiante est01 = new Estudiante("Benito", 7.0);
        
        est01.mostrarInfo();
        cambiarNota(est01);
        est01.mostrarInfo();
    }
    
}
