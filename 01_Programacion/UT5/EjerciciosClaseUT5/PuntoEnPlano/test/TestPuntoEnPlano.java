/*
 * Ejerciocio clase UT5 Punto en el plano.
 */
import puntoenplano.PuntoEnPlano;
/**
 * @author Antonio
 */
public class TestPuntoEnPlano {

    public static void main(String[] args) {
        PuntoEnPlano punt00 = new PuntoEnPlano(5, 4);
        PuntoEnPlano punt01 = new PuntoEnPlano(-5, 4);
        PuntoEnPlano punt02 = new PuntoEnPlano(-5, -4);
        PuntoEnPlano punt03 = new PuntoEnPlano(5, -4);
        PuntoEnPlano punt04 = new PuntoEnPlano();
        PuntoEnPlano punt05 = new PuntoEnPlano(0,4);
        PuntoEnPlano punt06 = new PuntoEnPlano(5,0);
        
        punt00.motrarCuadrante();
        punt01.motrarCuadrante();
        punt02.motrarCuadrante();
        punt03.motrarCuadrante();
        punt04.motrarCuadrante();
        punt05.motrarCuadrante();
        punt06.motrarCuadrante();
        
    }
    
}
