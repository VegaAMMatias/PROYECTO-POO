package clases;

public class SistemaHotel {

    private Empleado[] empleados;
    private Habitacion[] habitaciones;
    private Huesped[] huespedes;
    private ServicioAdicional[] servicios;
    private Reservacion[] reservaciones;
    private Estadia[] estadias;
    
    public SistemaHotel() {
    empleados = new Empleado[100];
    habitaciones = new Habitacion[100];
    huespedes = new Huesped[100];
    servicios = new ServicioAdicional[100];
    reservaciones = new Reservacion[100];
    estadias = new Estadia[100];
}

    public SistemaHotel(int maxEmpleados, int maxHabitaciones, int maxHuespedes,
                        int maxServicios, int maxReservas, int maxEstadias) {

        empleados = new Empleado[maxEmpleados];
        habitaciones = new Habitacion[maxHabitaciones];
        huespedes = new Huesped[maxHuespedes];
        servicios = new ServicioAdicional[maxServicios];
        reservaciones = new Reservacion[maxReservas];
        estadias = new Estadia[maxEstadias];

        Administrador admin = new Administrador("60798034", "Carlos", "Romero", "Administrador");
        admin.setPassword("Innova123");
        Recepcionista recep = new Recepcionista("10631903", "Hugo", "Vera", "Recepcionista");
        recep.setPassword("Ulima235");

        empleados[0] = admin;
        empleados[1] = recep;
    }

        public Empleado buscarEmpleado(String dni) {
        for (Empleado e : empleados) {
            if (e != null && e.getDni().equals(dni)) {
                return e;
            }
        }
        return null;
    }
        
    public Empleado autenticarEmpleado(String dni, String password) {
    if (empleados == null) {
        return null;
    }

    for (Empleado emp : empleados) {
        if (emp != null
                && emp.getDni().equals(dni)
                && emp.getPassword() != null
                && emp.getPassword().equals(password)) {
            return emp; 
        }
    }
    return null; 
}
    
    public boolean agregarEmpleado(Empleado e) {
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i] == null) {
                empleados[i] = e;
                return true;
            }
        }
        return false;
    }

    public Empleado buscarEmpleadoPorDni(String dni) {
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i] != null && empleados[i].getDni().equals(dni)) {
                return empleados[i];
            }
        }
        return null;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public boolean agregarHuesped(Huesped h) {
        for (int i = 0; i < huespedes.length; i++) {
            if (huespedes[i] == null) {
                huespedes[i] = h;
                return true;
            }
        }
        return false;
    }

    public Huesped buscarHuespedPorDni(String dni) {
        for (int i = 0; i < huespedes.length; i++) {
            if (huespedes[i] != null && huespedes[i].getDni().equals(dni)) {
                return huespedes[i];
            }
        }
        return null;
    }

    public Huesped[] getHuespedes() {
        return huespedes;
    }

    public boolean agregarHabitacion(Habitacion h) {
        for (int i = 0; i < habitaciones.length; i++) {
            if (habitaciones[i] == null) {
                habitaciones[i] = h;
                return true;
            }
        }
        return false;
    }

    public Habitacion[] getHabitaciones() {
        return habitaciones;
    }

    public boolean agregarServicio(ServicioAdicional s) {
        for (int i = 0; i < servicios.length; i++) {
            if (servicios[i] == null) {
                servicios[i] = s;
                return true;
            }
        }
        return false;
    }

    public ServicioAdicional[] getServicios() {
        return servicios;
    }

    public boolean agregarReservacion(Reservacion r) {
        for (int i = 0; i < reservaciones.length; i++) {
            if (reservaciones[i] == null) {
                reservaciones[i] = r;
                return true;
            }
        }
        return false;
    }

    public Reservacion[] getReservaciones() {
        return reservaciones;
    }

    public boolean agregarEstadia(Estadia e) {
        for (int i = 0; i < estadias.length; i++) {
            if (estadias[i] == null) {
                estadias[i] = e;
                return true;
            }
        }
        return false;
    }

    public Estadia[] getEstadias() {
        return estadias;
    }
}





