/*
 *
 */
package teleut5;

/**
 *
 * @author ciclost
 */
public class TeleUt5 {                        //
    private int canal;                        // Atributos
    private int volumen;                      //
    private boolean encendida;                //
    
    public TeleUt5(){                        //
        canal=1;                             // Constructores
        volumen=0;                           //
        encendida= false;                    //
    }
    
    public void encender(){                                 //
        if(!encendida) encendida=true;                      //
    }                                                       //
                                                            //
    public void apagar(){                                   //
        if(encendida) encendida=false;                      //
    }
    public void subirVolumen(){
        if(encendida && volumen < 100) volumen++;           // Estos son metodos
    }                                                       //
    
    public void bajarVolumen(){
        if(encendida && volumen > 0) volumen--;
    }
    public void subirCanal(){
        if(encendida && canal < 999) canal++;               //
        else canal=1;
    }                                                       //
    public void bajarCanal(){                               //
        if(encendida && canal > 1) canal++;                 //
        else canal=999;
    }
    
    public int getCanal(){                                  //
        return canal;                                       //
    }
     public int getVolumen(){                               // Estos son getters, se usan para hacer pruebas
        return volumen;
    }
      public boolean isEncendida(){
        return encendida;                                   //
    }                                                       //
}
