package clases;

public class Administrador extends Empleado {

    public Administrador() {
    }

    public Administrador(String dni, String nombres, String apellidos, String password) {
        super(dni, nombres, apellidos, "ADMINISTRADOR", password, "ACTIVO");
    }

    public void crearEmpleado() {}
    public void modificarEmpleado() {}
    public void eliminarEmpleado() {}
    public void registrarHabitacion() {}
    public void eliminarHabitacion() {}
    public void registrarServicio() {}
    public void eliminarServicio() {}
    public void generarInforme() {}
}