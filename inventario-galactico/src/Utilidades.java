public class Utilidades {

    // 1. Intercambia las posiciones de dos elementos en un arreglo
    public static <T> void intercambiar(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // 2. Cuenta cuántas veces aparece un elemento dentro de un arreglo
    public static <T> int contar(T[] arr, T elemento) {
        int contador = 0;
        for (T item : arr) {
            if (item != null && item.equals(elemento)) {
                contador++;
            }
        }
        return contador;
    }

    // 3. Devuelve el elemento máximo de un arreglo
    public static <T extends Comparable<T>> T maximo(T[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        T max = arr[0];
        for (int k = 1; k < arr.length; k++) {
            if (arr[k] != null && arr[k].compareTo(max) > 0) {
                max = arr[k];
            }
        }
        return max;
    }
}