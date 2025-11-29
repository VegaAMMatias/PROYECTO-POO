package clases;

public class SupervisorVentas extends Empleado {

    public SupervisorVentas() {
    }

    public SupervisorVentas(String dni, String nombres, String apellidos) {
        super(dni, nombres, apellidos, "SUPERVISOR_VENTAS");
    }

    public void registrarVenta() {
    }
}