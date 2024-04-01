import java.util.List;
public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        hotel.agregarHabitacion(new Habitacion("simple"));
        hotel.agregarHabitacion(new Habitacion("doble"));
        hotel.agregarHabitacion(new Habitacion("suite"));

        Cliente cliente1 = new Cliente("Sebastian Soto");
        Cliente cliente2 = new Cliente("Arturo Vidal");

        hotel.agregarReserva(new Reserva(cliente1, hotel.buscarHabitacionesPorEstado("disponible").get(0)));
        hotel.agregarReserva(new Reserva(cliente2, hotel.buscarHabitacionesPorEstado("disponible").get(1)));

        System.out.println("Reservas:");
        for (Reserva reserva : hotel.buscarReservasPorCliente(cliente1)) {
            System.out.println(reserva);
        }

        List<Reserva> reservasCliente2 = hotel.buscarReservasPorCliente(cliente2);
        if (!reservasCliente2.isEmpty()) {
            hotel.cancelarReserva(reservasCliente2.get(0));
            System.out.println("Reserva cancelada para " + cliente2.getNombre());
        } else {
            System.out.println("No se encontraron reservas para " + cliente2.getNombre());
        }
    }
}