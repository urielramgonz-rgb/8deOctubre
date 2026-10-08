public class Caja<T extends Comparable<T>> {
    private Object[] elementos;
    private int cantidad;
    private static final int CAPACIDAD_MAXIMA = 4;

    @SuppressWarnings("unchecked")
    public Caja() {
        this.elementos = new Object[CAPACIDAD_MAXIMA];
        this.cantidad = 0;
    }

    public void agregar(T elemento) {
        if (cantidad >= CAPACIDAD_MAXIMA) {
            throw new IllegalStateException("La caja está llena. No se pueden agregar más de " + CAPACIDAD_MAXIMA + " elementos.");
        }
        elementos[cantidad] = elemento;
        cantidad++;
    }

    @SuppressWarnings("unchecked")
    public T obtenerMayor() {
        if (cantidad == 0) {
            throw new IllegalStateException("La caja está vacía. No se puede obtener el elemento mayor.");
        }

        T mayor = (T) elementos[0];
        for (int i = 1; i < cantidad; i++) {
            T actual = (T) elementos[i];
            if (actual.compareTo(mayor) > 0) {
                mayor = actual;
            }
        }
        return mayor;
    }

    @SuppressWarnings("unchecked")
    public T obtenerMenor() {
        if (cantidad == 0) {
            throw new IllegalStateException("La caja está vacía. No se puede obtener el elemento menor.");
        }

        T menor = (T) elementos[0];
        for (int i = 1; i < cantidad; i++) {
            T actual = (T) elementos[i];
            if (actual.compareTo(menor) < 0) {
                menor = actual;
            }
        }
        return menor;
    }

    public int getCantidad() {
        return cantidad;
    }
}