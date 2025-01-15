
package empresagro;

import java.time.LocalDate;

/**
 *
 * @author ciclost
 */
public class EmpresAgro {
    
    //Atributos
    private LocalDate feEnvasado;
    private LocalDate feCaducidad;
    private String numLote;
    private String paisOrig;
    
    //constructor
    public EmpresAgro(LocalDate feEnvasado, LocalDate feCaducidad, String numLote, String paisOrig) {
        this.feEnvasado = feEnvasado;
        this.feCaducidad = feCaducidad;
        this.numLote = numLote;
        this.paisOrig = paisOrig;
    }
    
    //metodos
    public LocalDate getFeEnvasado() {
        return feEnvasado;
    }
    public LocalDate getFeCaducidad() {
        return feCaducidad;
    }
    public String getNumLote() {
        return numLote;
    }
    public String getPaisOrig() {
        return paisOrig;
    }

    public void setFeEnvasado(LocalDate feEnvasado) {
        this.feEnvasado = feEnvasado;
    }

    public void setFeCaducidad(LocalDate feCaducidad) {
        this.feCaducidad = feCaducidad;
    }

    public void setNumLote(String numLote) {
        this.numLote = numLote;
    }

    public void setPaisOrig(String paisOrig) {
        this.paisOrig = paisOrig;
    }

    @Override
    public String toString() {
        return "EmpresAgro{" + "feEnvasado=" + feEnvasado + ", feCaducidad=" + feCaducidad + ", numLote=" + numLote + ", paisOrig=" + paisOrig + '}';
    }
    
    
    
        
}
