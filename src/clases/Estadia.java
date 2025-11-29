package clases;

public class Estadia {

    private String codigo;          // id de la estadía
    private Huesped huesped;
    private Habitacion habitacion;
    private String fechaCheckIn;
    private String fechaCheckOut;
    private Consumo[] consumos;
    private String estado;          

    public Estadia() {
    }

    public Estadia(String codigo, Huesped huesped, Habitacion habitacion,String fechaCheckIn, String fechaCheckOut, int maxConsumos, String estado) {
        this.codigo = codigo;
        this.huesped = huesped;
        this.habitacion = habitacion;
        this.fechaCheckIn = fechaCheckIn;
        this.fechaCheckOut = fechaCheckOut;
        this.estado = estado;
        this.consumos = new Consumo[maxConsumos];
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public String getFechaCheckIn() {
        return fechaCheckIn;
    }

    public void setFechaCheckIn(String fechaCheckIn) {
        this.fechaCheckIn = fechaCheckIn;
    }

    public String getFechaCheckOut() {
        return fechaCheckOut;
    }

    public void setFechaCheckOut(String fechaCheckOut) {
        this.fechaCheckOut = fechaCheckOut;
    }

    public Consumo[] getConsumos() {
        return consumos;
    }

    public void setConsumos(Consumo[] consumos) {
        this.consumos = consumos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean agregarConsumo(Consumo c) {
        if (consumos == null) return false;
        for (int i = 0; i < consumos.length; i++) {
            if (consumos[i] == null) {
                consumos[i] = c;
                return true;
            }
        }
        return false; 
    }

    public double calcularTotalServicios() {
        double total = 0.0;
        if (consumos != null) {
            for (int i = 0; i < consumos.length; i++) {
                if (consumos[i] != null) {
                    total += consumos[i].getSubtotal();
                }
            }
        }
        return total;
    }

    public double calcularTotalHabitacion(int noches) {
        if (habitacion == null) {
            return 0.0;
        }
        return noches * habitacion.getPrecioNoche();
    }

    public double calcularTotal(int noches) {
        return calcularTotalHabitacion(noches) + calcularTotalServicios();
    }
}