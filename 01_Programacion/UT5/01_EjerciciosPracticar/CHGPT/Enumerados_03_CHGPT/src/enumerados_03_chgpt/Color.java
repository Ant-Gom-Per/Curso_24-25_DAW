
package enumerados_03_chgpt;

public enum Color {
    ROJO("#FF0000"), AZUL("#0000FF"), VERDE("00FFOO"), AMARILLO("#FFFF00");
    
    //Atributo
    private final String codigoHex;
    
    //Constructor
    private Color(String codigoHex) {
        this.codigoHex = codigoHex;
    }

    //Método
    public String getCodigoHex() {
        return codigoHex;
    }                    
}
