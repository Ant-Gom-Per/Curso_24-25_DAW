/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exempleinterficies3;

public class Persona implements Operable {
    private String nomComplet;
    private int edat;

    public Persona(String nomComplet, int edat) {
        this.nomComplet = nomComplet;
        this.edat = edat;
    }

    public int getEdat() {
        return edat;
    }
    

    @Override
    public String toString() {
        return "Persona{" + "nomComplet=" + nomComplet + ", edat=" + edat + '}';
    }

    @Override
    public double sumar(Operable altre) {
        return this.getValor() + altre.getValor();
    }

    @Override
    public double restar(Operable altre) {
        return this.getValor() - altre.getValor();
    }

    @Override
    public double getValor() {
        return this.getEdat();
    }
    
    
    
}
