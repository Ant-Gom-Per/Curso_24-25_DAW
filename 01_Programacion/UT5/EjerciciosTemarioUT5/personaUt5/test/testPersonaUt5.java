/*
 * Practica 3 temario UT5
 */
import personaut5.PersonaUt5;
/**
 *
 * @author Antonio
 */
public class testPersonaUt5 {

    public static void main(String[] args) {
        PersonaUt5 persona1 = new PersonaUt5("44765422Q","Antonio", 45);
        PersonaUt5 persona2 = new PersonaUt5("11223344A","Josefa", 35);        
       
        persona1.visualizar();
        persona2.visualizar();
    }
    
}
