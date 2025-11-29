package clases;

public class Consumo {

    private ServicioAdicional servicio;
    private int cantidad;

    public Consumo() {
    }

    public Consumo(ServicioAdicional servicio, int cantidad) {
        this.servicio = servicio;
        this.cantidad = cantidad;
    }

    public ServicioAdicional getServicio() {
        return servicio;
    }

    public void setServicio(ServicioAdicional servicio) {
        this.servicio = servicio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        if (servicio == null) {
            return 0.0;
        }
        return servicio.getPrecio() * cantidad;
    }
}