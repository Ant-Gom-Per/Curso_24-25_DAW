package ejercicio1;

/**
 *
 * @author Rubén Gómez Tenza
 */
public class GestionCuenta {

    public static void main(String[] args) {
        CuentaBancaria c = new CuentaBancaria("Carlos");
        
        try{
            System.out.println("Ingresar -300€:");
            c.ingresar(-300);
        }catch(CantidadInvalidaException e){
            System.out.println("Cantidad inválida");
            System.out.println(e);
        }finally{
            System.out.println("Operación finalizada");
            System.out.println();
        }
        
        try{
            System.out.println("Ingresar 1000.52€:");
            c.ingresar(1000.52);
        }catch(CantidadInvalidaException e){
            System.out.println("Cantidad inválida");
            System.out.println(e);
        }finally{
            System.out.println("Operación finalizada");
            System.out.println();
        }
        
        try{
            System.out.println("Retirar -150€:");
            c.retirar(-150);
        }catch(CantidadInvalidaException e){
            System.out.println("Cantidad inválida");
            System.out.println(e);
        } catch(SaldoInsuficienteException ex){
            System.out.println("Saldo insuficiente");
            System.out.println(ex);
        }finally{
            System.out.println("Operación finalizada");
            System.out.println();
        }
        
        try{
            System.out.println("Retirar 1500€:");
            c.retirar(1500);
        }catch(CantidadInvalidaException e){
            System.out.println("Cantidad inválida");
            System.out.println(e);
        } catch(SaldoInsuficienteException ex){
            System.out.println("Saldo insuficiente");
            System.out.println(ex);
        }finally{
            System.out.println("Operación finalizada");
            System.out.println();
        }
        
        try{
            System.out.println("Retirar 980.41€:");
            c.retirar(980.41);
        }catch(CantidadInvalidaException e){
            System.out.println("Cantidad inválida");
            System.out.println(e);
        } catch(SaldoInsuficienteException ex){
            System.out.println("Saldo insuficiente");
            System.out.println(ex);
        }finally{
            System.out.println("Operación finalizada");
            System.out.println();
        }
    }
    
}
