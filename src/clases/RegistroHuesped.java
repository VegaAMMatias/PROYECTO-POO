package clases;

public class RegistroHuesped {

    private Huesped[] array;
    private int size;

    public RegistroHuesped(int capacidadMaxima) {
        array = new Huesped[capacidadMaxima];
        size = 0;
    }

    public void agregar(Huesped c) {
        if (size < array.length) {
            array[size] = c;
            size++;
        }
    }

    // Aquí "id" lo interpretamos como posición/índice
    public void remover(int pos) {
        if (pos < 0 || pos >= size) return;

        for (int i = pos; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = null;
        size--;
    }

    public Huesped iesimo(int pos) {
        if (pos < 0 || pos >= size) return null;
        return array[pos];
    }

    public int getSize() {
        return size;
    }
}