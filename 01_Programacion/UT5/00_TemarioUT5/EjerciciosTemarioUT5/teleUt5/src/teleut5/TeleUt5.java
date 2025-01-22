/*
 *
 */
package teleut5;

/**
 *
 * @author ciclost
 */
public class TeleUt5 {        
    
    // Atributos
    private int canal;                        
    private int volumen;                      
    private boolean encendida;                
    
    // Constructores
    public TeleUt5(){                        
        canal=1;                             
        volumen=0;                           
        encendida= false;                    
    }
    
    // Estos son metodos
    public void encender(){                  
        if(!encendida) encendida=true;                      
    }                                                                                                                  
    public void apagar(){                                   
        if(encendida) encendida=false;                      
    }
    public void subirVolumen(){
        if(encendida && volumen < 100) volumen++;           
    }                                                           
    public void bajarVolumen(){
        if(encendida && volumen > 0) volumen--;
    }
    public void subirCanal(){
        if(encendida && canal < 999) canal++;               
        else canal=1;
    }                                                       
    public void bajarCanal(){                               
        if(encendida && canal > 1) canal++;                 
        else canal=999;
    }
    public void mostrarEstado(){
        System.out.println("El estado de la tele es:");
        System.out.println("Canal: " + canal + "\nVolumen: " + volumen + "\nLa tv esta: " + (encendida? "Encendida":"Apagada"));
    }
    
    // Estos son getters, se usan para hacer pruebas
    public int getCanal(){                                  
        return canal;                                       
    }
     public int getVolumen(){                               
        return volumen;
    }
      public boolean isEncendida(){
        return encendida;                                   
    }                                                       
}
