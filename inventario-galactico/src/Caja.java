public class Caja<T extends Comparable<T>> {
    private Object[] elementos;
    private int cantidad;
    private static final int Capacidad_Maxima = 4;

    public Caja() {
        this.elementos = new Object[Capacidad_Maxima];
        this.cantidad = 0;
    }

    public void agregar(T elemento) {
        if (cantidad >= Capacidad_Maxima) {
            throw new IllegalStateException("La caja está llena. Máximo " + Capacidad_Maxima + " elementos.");
        }
        elementos[cantidad] = elemento;
        cantidad++;
    }

    public T obtenerMayor() {
        if (cantidad == 0) {
            throw new IllegalStateException("La caja está vacía.");
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

    public T obtenerMenor() {
        if (cantidad == 0) {
            throw new IllegalStateException("La caja está vacía.");
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