package clases;

public class Factura {

    private String id;
    private Estadia estadia;
    private double total;
    private String detalles;

    public Factura() {
    }

    public Factura(String id, Estadia estadia, String detalles) {
        this.id = id;
        this.estadia = estadia;
        this.detalles = detalles;
        this.total = 0.0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Estadia getEstadia() {
        return estadia;
    }

    public void setEstadia(Estadia estadia) {
        this.estadia = estadia;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public double calcularTotal(int noches) {
        if (estadia == null) {
            total = 0.0;
        } else {
            total = estadia.calcularTotal(noches);
        }
        return total;
    }
}