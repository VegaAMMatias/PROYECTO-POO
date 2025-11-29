package clases;

public class Producto {

    private int id;
    private String nombre;
    private double pu;  
    private int stock;

    public Producto() {
    }

    public Producto(int id, String nombre, double pu, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.pu = pu;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPu() {
        return pu;
    }

    public void setPu(double pu) {
        this.pu = pu;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return id + " - " + nombre + " (S/ " + pu + ", stock=" + stock + ")";
    }
}