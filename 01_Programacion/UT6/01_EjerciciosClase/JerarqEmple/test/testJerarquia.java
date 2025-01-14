
import jerarqemple.EmpleDIrectivo;
import jerarqemple.EmpleOperario;
import jerarqemple.EmpleTecnico;
import jerarqemple.EnpleOficial;
import jerarqemple.JerarqEmple;

/**
 * @author ANtonio
 */
public class testJerarquia {

    public static void main(String[] args) {
        JerarqEmple Emp1 = new JerarqEmple("Rafael");
        EmpleDIrectivo Dir1 = new EmpleDIrectivo("Maria");
        EmpleOperario Oper1 = new EmpleOperario("Alfonso");                                                                           
        EnpleOficial Ofic1 = new EnpleOficial("Laura");
        EmpleTecnico Trab1 = new EmpleTecnico("Paz");
        System.out.println(Emp1);
        System.out.println(Dir1);
        System.out.println(Oper1);
        System.out.println(Ofic1);
        System.out.println(Trab1);
    }   
}
