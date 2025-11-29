package clases;

public class RegistroProducto {

    private Producto[] array;
    private int size;

    public RegistroProducto(int capacidadMaxima) {
        array = new Producto[capacidadMaxima];
        size = 0;
    }

    public void agregar(Producto p) {
        if (size < array.length) {
            array[size] = p;
            size++;
        }
    }

    public void remover(int id) {
        int pos = ubicacion(id);
        if (pos != -1) {
            for (int i = pos; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            array[size - 1] = null;
            size--;
        }
    }

    public Producto iesimo(int pos) {
        if (pos < 0 || pos >= size) return null;
        return array[pos];
    }

    public int ubicacion(int id) {
        for (int i = 0; i < size; i++) {
            if (array[i] != null && array[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public int getSize() {
        return size;
    }
}