package clases;

public class Habitacion {

    private int numero;
    private int capacidadMax;
    private double precioNoche;
    private String tipo;   
    private String estado;

    public Habitacion() {
    }

    public Habitacion(int numero, int capacidadMax, double precioNoche,
                      String tipo, String estado) {
        this.numero = numero;
        this.capacidadMax = capacidadMax;
        this.precioNoche = precioNoche;
        this.tipo = tipo;
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}