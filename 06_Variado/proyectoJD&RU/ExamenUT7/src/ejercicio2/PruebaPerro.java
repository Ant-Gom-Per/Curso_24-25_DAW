package ejercicio2;

/**
 *
 * @author Rubén Gómez Tenza
 */
public class PruebaPerro {

    public static void main(String[] args) {
        
        try{
            Perro p1 = new Perro("L", 5);
            p1.imprimir();
        }catch(NombreInvalidoException e){
            System.out.println("Nombre inválido");
            System.out.println(e);
        } catch(EdadNegativaException ex){
            System.out.println("Edad negativa");
            System.out.println(ex);
        }finally{
            System.out.println();
        }
        
        try{
            Perro p2 = new Perro ("Elvis", -3);
            p2.imprimir();
        }catch(NombreInvalidoException e){
            System.out.println("Nombre inválido");
            System.out.println(e);
        } catch(EdadNegativaException ex){
            System.out.println("Edad negativa");
            System.out.println(ex);
        }finally{
            System.out.println();
        }
        
        try{
            Perro p3 = new Perro ("Thor", 7);
            p3.imprimir();
            p3.setNombre("Lu");
            p3.imprimir();
        }catch(NombreInvalidoException e){
            System.out.println("Nombre inválido");
            System.out.println(e);
        } catch(EdadNegativaException ex){
            System.out.println("Edad negativa");
            System.out.println(ex);
        }finally{
            System.out.println();
        }
        
        try{
            Perro p4 = new Perro ("Chispas", 9);
            p4.imprimir();
            p4.setEdad(-2);
            p4.imprimir();
        }catch(NombreInvalidoException e){
            System.out.println("Nombre inválido");
            System.out.println(e);
        } catch(EdadNegativaException ex){
            System.out.println("Edad negativa");
            System.out.println(ex);
        }finally{
            System.out.println();
        }
        
        try{
            Perro p5 = new Perro ("Boo", 3);
            p5.imprimir();
            p5.setNombre("Zeus");
            p5.imprimir();
            p5.setEdad(4);
            p5.imprimir();
        }catch(NombreInvalidoException e){
            System.out.println("Nombre inválido");
            System.out.println(e);
        } catch(EdadNegativaException ex){
            System.out.println("Edad negativa");
            System.out.println(ex);
        }finally{
            System.out.println();
        }
        
        try{
            Perro[] perros = new Perro [5];
            perros[6] = new Perro("Perla", 12);
        }catch(NombreInvalidoException e){
            System.out.println("Nombre inválido");
            System.out.println(e);
        } catch(EdadNegativaException ex){
            System.out.println("Edad negativa");
            System.out.println(ex);
        } catch(Exception exc){
            System.out.println("Excepcion");
            System.out.println(exc);
        }finally{
            System.out.println();
        }
        
    }
    
}
