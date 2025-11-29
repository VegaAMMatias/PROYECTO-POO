package clases;

public class Venta {

    private int id;
    private String fechaVenta; 
    private Huesped huesped;
    private Producto producto;
    private int cantidad;

    public Venta() {
    }

    public Venta(int id, String fechaVenta, Huesped huesped, Producto producto, int cantidad) {
        this.id = id;
        this.fechaVenta = fechaVenta;
        this.huesped = huesped;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double calcularPrecioTotal() {
        if (producto == null) return 0.0;
        return cantidad * producto.getPu();
    }

    @Override
    public String toString() {
        return "Venta " + id + " - " + huesped + " - " + cantidad + " x " + producto;
    }
}