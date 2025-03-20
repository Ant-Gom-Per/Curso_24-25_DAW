/*
Tienes una lista de empleados, cada uno con los atributos nombre (String), edad (int) y salario (double). Realiza las siguientes operaciones utilizando Streams:

Filtra los empleados cuya edad sea mayor de 30 años.
Ordena los empleados filtrados por salario en orden ascendente.
Limita el resultado a los primeros 3 empleados.
Muestra por pantalla el nombre y el salario de cada empleado resultante
 */
import java.util.*;
import java.util.stream.*;

public class Ut9_ejercStreams {
    public static void main(String[] args) {
        record Empleado(String nombre, int edad, double salario) {}

        List<Empleado> empleados = List.of(
            new Empleado("Ana", 28, 3000),
            new Empleado("Luis", 35, 4000),
            new Empleado("Marta", 32, 3500),
            new Empleado("Pedro", 45, 5000),
            new Empleado("Sofía", 38, 4500)
        );

        empleados.stream()
                .filter(e -> e.edad() > 30)
                .sorted(Comparator.comparingDouble(Empleado::salario))
                .limit(3)
                .forEach(e -> System.out.println("Nombre: " + e.nombre() + ", salario " + e.salario()));
        
    }
}

