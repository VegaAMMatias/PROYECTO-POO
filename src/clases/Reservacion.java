package clases;

public class Reservacion {

    private String codigo;
    private Huesped huesped;
    private String tipoHabitacion;
    private String fechaInicio; 
    private String fechaFin;
    private Habitacion habitacionAsignada; 
    private String estado; 

    public Reservacion() {
    }

    public Reservacion(String codigo, Huesped huesped, String tipoHabitacion,
                       String fechaInicio, String fechaFin, String estado) {
        this.codigo = codigo;
        this.huesped = huesped;
        this.tipoHabitacion = tipoHabitacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
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

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Habitacion getHabitacionAsignada() {
        return habitacionAsignada;
    }

    public void setHabitacionAsignada(Habitacion habitacionAsignada) {
        this.habitacionAsignada = habitacionAsignada;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}