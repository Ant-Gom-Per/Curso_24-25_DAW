package piedrapapeltijeras;

import java.util.Scanner;
import java.util.Random;

/**
 * Implementación del juego clásico Piedra, Papel o Tijera. Esta clase permite
 * jugar una partida contra la computadora, donde el usuario selecciona su
 * jugada y la computadora genera una respuesta aleatoria.
 *
 * @author Jose R. Mas
 * @version 1.0
 */
public class PiedraPapelTijeras {

    /**
     * Método principal que ejecuta el juego. Coordina la secuencia de juego
     * obteniendo la jugada del usuario, generando la jugada de la computadora,
     * determinando el ganador y mostrando el resultado.
     *
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        String jugadaUsuario = obtenerJugadaUsuario();
        String jugadaComputadora = generarJugadaComputadora();
        String resultado = determinarGanador(jugadaUsuario, jugadaComputadora);
        mostrarResultado(jugadaUsuario, jugadaComputadora, resultado);
    }

    /**
     * Solicita y valida la jugada del usuario. El método continúa solicitando
     * una entrada hasta que el usuario proporcione una jugada válida (Piedra,
     * Papel o Tijera).
     *
     * @return String que representa la jugada del usuario (puede ser "Piedra",
     * "Papel" o "Tijera")
     */
    public static String obtenerJugadaUsuario() {
        Scanner sc = new Scanner(System.in);
        String jugada;
        do {
            System.out.print("Ingrese su jugada (Piedra/Papel/Tijera): ");
            jugada = sc.nextLine();
        } while (!jugada.equals("Piedra")
                && !jugada.equals("Papel")
                && !jugada.equals("Tijera"));
        return jugada;
    }

    /**
     * Genera una jugada aleatoria para la computadora. Utiliza la clase Random
     * para seleccionar aleatoriamente entre las tres opciones posibles.
     *
     * @return String que representa la jugada de la computadora (puede ser
     * "Piedra", "Papel" o "Tijera")
     */
    public static String generarJugadaComputadora() {
        String[] jugadas = {"Piedra", "Papel", "Tijera"};
        Random rand = new Random();
        return jugadas[rand.nextInt(3)];
    }

    /**
     * Determina el ganador del juego comparando las jugadas. Implementa las
     * reglas del juego: - Piedra vence a Tijera - Papel vence a Piedra - Tijera
     * vence a Papel - Jugadas iguales resultan en empate
     *
     * @param jugadaUsuario la jugada seleccionada por el usuario
     * @param jugadaComputadora la jugada generada por la computadora
     * @return String indicando el resultado ("Empate", "Usuario gana" o
     * "Computadora gana")
     */
    public static String determinarGanador(String jugadaUsuario, String jugadaComputadora) {
        if (jugadaUsuario.equals(jugadaComputadora)) {
            return "Empate";
        }

        if ((jugadaUsuario.equals("Piedra") && jugadaComputadora.equals("Tijera"))
                || (jugadaUsuario.equals("Papel") && jugadaComputadora.equals("Piedra"))
                || (jugadaUsuario.equals("Tijera") && jugadaComputadora.equals("Papel"))) {
            return "Usuario gana";
        }

        return "Computadora gana";
    }

    /**
     * Muestra el resultado final del juego. Imprime las jugadas realizadas por
     * ambos jugadores y el resultado final.
     *
     * @param jugadaUsuario la jugada realizada por el usuario
     * @param jugadaComputadora la jugada realizada por la computadora
     * @param resultado el resultado final del juego
     */
    public static void mostrarResultado(String jugadaUsuario,
            String jugadaComputadora,
            String resultado) {
        System.out.println("Usuario eligió: " + jugadaUsuario);
        System.out.println("Computadora eligió: " + jugadaComputadora);
        System.out.println("Resultado: " + resultado);
    }
}
