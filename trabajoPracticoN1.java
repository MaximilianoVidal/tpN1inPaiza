import java.util.ArrayList;

@Data
@Builder
public class Equipo {
    private String nombre;
    private String fechaCreacion;
    private List<Jugador> jugadores;
    private String entrenador;

    public Equipo(String nombre, String fechaCreacion, String entrenador) {
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.entrenador = entrenador;
        this.jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }
}