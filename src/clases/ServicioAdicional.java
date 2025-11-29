package clases;

public class ServicioAdicional {

    private String nombre;
    private double precio;
    private String estado;

    public ServicioAdicional() {
    }

    public ServicioAdicional(String nombre, double precio) {
        this(nombre, precio, "ACTIVO");
    }

    public ServicioAdicional(String nombre, double precio, String estado) {
        this.nombre = nombre;
        this.precio = precio;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}