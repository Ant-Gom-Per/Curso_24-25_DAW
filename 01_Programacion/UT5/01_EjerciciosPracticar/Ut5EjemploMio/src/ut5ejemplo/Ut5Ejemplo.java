
package ut5ejemplo;

public class Ut5Ejemplo {

    public static void main(String[] args) {
        
        Alumno alu01 = new Alumno();
        Alumno alu02 = new Alumno(25, "Pepe", "Villuela");
        Coche car01 = new Coche ("Seat", "Ibiza", 150368.5, 1995);
        Coche car02 = new Coche();
        
        System.out.println("El id del alumno 2 es: " + alu02.getId());
        System.out.println("El nombre del alumno 2 es: " + alu02.getNombre());
        System.out.println("El apellido del alumno 2 es: " + alu02.getApellido());
        
        alu01.setId(14);
        alu01.setNombre("Benito");
        alu01.setApellido("Camelas");
        
        System.out.println("----------------------------------------");
        
        System.out.println("El id del alumno 1 es: " + alu01.getId());
        System.out.println("El nombre del alumno 1 es: " + alu01.getNombre());
        System.out.println("El apellido del alumno 1 es: " + alu01.getApellido());
        
        System.out.println("----------------------------------------");
        
        System.out.println("Marca: " + car01.getMarca());
        System.out.println("Modelo: " +car01.getModelo());
        System.out.println("Kilometros: " + car01.getKilometros());
        System.out.println("Año: " + car01.getAnyos());
        
        System.out.println("----------------------------------------");
        
        car02.setMarca("Citroen");
        car02.setKilometros(194861.3);
        
        System.out.println("Marca: " + car02.getMarca());
        System.out.println("Modelo: " +car02.getModelo());
        System.out.println("Kilometros: " + car02.getKilometros());
        System.out.println("Año: " + car02.getAnyos());
    }    
}
