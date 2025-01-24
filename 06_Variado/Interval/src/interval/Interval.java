package interval;

class Interval {

    private double inferior;
    private double superior;

    /**
     * Proporciona un interval amb els límits inferior i superior que li donem
     * @param inferior
     * @param superior 
     */
    public Interval(double inferior, double superior) {
       
    }

    /**
     * Proporciona un interval amb límit superior que li donem
     * @param superior 
     */
    public Interval(double superior) {
      
    }

    /**
     * Proporciona un interval a partir d'un altre (copia)
     * @param interval 
     */
    public Interval(Interval interval) {
        
    }

    /**
     * Proporciona un interval amb límits per defecte.
     */
    public Interval() {
        
    }

    /**
     * Clona l'interval
     * @return 
     */
    public Interval clone() {
        return null;
    }

    /**
     * Longitud de l'interval
     * @return 
     */
    public double longitud() {
       return 0.;
    }

    /**
     * Mou els límits de l'interval segons el que indiquem
     * @param moviment 
     */
    public void moure(double moviment) {
       
    }

    /**
     * Obtiene l'interval mogut segons el moviment proporcionat
     * @param moviment
     * @return 
     */
    public Interval mogut(double moviment) {
        return null;
    }

    /**------------------------------------------------------------------
     * Determina si el valor está dintre de l'interval
     * @param valor
     * @return 
    */
    public boolean inclou(double valor) {
        return false;
    }
    

    /**
     * Determina si l'interval proporcionat está inclòs en l'interval
     * @param interval
     * @return 
     */
    public boolean inclou(Interval interval) {
       return false;
    }

    /**
     * Determina si dos intervals són iguals
     * @param interval
     * @return 
     */
    public boolean equals(Interval interval) {
        return false;
    }

    /**
     * Obté l'interval que intersecta
     * @param interval
     * @return 
     */
    public Interval interseccio(Interval interval) {
        return null;
    }

    /**
     * Determina si un interval intersecta amb el nostre
     * @param interval
     * @return 
     */
    public boolean intersecta(Interval interval) {
        return false;
    }

    /**
     * Transforma l'interval en el seu oposat.
     */
    public void oposar() {
        
    }

    /**
     * Augmenta la grandària de l'interval al doble de la seua longitud (ha de creixer igual pels dos extrems).
     */
    public void doblar() {
       
    }

    /**
     * Demana a l'usuari que introduïsca els límits de l'interval
     */
    public void recollir() {
       
    }

    /** Mostra l'interval amb el format [limitInferior, limitSuperior].
     * 
     */
    public void mostrar() {
        
    }

    /**
     * Obté els subintervals en grandàries iguals segons els trossos proporcionats
     * @param trossos
     * @return 
     */
    public Interval[] trossejar(int trossos) {
        return null;
    }

   

}
