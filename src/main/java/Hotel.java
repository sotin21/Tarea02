import java.util.ArrayList;
import java.util.List;
class Hotel {
    private List<Habitacion> habitaciones;
    private List<Reserva> reservas;

    public Hotel() {
        this.habitaciones = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
        reserva.getHabitacion().setEstado("reservada");
    }

    public List<Habitacion> buscarHabitacionesPorEstado(String estado) {
        List<Habitacion> habitacionesEncontradas = new ArrayList<>();
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getEstado().equals(estado)) {
                habitacionesEncontradas.add(habitacion);
            }
        }
        return habitacionesEncontradas;
    }

    public List<Reserva> buscarReservasPorCliente(Cliente cliente) {
        List<Reserva> reservasEncontradas = new ArrayList<>();
        for (Reserva reserva : reservas) {
            if (reserva.getCliente().equals(cliente)) {
                reservasEncontradas.add(reserva);
            }
        }
        return reservasEncontradas;
    }

    public void cancelarReserva(Reserva reserva) {
        reservas.remove(reserva);
        reserva.getHabitacion().setEstado("disponible");
    }
}
