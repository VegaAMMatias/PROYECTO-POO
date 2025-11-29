package clases;

public class Recepcionista extends Empleado {

    public Recepcionista() {
    }

    public Recepcionista(String dni, String nombres, String apellidos, String password) {
        super(dni, nombres, apellidos, "RECEPCIONISTA", password, "ACTIVO");
    }

    public void registrarHuesped() {}
    public void modificarHuesped() {}
    public void eliminarHuesped() {}
    public void crearReservacion() {}
    public void modificacionReservacion() {}
    public void eliminarReservacion() {}
    public void checkIn() {}
    public void checkOut() {}
    public void registrarConsumo() {}
    public double calcularFactura() { return 0.0; }
}